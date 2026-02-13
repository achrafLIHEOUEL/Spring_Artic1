package org.example.artic1_spring.Services;

import org.example.artic1_spring.entities.Sponsor;

import java.util.List;

public interface ISponsorService {
    Sponsor ajouterSponsor(Sponsor sponsor);

    List<Sponsor> ajouterSponsors(List<Sponsor> sponsors);

    Sponsor modifierSponsor(Sponsor sponsor);

    void supprimerSponsor (Long idSponsor);

    List<Sponsor> listSponsors();

    Sponsor recupererSponsor(Long idSponsor);

    Boolean archiverSponsor(Long idSponsor);
}
