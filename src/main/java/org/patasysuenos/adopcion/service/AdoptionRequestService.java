package org.patasysuenos.adopcion.service;

import org.patasysuenos.adopcion.dto.request.SaveAdoptionRequest;
import org.patasysuenos.adopcion.dto.response.GetAdoptionRequest;
import org.patasysuenos.adopcion.entity.AdoptionRequest;

import java.util.List;

public interface AdoptionRequestService {
    List<GetAdoptionRequest> findAllAdoptionRequests();
    GetAdoptionRequest findAdoptionRequestById(Long id);
    List<GetAdoptionRequest> findAdoptionRequestByUserId(Long userId);
    List<GetAdoptionRequest> findAdoptionRequestByPetId(Long petId);
    GetAdoptionRequest findAdoptionRequestByAdoptionId(Long adoptionId);
    GetAdoptionRequest saveAdoptionRequest(SaveAdoptionRequest saveAdoptionRequest);
    GetAdoptionRequest updateAdoptionRequestById(Long id, AdoptionRequest adoptionRequest);
    void deleteAdoptionRequestById(Long id);
}
