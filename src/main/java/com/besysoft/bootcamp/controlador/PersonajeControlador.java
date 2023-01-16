package com.besysoft.bootcamp.controlador;

import com.besysoft.bootcamp.dominio.Personaje;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/personajes")
public class PersonajeControlador {

    @GetMapping
    public List<Personaje> get(){
        return null;
    }

}
