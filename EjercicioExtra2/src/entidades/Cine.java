package entidades;

import java.util.ArrayList;

public class Cine {

    /*
    De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada
    Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
ocupado se muestra una X, sino un espacio vacío.
     */
    private Pelicula movie;
    private Asiento[][] sala = new Asiento[8][6];
    private Integer precio;
    private ArrayList<Espectador> espectadores = new ArrayList<>();

    public Cine() {
    }

    public Cine(Pelicula movie, Double precio) {
        this.movie = movie;
        this.precio = 800;
    }

    public Pelicula getMovie() {
        return movie;
    }

    public void setMovie(Pelicula movie) {
        this.movie = movie;
    }

    public Asiento[][] getSala() {
        return sala;
    }

    public void setSala(Asiento[][] sale) {
        this.sala = sale;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = 800;
    }

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    @Override
    public String toString() {
        return "Cine: \n"
                + "Pelicula: " + movie + "\n"
                + "Sala: " + sala + "\n"
                + "Precio: " + precio;
    }

}
