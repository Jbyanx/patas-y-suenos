package org.patasysuenos.adopcion.dto.request;

import java.io.Serializable;

public record SaveAdoptionRequest(
        long adopterId,
        long petId,
        String comments
) implements Serializable {
}
