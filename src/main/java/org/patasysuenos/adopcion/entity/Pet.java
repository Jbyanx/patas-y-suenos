package org.patasysuenos.adopcion.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.patasysuenos.adopcion.utils.PetBreed;
import org.patasysuenos.adopcion.utils.PetGender;
import org.patasysuenos.adopcion.utils.PetSpecie;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "pets")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pet {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "el nombre de la mascota no puede estar vacio")
    private String name;
    @Enumerated(EnumType.STRING) @NotNull(message = "la especie de la mascota es obligatoria")
    private PetSpecie specie; //(gato, perro, conejo, etc)
    @Enumerated(EnumType.STRING) @NotNull(message = "la raza de la mascota es obligatoria")
    private PetBreed breed;// (raza de mascota según su especie)
    @Enumerated(EnumType.STRING) @NotNull(message = "el genero de la mascota es obligatorio")
	private PetGender gender;
    @Min(value = 0, message = "la edad debe ser minimo cero")
    private int age;
    @Size(max = 1000, message = "la descripcion no puede exceder 1000 caracteres")
    @Column(length = 1000)
    private String description;
    @Column(nullable = false)
    private Boolean adopted = false; //por defecto al crear una mascota no se ha adoptado
    @CreationTimestamp //valor por defecto al momento de la creacion
    private LocalDateTime createdAt;
    @UpdateTimestamp //valor por defecto al momento de la actualizacion
    private LocalDateTime updatedAt;
    private String imageUrl;

    //relacion con shelter (muchas mascotas pertenecen a un refugio)
    @ManyToOne
    @JoinColumn(name = "shelter_id")
    private Shelter shelter;

    //relacion con AdoptionRequest
    @OneToMany(mappedBy = "pet", fetch = FetchType.LAZY)
    private List<AdoptionRequest> adoptionRequestsList;
}
