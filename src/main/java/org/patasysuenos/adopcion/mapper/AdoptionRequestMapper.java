package org.patasysuenos.adopcion.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.patasysuenos.adopcion.dto.request.SaveAdopter;
import org.patasysuenos.adopcion.dto.request.SaveAdoptionRequest;
import org.patasysuenos.adopcion.dto.response.GetAdoptionRequest;
import org.patasysuenos.adopcion.entity.Adopter;
import org.patasysuenos.adopcion.entity.AdoptionRequest;

import java.util.List;

@Mapper(uses = {AdopterMapper.class, PetMapper.class})
public interface AdoptionRequestMapper {

    AdoptionRequestMapper INSTANCE = Mappers.getMapper(AdoptionRequestMapper.class);

    GetAdoptionRequest adoptionRequestToGetAdoptionRequest(AdoptionRequest adoptionRequest);

    @InheritInverseConfiguration
    AdoptionRequest getAdoptionRequestToAdoptionRequest(GetAdoptionRequest getAdoptionRequest);

    List<GetAdoptionRequest> adoptionRequestListToGetAdoptionRequestList(List<AdoptionRequest> adoptionRequestList);

    List<AdoptionRequest> getAdoptionRequestListToAdoptionRequestList(List<GetAdoptionRequest> getAdoptionRequestList);

    @Mapping(target = "adopterId", source = "adopter.id")
    @Mapping(target = "petId", source = "pet.id")
    SaveAdoptionRequest adoptionRequestToSaveAdoptionRequest(AdoptionRequest adoptionRequest);

    @InheritInverseConfiguration
    AdoptionRequest saveAdoptionRequestToAdoptionRequest(SaveAdoptionRequest saveAdoptionRequest);

    List<SaveAdoptionRequest> adoptionRequestListToSaveAdoptionRequestList(List<AdoptionRequest> adoptionRequestList);
    List<AdoptionRequest> saveAdoptionRequestListToAdoptionRequestList(List<SaveAdoptionRequest> saveAdoptionRequestList);
}
