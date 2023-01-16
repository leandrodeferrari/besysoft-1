package com.besysoft.bootcamp.utilidad;

import com.besysoft.bootcamp.dominio.Genero;
import com.besysoft.bootcamp.dominio.PeliculaSerie;
import com.besysoft.bootcamp.dominio.Personaje;
import com.besysoft.bootcamp.dominio.PersonajePeliculaSerie;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

public class DatosDummyUtilidad {

    public static List<Genero> generarGeneros(){

        List<Genero> generos = new ArrayList<>();

        Genero genero1 = new Genero(1, "Terror");
        Genero genero2 = new Genero(2, "Ciencia Ficción");
        Genero genero3 = new Genero(3, "Policial");
        Genero genero4 = new Genero(4, "Romance");

        generos.add(genero1);
        generos.add(genero2);
        generos.add(genero3);
        generos.add(genero4);

        return generos;

    }

    public static List<PeliculaSerie> generarPeliculasSeries(List<Genero> generos){

        List<PeliculaSerie> peliculasSeries = new ArrayList<>();

        PeliculaSerie peliculaSerie1 = new PeliculaSerie
                (1, "La luz del diablo", LocalDate.now(), (byte) 4, generos.get(1));
        PeliculaSerie peliculaSerie2 = new PeliculaSerie
                (2, "La abuela", LocalDate.now(), (byte) 3, generos.get(1));
        PeliculaSerie peliculaSerie3 = new PeliculaSerie
                (3, "La presencia", LocalDate.now(), (byte) 4, generos.get(2));
        PeliculaSerie peliculaSerie4 = new PeliculaSerie
                (4, "El extraño", LocalDate.now(), (byte) 2, generos.get(3));
        PeliculaSerie peliculaSerie5 = new PeliculaSerie
                (5, "La llegada", LocalDate.now(), (byte) 5, generos.get(2));
        PeliculaSerie peliculaSerie6 = new PeliculaSerie
                (6, "Corazones malheridos", LocalDate.now(), (byte) 1, generos.get(4));

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
                (1, "Jacqueline Byers", (byte) 26, 55.7f, "Es una actriz canadiense. Protagonizó la serie Salvation de CBS.");
        Personaje personaje2 = new Personaje
                (2, "Vera Valdez", (byte) 86, 70.0f, "Supermodelo que enamoró a Coco Chanel y ahora ha conquistado a Paco Plaza.");
        Personaje personaje3 = new Personaje
                (3, "Christian Prentice", (byte) 35, 79.5f, "Es actor, escritor, director, productor y músico. Trabaja en el teatro, peliculas y televisión.");
        Personaje personaje4 = new Personaje
                (4, "Joel Edgerton", (byte) 48, 90.2f, "Es actor, director y guionista australiano conocido por haber participado en la serie televisiva Teh secret life of us.");
        Personaje personaje5 = new Personaje
                (5, "Sofia Carson", (byte) 29, 69.5f, "Nació en Lauderdale, Florida. Hijan de José F. Daccarett y de Laura Char Canson.");
        Personaje personaje6 = new Personaje
                (6, "Jeremy Renner", (byte) 52, 80.5f, "Es actor, actor de voz, productor y músico estadounidense.");

        personajes.add(personaje1);
        personajes.add(personaje2);
        personajes.add(personaje3);
        personajes.add(personaje4);
        personajes.add(personaje5);
        personajes.add(personaje6);

        return personajes;

    }

    public static List<PersonajePeliculaSerie> generarRelacionDePeliculasSeriesPersonajes
            (List<Personaje> personajes, List<PeliculaSerie> peliculasSeries){

        List<PersonajePeliculaSerie> personajesPeliculaSeries = new ArrayList<>();

        PersonajePeliculaSerie personajePeliculaSerie1 = new PersonajePeliculaSerie
                (1, personajes.get(0), peliculasSeries.get(0));
        PersonajePeliculaSerie personajePeliculaSerie2 = new PersonajePeliculaSerie
                (1, personajes.get(1), peliculasSeries.get(1));
        PersonajePeliculaSerie personajePeliculaSerie3 = new PersonajePeliculaSerie
                (1, personajes.get(2), peliculasSeries.get(2));
        PersonajePeliculaSerie personajePeliculaSerie4 = new PersonajePeliculaSerie
                (1, personajes.get(4), peliculasSeries.get(5));
        PersonajePeliculaSerie personajePeliculaSerie5 = new PersonajePeliculaSerie
                (1, personajes.get(3), peliculasSeries.get(3));
        PersonajePeliculaSerie personajePeliculaSerie6 = new PersonajePeliculaSerie
                (1, personajes.get(5), peliculasSeries.get(4));

        personajesPeliculaSeries.add(personajePeliculaSerie1);
        personajesPeliculaSeries.add(personajePeliculaSerie2);
        personajesPeliculaSeries.add(personajePeliculaSerie3);
        personajesPeliculaSeries.add(personajePeliculaSerie4);
        personajesPeliculaSeries.add(personajePeliculaSerie5);
        personajesPeliculaSeries.add(personajePeliculaSerie6);

        return personajesPeliculaSeries;

    }

}
