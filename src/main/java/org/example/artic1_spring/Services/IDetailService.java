package org.example.artic1_spring.Services;

import org.example.artic1_spring.entities.DetailChampionnat;
import java.util.List;

public interface IDetailService {
    DetailChampionnat ajouterDetail(DetailChampionnat detail);
    DetailChampionnat modifierDetail(DetailChampionnat detail);
    void supprimerDetail(String code);
    List<DetailChampionnat> listDetails();
    DetailChampionnat recupererDetail(String code);
}