package org.patasysuenos.adopcion.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "adopters")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Adopter {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "el nombre no debe estar vacio")
    private String name;
    @NotBlank(message = "el apellido no debe estar vacio")
    private String lastname;
    @NotBlank(message = "el email no debe estar vacio")
    @Email(message = "email no valido")
    @Size(max = 255)
    @Column(unique = true)
    private String email;
    @NotBlank(message = "el telefono no debe estar vacio")
    @Size(max = 15, message = "el telefono debe tener 15 caracteres maximo")
    private String phone;
    @NotBlank(message = "la direccion no debe estar vacia")
    private String address;
    @NotBlank(message = "la ciudad no debe estar vacia")
    @Size(max = 100, message = "la ciudad debe tener maximo 100 caracteres")
    private String city;
    @NotBlank(message = "el departamento no debe estar vacio")
    @Size(max = 100, message = "el departamento debe tener maximo 100 caracteres")
    private String state;
    private String imageUrl;

    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    //relacion con AdoptionRequest
    @OneToMany(mappedBy = "adopter", fetch = FetchType.LAZY)
    private List<AdoptionRequest> adoptionRequestsList;
}
