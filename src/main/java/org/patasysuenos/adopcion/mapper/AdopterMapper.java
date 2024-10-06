package org.patasysuenos.adopcion.mapper;

import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import org.patasysuenos.adopcion.dto.request.SaveAdopter;
import org.patasysuenos.adopcion.dto.response.GetAdopter;
import org.patasysuenos.adopcion.entity.Adopter;

import java.util.List;

@Mapper(uses = {AdoptionRequestMapper.class})
public interface AdopterMapper {

    AdopterMapper INSTANCE = Mappers.getMapper(AdopterMapper.class);

    @Mapping(source = "createdAt", target = "registrationDate", dateFormat = "yyy-MM-dd HH:mm:ss")
    GetAdopter adopterToGetAdopter(Adopter adopter);

    @InheritInverseConfiguration
    Adopter getAdopterToAdopter(GetAdopter getAdopter);

    List<GetAdopter> adopterListToGetAdopterList(List<Adopter> adopterList);

    List<Adopter> getAdopterListToAdopterList(List<Adopter> adopterList);

    SaveAdopter adopterToSaveAdopter(Adopter adopter);

    @InheritInverseConfiguration
    Adopter saveAdopterToAdopter(SaveAdopter saveAdopter);

    List<SaveAdopter> adopterListToSaveAdopterList(List<Adopter> adopterList);
    List<Adopter> saveAdopterListToAdopterList(List<GetAdopter> getAdopterList);
}
