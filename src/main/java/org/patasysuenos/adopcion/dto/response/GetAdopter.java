package org.patasysuenos.adopcion.dto.response;

import org.patasysuenos.adopcion.utils.AdoptionStatus;

import java.io.Serializable;

public record GetAdopter(
        String name,
        String lastname,
        String email,
        String phone,
        String address,
        String city,
        String state,
        String registrationDate
) implements Serializable {

    public static record getAdoptionRequests(
        long id,
        long petId,
        String petName,
        AdoptionStatus status
    ) implements Serializable {}
}
