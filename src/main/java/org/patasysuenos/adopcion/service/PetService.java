package org.patasysuenos.adopcion.service;

import org.patasysuenos.adopcion.dto.request.SavePet;
import org.patasysuenos.adopcion.dto.response.GetPet;

import java.util.List;

public interface PetService {
    GetPet findPetById(Long id);
    List<GetPet> finAllPets();
    List<GetPet> findPetsByShelterNameContaining(String shelterName);
    GetPet savePet(SavePet savePet);
    GetPet updatePetById(Long id, SavePet savePet);
    void deletePetById(Long id);
}
