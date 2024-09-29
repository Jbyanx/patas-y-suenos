package org.patasysuenos.adopcion.mapper;

import org.mapstruct.*;
import org.patasysuenos.adopcion.dto.response.GetPet;
import org.patasysuenos.adopcion.entity.Pet;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PetMapper {

    @Mappings({
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "specie", target = "specie"),
            @Mapping(source = "breed", target = "breed"),
            @Mapping(source = "gender", target = "gender"),
            @Mapping(source = "age", target = "age"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "imageUrl", target = "imageUrl"),
            @Mapping(source = "shelter.name", target = "shelterName"),
            @Mapping(source = "adoptionRequestsList", target = "adoptionRequests")
    })
    GetPet toGetDto(Pet pet);

    @InheritInverseConfiguration
    Pet toEntity(GetPet getPet);
}
