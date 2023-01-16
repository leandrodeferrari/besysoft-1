package com.besysoft.bootcamp.dominio;

public class PersonajePeliculaSerie {

    private final Integer id;
    private Personaje personaje;
    private PeliculaSerie peliculaSerie;

    public PersonajePeliculaSerie(Integer id, Personaje personaje, PeliculaSerie peliculaSerie) {
        this.id = id;
        this.personaje = personaje;
        this.peliculaSerie = peliculaSerie;
    }

    public Integer getId() {
        return id;
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
