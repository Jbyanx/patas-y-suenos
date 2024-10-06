package org.patasysuenos.adopcion.dto.response;

import org.patasysuenos.adopcion.utils.AdoptionStatus;
import org.patasysuenos.adopcion.utils.PetBreed;
import org.patasysuenos.adopcion.utils.PetGender;
import org.patasysuenos.adopcion.utils.PetSpecie;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public record GetPet(
        String name,
        PetSpecie specie,
        PetBreed breed,
        PetGender gender,
        int age,
        String description,
        String imageUrl,
        String shelterName,
        List<GetAdoptionRequest> adoptionRequests
) implements Serializable {

}
