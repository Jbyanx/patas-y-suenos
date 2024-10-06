package org.patasysuenos.adopcion.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "shelters")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Shelter {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "el nombre del refugio no debe estar vacio")
    private String name;
    @Size(max = 1000, message = "la descripcion no debe exceder 1000 caracteres")
    @Column(length = 1000)
    private String description;
    @NotBlank(message = "la direccion del refugio no debe estar vacia")
    private String address;
    @NotBlank(message = "el telefono del refugio no debe estar vacio")
    @Size(max = 15, message = "el telefono no puede exceder 15 caracteres")
    private String phone;
    @NotBlank(message = "el email del refugio no debe estar vacio")
    @Email(message = "el email no es válido")
    @Size(max = 255, message = "el email no puede exceder 255 caracteres")
    @Column(unique = true)
    private String email;
    @NotBlank(message = "la ciudad del refugio no debe estar vacia")
    @Size(max = 100, message = "la ciudad no puede exceder 100 caracteres")
    private String city;
    @NotBlank(message = "el departamento del refugio no debe estar vacio")
    @Size(max = 100, message = "el departamento no puede exceder 100 caracteres")
    private String state;
    private String imageUrl;

    //auditoria
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    // relacion con Pet
    @OneToMany(
            targetEntity = Pet.class,
            mappedBy = "shelter",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    private List<Pet> petList = new ArrayList<>();
}
