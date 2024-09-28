package org.patasysuenos.adopcion.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.patasysuenos.adopcion.utils.PetBreed;
import org.patasysuenos.adopcion.utils.PetGender;
import org.patasysuenos.adopcion.utils.PetSpecie;

@Entity
@Table(name = "pets")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pet {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private PetSpecie species; //(gato, perro, conejo)
    @Enumerated(EnumType.STRING)
    private PetBreed breed;// (raza de mascota según su especie)
    @Enumerated(EnumType.STRING)
	private PetGender gender;
    private int age;
    @Column(length = 1000)
    private String description;
    boolean adopted;
}
