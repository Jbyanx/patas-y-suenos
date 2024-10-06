package org.patasysuenos.adopcion.dto.request;

import java.io.Serializable;

public record SaveShelter(
        String name,
        String description,
        String address,
        String phone,
        String email,
        String city,
        String state,
        String imageUrl
) implements Serializable {
}
