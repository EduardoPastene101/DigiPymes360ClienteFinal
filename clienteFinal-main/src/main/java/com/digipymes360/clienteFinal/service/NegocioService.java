package com.digipymes360.clienteFinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digipymes360.clienteFinal.model.Negocio;
import com.digipymes360.clienteFinal.repository.NegocioRepository;

@Service
public class NegocioService {
    @Autowired
    private NegocioRepository negocioRepository;

    public Negocio addNegocio(Negocio negocio){
        
        return negocioRepository.save(negocio);
    }

    public Negocio getNegocio(Long id){
        return negocioRepository.findById(id).get();
    }

    public List<Negocio> getNegocios(){
        return negocioRepository.findAll();
    }
    
}
