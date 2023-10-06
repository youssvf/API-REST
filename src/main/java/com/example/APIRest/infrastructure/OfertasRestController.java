package com.example.APIRest.infrastructure;

import com.example.APIRest.aplication.OfertasUseCases;
import com.example.APIRest.domain.Oferta;
import com.example.APIRest.domain.OfertasRepository;
import com.example.APIRest.infrastructure.data.OfertasRepositoryRAM;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OfertasRestController {
    private OfertasUseCases ofertasUseCases;

    public OfertasRestController(){
        this.ofertasUseCases = new OfertasUseCases(new OfertasRepositoryRAM());
    }

    @GetMapping("/")
    public List<Oferta> obtenerofertas(){
        List<Oferta> ofertas = new ArrayList<>();
        ofertas.add( new Oferta("Oferta 1", "Trabajo en oferta 1"));
        return ofertas;
    }
}
