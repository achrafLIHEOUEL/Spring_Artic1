package org.example.artic1_spring.Services;

import org.example.artic1_spring.Repository.DetailRepository;
import org.example.artic1_spring.entities.DetailChampionnat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DetailService implements IDetailService {

    @Autowired
    DetailRepository dr;

    @Override
    public DetailChampionnat ajouterDetail(DetailChampionnat detail) {
        return dr.save(detail);
    }

    @Override
    public DetailChampionnat modifierDetail(DetailChampionnat detail) {
        return dr.save(detail);
    }

    @Override
    public void supprimerDetail(String code) {
        dr.deleteById(code);
    }

    @Override
    public List<DetailChampionnat> listDetails() {
        return dr.findAll();
    }

    @Override
    public DetailChampionnat recupererDetail(String code) {
        return dr.findById(code).orElse(null);
    }
}