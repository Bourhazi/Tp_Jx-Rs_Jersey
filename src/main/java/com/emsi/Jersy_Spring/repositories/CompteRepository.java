package com.emsi.Jersy_Spring.repositories;

import com.emsi.Jersy_Spring.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}

