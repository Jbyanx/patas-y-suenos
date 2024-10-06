package org.patasysuenos.adopcion.dto.response;

import org.patasysuenos.adopcion.utils.AdoptionStatus;

import java.io.Serializable;
import java.time.LocalDateTime;

public record GetAdoptionRequest(
        long id,
        GetAdopter adopter,
        GetPet pet,
        LocalDateTime requestDate,
        AdoptionStatus status,
        String comments
) implements Serializable {
}
