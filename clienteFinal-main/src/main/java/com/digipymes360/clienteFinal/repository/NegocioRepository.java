package com.digipymes360.clienteFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digipymes360.clienteFinal.model.Negocio;

public interface NegocioRepository extends JpaRepository<Negocio, Long> {
    
}
