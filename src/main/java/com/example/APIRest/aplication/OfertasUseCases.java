package com.example.APIRest.aplication;

import com.example.APIRest.domain.Oferta;
import com.example.APIRest.domain.OfertasRepository;

import java.util.List;

public class OfertasUseCases {
    private OfertasRepository ofertasRepository;

    public OfertasUseCases(OfertasRepository ofertasRepository){
        this.ofertasRepository = ofertasRepository;
    }

    public List<Oferta> getAll(){
        return this.ofertasRepository.getAll();
    }
}
