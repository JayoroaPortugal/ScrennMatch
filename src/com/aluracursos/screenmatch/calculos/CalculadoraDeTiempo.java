package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmatch.modelos.Titulos;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulos titulo){
        this.tiempoTotal += titulo.getDuracionMinutos();
    }
}
