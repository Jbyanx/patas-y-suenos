package org.patasysuenos.adopcion.dto.request;

import java.io.Serializable;

public record SaveAdopter(
        String name,
        String lastname,
        String email,
        String phone,
        String adress,
        String city,
        String state,
        String imageUrl
) implements Serializable {
}
