package org.example.artic1_spring.Services;

import org.example.artic1_spring.Repository.SponsorRepository;
import org.example.artic1_spring.entities.Sponsor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class SponsorService implements ISponsorService {

    @Autowired
    SponsorRepository sp;

    @Override
    public Sponsor ajouterSponsor(Sponsor sponsor) {
        sponsor.setDateCreation(LocalDate.now());
        sponsor.setArchived(Boolean.FALSE);
        sponsor.setBloquerContrat(Boolean.FALSE);
        return sp.save(sponsor);
    }

    @Override
    public List<Sponsor> ajouterSponsors(List<Sponsor> sponsors) {
        sponsors.forEach(sponsor -> {  // boucle sur chaque sponsor
            sponsor.setDateCreation(LocalDate.now());
            sponsor.setArchived(Boolean.FALSE);
            sponsor.setBloquerContrat(Boolean.FALSE);
        });
        return sp.saveAll(sponsors);
    }

    @Override
    public Sponsor modifierSponsor(Sponsor sponsor) {
        sponsor.setDateDerniereModification(LocalDate.now());
        return sp.save(sponsor);
    }

    @Override
    public void supprimerSponsor(Long idSponsor) {
        sp.deleteById(idSponsor);
    }

    @Override
    public List<Sponsor> listSponsors() {
        return sp.findAll();
    }

    @Override
    public Sponsor recupererSponsor(Long idSponsor) {
        return sp.findById(idSponsor).orElse(null);
    }

    @Override
    public Boolean archiverSponsor(Long idSponsor) {
        Sponsor sponsor= sp.findById(idSponsor).orElse(null);
        sponsor.setArchived(Boolean.TRUE);
        sp.save(sponsor);
        return sponsor.getArchived();

    }
}

