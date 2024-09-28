package org.patasysuenos.adopcion.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.patasysuenos.adopcion.utils.AdoptionStatus;

import java.time.LocalDateTime;

@Entity
@Table(name = "adoption_requests")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AdoptionRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "adopter_id", nullable = false)
    private Adopter adopter;

    @ManyToOne
    @JoinColumn(name = "pet_id", nullable = false)
    private Pet pet;

    @CreationTimestamp
    private LocalDateTime requestDate;

    @Enumerated(EnumType.STRING) @NotNull(message = "el estado de la solicitud no debe estar vacio")
    private AdoptionStatus status; // Podría ser PENDING, APPROVED, REJECTED

    @Size(max = 1000, message = "los comentarios no deben exceder 1000 caracteres")
    @Column(length = 1000)
    private String comments; // Comentarios adicionales del adoptante

}
