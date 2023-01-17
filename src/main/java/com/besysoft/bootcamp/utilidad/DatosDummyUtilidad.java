package com.besysoft.bootcamp.utilidad;

import com.besysoft.bootcamp.dominio.Genero;
import com.besysoft.bootcamp.dominio.PeliculaSerie;
import com.besysoft.bootcamp.dominio.Personaje;
import com.besysoft.bootcamp.dominio.PersonajePeliculaSerie;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DatosDummyUtilidad {

    public static List<Genero> generarGeneros(){

        List<Genero> generos = new ArrayList<>();

        Genero genero1 = new Genero("Terror");
        Genero genero2 = new Genero("Suspenso");
        Genero genero3 = new Genero("Policial");
        Genero genero4 = new Genero("Romance");

        generos.add(genero1);
        generos.add(genero2);
        generos.add(genero3);
        generos.add(genero4);

        return generos;

    }

    public static List<PeliculaSerie> generarPeliculasSeries(List<Genero> generos){

        List<PeliculaSerie> peliculasSeries = new ArrayList<>();

        PeliculaSerie peliculaSerie1 = new PeliculaSerie
                ("Chucky", LocalDate.now(), (byte) 4, generos.get(0));
        PeliculaSerie peliculaSerie2 = new PeliculaSerie
                ("Annabelle", LocalDate.now(), (byte) 3, generos.get(0));
        PeliculaSerie peliculaSerie3 = new PeliculaSerie
                ("Jaula", LocalDate.now(), (byte) 4, generos.get(1));
        PeliculaSerie peliculaSerie4 = new PeliculaSerie
                ("Culpable", LocalDate.now(), (byte) 2, generos.get(2));
        PeliculaSerie peliculaSerie5 = new PeliculaSerie
                ("Viejos", LocalDate.now(), (byte) 5, generos.get(1));
        PeliculaSerie peliculaSerie6 = new PeliculaSerie
                ("CODA", LocalDate.now(), (byte) 1, generos.get(3));

        peliculasSeries.add(peliculaSerie1);
        peliculasSeries.add(peliculaSerie2);
        peliculasSeries.add(peliculaSerie3);
        peliculasSeries.add(peliculaSerie4);
        peliculasSeries.add(peliculaSerie5);
        peliculasSeries.add(peliculaSerie6);

        return peliculasSeries;

    }

    public static List<Personaje> generarPersonajes(){

        List<Personaje> personajes = new ArrayList<>();

        Personaje personaje1 = new Personaje
                ("Jacqueline", (byte) 26, 55.7f, "Es una actriz canadiense. Protagonizó la serie Salvation de CBS.");
        Personaje personaje2 = new Personaje
                ("Vera", (byte) 86, 70.0f, "Supermodelo que enamoró a Coco Chanel y ahora ha conquistado a Paco Plaza.");
        Personaje personaje3 = new Personaje
                ("Christian", (byte) 35, 79.5f, "Es actor, escritor, director, productor y músico. Trabaja en el teatro, peliculas y televisión.");
        Personaje personaje4 = new Personaje
                ("Joel", (byte) 48, 90.2f, "Es actor, director y guionista australiano conocido por haber participado en la serie televisiva Teh secret life of us.");
        Personaje personaje5 = new Personaje
                ("Sofia", (byte) 29, 69.5f, "Nació en Lauderdale, Florida. Hijan de José F. Daccarett y de Laura Char Canson.");
        Personaje personaje6 = new Personaje
                ("Jeremy", (byte) 52, 80.5f, "Es actor, actor de voz, productor y músico estadounidense.");

        personajes.add(personaje1);
        personajes.add(personaje2);
        personajes.add(personaje3);
        personajes.add(personaje4);
        personajes.add(personaje5);
        personajes.add(personaje6);

        return personajes;

    }

    public static List<PersonajePeliculaSerie> generarPersonajesPeliculasSeries
            (List<Personaje> personajes, List<PeliculaSerie> peliculasSeries){

        List<PersonajePeliculaSerie> personajesPeliculasSeries = new ArrayList<>();

        PersonajePeliculaSerie personajePeliculaSerie1 = new PersonajePeliculaSerie
                (personajes.get(0), peliculasSeries.get(0));
        PersonajePeliculaSerie personajePeliculaSerie2 = new PersonajePeliculaSerie
                (personajes.get(1), peliculasSeries.get(1));
        PersonajePeliculaSerie personajePeliculaSerie3 = new PersonajePeliculaSerie
                (personajes.get(2), peliculasSeries.get(2));
        PersonajePeliculaSerie personajePeliculaSerie4 = new PersonajePeliculaSerie
                (personajes.get(4), peliculasSeries.get(5));
        PersonajePeliculaSerie personajePeliculaSerie5 = new PersonajePeliculaSerie
                (personajes.get(3), peliculasSeries.get(3));
        PersonajePeliculaSerie personajePeliculaSerie6 = new PersonajePeliculaSerie
                (personajes.get(5), peliculasSeries.get(4));

        personajesPeliculasSeries.add(personajePeliculaSerie1);
        personajesPeliculasSeries.add(personajePeliculaSerie2);
        personajesPeliculasSeries.add(personajePeliculaSerie3);
        personajesPeliculasSeries.add(personajePeliculaSerie4);
        personajesPeliculasSeries.add(personajePeliculaSerie5);
        personajesPeliculasSeries.add(personajePeliculaSerie6);

        return personajesPeliculasSeries;

    }

    public static List<Personaje> buscarPersonajesPorNombre(String nombre){

        if(nombre == null){
            throw new NullPointerException("Nombre nulo");
        }

        if(!ValidacionGeneralUtilidad.validarQueContengaLetras(nombre)){
            throw new IllegalArgumentException("Nombre inválido");
        }

        List<Personaje> personajes = generarPersonajes();

        return personajes.stream()
                .filter(personaje -> personaje.getNombre().equalsIgnoreCase(nombre))
                .collect(Collectors.toList());

    }

    public static List<Personaje> buscarPersonajesPorEdad(Byte edad){

        if(edad == null){
            throw new NullPointerException("Edad nula");
        }

        if(!ValidacionGeneralUtilidad.validarEdad(edad)){
            throw new IllegalArgumentException("Edad inválida");
        }

        List<Personaje> personajes = generarPersonajes();

        return personajes.stream()
                .filter(personaje -> personaje.getEdad().equals(edad))
                .collect(Collectors.toList());

    }

    public static List<PeliculaSerie> buscarPeliculasSeriesPorTitulo(String titulo){

        if(titulo == null){
            throw new NullPointerException("Título nulo");
        }

        if(!ValidacionGeneralUtilidad.validarQueContengaLetras(titulo)){
            throw new IllegalArgumentException("Título inválido");
        }

        List<Genero> generos = generarGeneros();
        List<PeliculaSerie> peliculasSeries = generarPeliculasSeries(generos);

        return peliculasSeries.stream()
                .filter(peliculaSerie -> peliculaSerie.getTitulo().equalsIgnoreCase(titulo))
                .collect(Collectors.toList());

    }

    public static List<PeliculaSerie> buscarPeliculasSeriesPorNombreDeGenero(String nombreGenero){

        if(nombreGenero == null){
            throw new NullPointerException("Nombre de género nulo");
        }

        if(!ValidacionGeneralUtilidad.validarQueContengaLetras(nombreGenero)){
            throw new IllegalArgumentException("Nombre de género inválido");
        }

        List<Genero> generos = generarGeneros();
        List<PeliculaSerie> peliculasSeries = generarPeliculasSeries(generos);

        return peliculasSeries.stream()
                .filter(peliculaSerie -> peliculaSerie.getGenero().getNombre().equalsIgnoreCase(nombreGenero))
                .collect(Collectors.toList());

    }

}
