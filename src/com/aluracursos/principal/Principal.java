package com.aluracursos.principal;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // crea una instancia de tipo com.aluracursos.screnmatch.modelos.Pelicula y gurada memoria para ese objeto
        Pelicula miPelicula = new Pelicula("Encanto", 2001);
        miPelicula.setDuracionMinutos(120);
        miPelicula.setIncludidoEnPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(7.8);
        miPelicula.evalua(7.8);

        System.out.println(miPelicula.getTotalEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon = new Serie("La casa del dragon",2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        System.out.println(casaDragon.getDuracionMinutos());


        Pelicula otraPelicula = new Pelicula("Shrek", 2010);
        otraPelicula.setDuracionMinutos(190);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtro(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(300);

        filtroRecomendacion.filtro(episodio);

        var peliculaDeBruno = new Pelicula("El señor de los anillos", 2001);
        peliculaDeBruno.setDuracionMinutos(180);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeBruno);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);

        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());
        System.out.println("la primera pelicula es " + listaDePeliculas.get(0).getNombre());

        System.out.println(listaDePeliculas);

        System.out.println("toString de la pelicula: " + listaDePeliculas.get(0).toString());

    }
}

