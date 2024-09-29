package org.patasysuenos.adopcion.mapper;

import org.mapstruct.*;
import org.patasysuenos.adopcion.dto.response.GetAdopter;
import org.patasysuenos.adopcion.entity.Adopter;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AdopterMapper {

    @Mappings({
            @Mapping(source = "createdAt", target = "registrationDate", dateFormat = "yyy-MM-dd HH:mm:ss")
    })
    GetAdopter toGetDTO(Adopter adopter);

    @InheritInverseConfiguration
    Adopter toEntity(GetAdopter getAdopter);
}
