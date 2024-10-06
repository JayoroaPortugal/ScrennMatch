package com.aluracursos.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulos;

import java.util.*;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2001);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Shrek", 2010);
        miPelicula.evalua(6);
        var peliculaDeBruno = new Pelicula("El señor de los anillos", 2001);
        peliculaDeBruno.evalua(10);
        Serie casaDragon = new Serie("La casa del dragon",2022);

        Pelicula p1 = peliculaDeBruno;

        List<Titulos> lista = new LinkedList<>();
        lista.add(peliculaDeBruno);
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(casaDragon);



        for (Titulos item: lista) {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion()>2){
                System.out.println(pelicula.getClasificacion());
            }
        }

        ArrayList <String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darin");
        System.out.println("lista de Artistas no ordenadas" + listaDeArtistas);

        Collections.sort(listaDeArtistas);
        System.out.println("lista de Artistas ordenadas" + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("lsita de titulos ordenados" + lista);

        lista.sort(Comparator.comparing(Titulos::getFechaLanzamiento));
        System.out.println("lsita ordenada por fecha" + lista);

    }
}
