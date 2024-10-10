package org.patasysuenos.adopcion.service;

import org.patasysuenos.adopcion.dto.request.SaveShelter;
import org.patasysuenos.adopcion.dto.response.GetShelter;

import java.util.List;

public interface ShelterService {
    GetShelter findShelterById(Long id);
    List<GetShelter> finAllShelters();
    GetShelter saveShelter(SaveShelter saveShelter);
    GetShelter updateShelterById(Long id, SaveShelter saveShelter);
    void deleteShelterById(Long id);
}
