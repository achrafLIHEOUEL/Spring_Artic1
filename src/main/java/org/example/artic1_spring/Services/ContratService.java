package org.example.artic1_spring.Services;


import org.example.artic1_spring.Repository.ContratRepository;
import org.example.artic1_spring.entities.Contrat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ContratService implements IContratService {

    @Autowired
    ContratRepository cr;

    @Override
    public Contrat ajouterContrat(Contrat contrat) {
        return cr.save(contrat);
    }

    @Override
    public Contrat modifierContrat(Contrat contrat) {
        return cr.save(contrat);
    }

    @Override
    public void supprimerContrat(Long idContrat) {
        cr.deleteById(idContrat);
    }

    @Override
    public List<Contrat> listContrats() {
        return cr.findAll();
    }

    @Override
    public Contrat recupererContrat(Long idContrat) {
        return cr.findById(idContrat).orElse(null);
    }
}
