package org.patasysuenos.adopcion.dto.request;

import org.patasysuenos.adopcion.utils.AdoptionStatus;

import java.io.Serializable;
import java.time.LocalDateTime;

public record SaveAdoptionRequest(
        long adopterId,
        long petId,
        String comments
) implements Serializable {
}
