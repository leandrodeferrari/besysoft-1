package com.besysoft.bootcamp.controlador;

import com.besysoft.bootcamp.dominio.Personaje;
import com.besysoft.bootcamp.utilidad.DatosDummyUtilidad;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/personajes")
public class PersonajeControlador {

    @GetMapping
    public List<Personaje> mostrarTodos(){
        return DatosDummyUtilidad.generarPersonajes();
    }

    @GetMapping("/nombre/{nombre}")
    public List<Personaje> buscarPorNombre(@PathVariable String nombre){
        return DatosDummyUtilidad.buscarPersonajesPorNombre(nombre);
    }

    @GetMapping("/edad/{edad}")
    public List<Personaje> buscarPorEdad(@PathVariable Byte edad){
        return DatosDummyUtilidad.buscarPersonajesPorEdad(edad);
    }

    @GetMapping("/pelicula-serie/{titulo}")
    public List<Personaje> buscarPersonajesPorTituloDePeliculaSerie(@PathVariable String titulo){
        return DatosDummyUtilidad.buscarPersonajesPorTituloDePeliculaSerie(titulo);
    }

}
