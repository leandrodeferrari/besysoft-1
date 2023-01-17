package com.besysoft.bootcamp.dominio;

public class PersonajePeliculaSerie {

    private Personaje personaje;
    private PeliculaSerie peliculaSerie;

    public PersonajePeliculaSerie(Personaje personaje, PeliculaSerie peliculaSerie) {
        this.personaje = personaje;
        this.peliculaSerie = peliculaSerie;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public PeliculaSerie getPeliculaSerie() {
        return peliculaSerie;
    }

    public void setPeliculaSerie(PeliculaSerie peliculaSerie) {
        this.peliculaSerie = peliculaSerie;
    }

}
