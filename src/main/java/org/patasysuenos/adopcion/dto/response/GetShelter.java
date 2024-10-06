package org.patasysuenos.adopcion.dto.response;

import java.io.Serializable;
import java.util.List;

public record GetShelter(
        long id,
        String name,
        String description,
        String address,
        String phone,
        String email,
        String city,
        String state,
        String imageUrl,
        List<GetPet> petList
) implements Serializable {
}
