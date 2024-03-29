package com.mihani.services;

import com.mihani.exceptions.BricoleurAlreadyExistsException;
import com.mihani.exceptions.BricoleurNotFoundException;
import com.mihani.dtos.BricoleurProfileDto;
import com.mihani.entities.Bricoleur;

import java.util.List;


public interface BricoleurService {

    Bricoleur saveBricoleur(Bricoleur bricoleur) throws BricoleurAlreadyExistsException;
    Bricoleur updateBricoleur(Bricoleur bricoleur) throws BricoleurNotFoundException, BricoleurNotFoundException;
    void deleteBricoleur(Long idBricoleur) throws BricoleurNotFoundException;

    List<BricoleurProfileDto> filteredlistOfAVailableBricoleurs(List<String> services, String description);

    BricoleurProfileDto getBricoleur(Long idBricoleur) throws BricoleurNotFoundException;

    List<BricoleurProfileDto> listBricoleurs();






}
