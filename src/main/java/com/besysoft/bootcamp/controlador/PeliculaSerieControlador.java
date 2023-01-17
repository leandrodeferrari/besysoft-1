package com.besysoft.bootcamp.controlador;

import com.besysoft.bootcamp.dominio.Genero;
import com.besysoft.bootcamp.dominio.PeliculaSerie;
import com.besysoft.bootcamp.utilidad.DatosDummyUtilidad;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/peliculas-series")
public class PeliculaSerieControlador {

    @GetMapping
    public List<PeliculaSerie> mostrarTodos(){
        List<Genero> generos = DatosDummyUtilidad.generarGeneros();
        return DatosDummyUtilidad.generarPeliculasSeries(generos);
    }

    @GetMapping("/titulo/{titulo}")
    public List<PeliculaSerie> buscarPorTitulo(@PathVariable String titulo){
        return DatosDummyUtilidad.buscarPeliculasSeriesPorTitulo(titulo);
    }

    @GetMapping("/genero/{nombre}")
    public List<PeliculaSerie> buscarPorNombreDeGenero(@PathVariable("nombre") String nombreGenero){
        return DatosDummyUtilidad.buscarPeliculasSeriesPorNombreDeGenero(nombreGenero);
    }

}
