package com.ejercicio.spring.valuaciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicio.spring.valuaciones.entity.Automovil;

public interface AutomovilRepository extends JpaRepository<Automovil, Integer> {
    
}
