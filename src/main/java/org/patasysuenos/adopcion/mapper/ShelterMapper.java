package org.patasysuenos.adopcion.mapper;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.patasysuenos.adopcion.dto.request.SaveShelter;
import org.patasysuenos.adopcion.dto.response.GetShelter;
import org.patasysuenos.adopcion.entity.Shelter;

import java.util.List;

@Mapper(uses = {PetMapper.class})
public interface ShelterMapper {

    GetShelter shelterToGetShelter(Shelter shelter);

    @InheritInverseConfiguration
    Shelter getShelterToShelter(GetShelter getShelter);

    List<GetShelter> shelterListToGetShelterList(List<Shelter> shelterList);
    List<Shelter> getShelterListToShelterList(List<GetShelter> getShelterList);

    SaveShelter shelterToSaveShelter(Shelter shelter);

    @InheritInverseConfiguration
    Shelter saveShelterToShelter(SaveShelter saveShelter);

    List<SaveShelter> shelterListToSaveShelterList(List<Shelter> shelterList);
    List<Shelter> saveShelterListToShelterList(List<SaveShelter> saveShelterList);
}
