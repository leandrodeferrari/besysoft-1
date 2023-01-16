package com.besysoft.bootcamp;

import com.besysoft.bootcamp.dominio.Genero;
import com.besysoft.bootcamp.dominio.PeliculaSerie;
import com.besysoft.bootcamp.dominio.Personaje;
import com.besysoft.bootcamp.dominio.PersonajePeliculaSerie;
import com.besysoft.bootcamp.utilidad.DatosDummyUtilidad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class BootcampApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootcampApplication.class, args);
	}

	List<Genero> generos = DatosDummyUtilidad.generarGeneros();
	List<Personaje> personajes = DatosDummyUtilidad.generarPersonajes();
	List<PeliculaSerie> peliculasSeries = DatosDummyUtilidad.generarPeliculasSeries(generos);
	List<PersonajePeliculaSerie> personajesPeliculasSeries = DatosDummyUtilidad
			.generarRelacionDePeliculasSeriesPersonajes(personajes, peliculasSeries);

}
