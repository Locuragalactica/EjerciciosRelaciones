package servicios;

import entidades.Cine;
import entidades.Pelicula;

public class PeliculaServicios {

    public void crearPeliculas(Cine c1) {
        Pelicula p1 = new Pelicula("El señor de los Anillos", "Peter Jackson", 120, 15);
        c1.setMovie(p1);
    }

}
