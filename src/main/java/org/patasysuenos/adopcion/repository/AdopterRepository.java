package org.patasysuenos.adopcion.repository;

import org.patasysuenos.adopcion.entity.Adopter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdopterRepository extends JpaRepository<Adopter, Long> {
}
