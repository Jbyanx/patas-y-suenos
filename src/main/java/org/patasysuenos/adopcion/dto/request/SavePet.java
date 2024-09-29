package org.patasysuenos.adopcion.dto.request;

import org.patasysuenos.adopcion.utils.PetBreed;
import org.patasysuenos.adopcion.utils.PetGender;
import org.patasysuenos.adopcion.utils.PetSpecie;

import java.io.Serializable;

public record SavePet(
        String name,
        PetSpecie specie,
        PetBreed breed,
        PetGender gender,
        int age,
        String description,
        String imageUrl,
        long idShelter
) implements Serializable {
}
