package com.aluracursos.screnmatch.modelos;


import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulos implements Clasificacion {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() / 2);
    }
}
