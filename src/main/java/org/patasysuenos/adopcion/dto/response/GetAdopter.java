package org.patasysuenos.adopcion.dto.response;

import java.io.Serializable;
import java.util.List;

public record GetAdopter(
        long id,
        String name,
        String lastname,
        String email,
        String phone,
        String address,
        String city,
        String state,
        String imageUrl,
        String registrationDate,
        List<GetAdoptionRequest> adoptionRequestList
) implements Serializable {

}
