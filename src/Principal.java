import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screnmatch.modelos.Episodio;
import com.aluracursos.screnmatch.modelos.Pelicula;
import com.aluracursos.screnmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        // crea una instancia de tipo com.aluracursos.screnmatch.modelos.Pelicula y gurada memoria para ese objeto
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaLanzamiento(2001);
        miPelicula.setDuracionMinutos(120);
        miPelicula.setIncludidoEnPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(7.8);
        miPelicula.evalua(7.8);

        System.out.println(miPelicula.getTotalEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del dragon");
        casaDragon.setFechaLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        System.out.println(casaDragon.getDuracionMinutos());


        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Shrek");
        otraPelicula.setFechaLanzamiento(2010);
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


    }
}

