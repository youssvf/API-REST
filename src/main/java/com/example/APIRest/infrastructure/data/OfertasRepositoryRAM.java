package com.example.APIRest.infrastructure.data;

import com.example.APIRest.domain.Oferta;
import com.example.APIRest.domain.OfertasRepository;

import java.util.ArrayList;
import java.util.List;

public class OfertasRepositoryRAM implements OfertasRepository {
    public OfertasRepositoryRAM(){
    }

    public List<Oferta> ofertas = new ArrayList<>();

    @Override
    public List<Oferta> getAll() {
        return ofertas;
    }

    public void llenarlista(){
        ofertas.add(new Oferta("Oferta 1", "Trabajo en oferta 1"));
    }
}
