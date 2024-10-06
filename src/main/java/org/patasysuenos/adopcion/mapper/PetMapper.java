package org.patasysuenos.adopcion.mapper;

import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import org.patasysuenos.adopcion.dto.request.SavePet;
import org.patasysuenos.adopcion.dto.response.GetPet;
import org.patasysuenos.adopcion.entity.Pet;

import java.util.List;

@Mapper(uses = {AdoptionRequestMapper.class})
public interface PetMapper {

    PetMapper INSTANCE = Mappers.getMapper(PetMapper.class);

    @Mapping(source = "shelter.name", target = "shelterName")
    @Mapping(source = "adoptionRequestsList", target = "adoptionRequests")
    GetPet petToGetPet(Pet pet);

    @InheritInverseConfiguration
    Pet getPettoPet(GetPet getPet);

    List<GetPet> petListToGetPetList(List<Pet> pets);

    List<Pet> getPetListToPetList(List<GetPet> getPets);

    @Mapping(target = "idShelter", source = "shelter.id")
    SavePet petToSavePet(Pet pet);

    @InheritInverseConfiguration
    Pet savePetToPet(SavePet savePet);

    List<SavePet> petListToSavePetList(List<Pet> petList);
    List<Pet> savePetListToPetList(List<SavePet> savePetList);
}
