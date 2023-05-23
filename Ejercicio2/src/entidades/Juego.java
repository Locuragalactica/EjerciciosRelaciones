package entidades;

import entidades.Jugador;
import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugador> jugadores;
    private Revolver ruleta;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver ruleta) {
        this.jugadores = new ArrayList<>();
        this.ruleta = ruleta;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRuleta() {
        return ruleta;
    }

    public void setRuleta(Revolver ruleta) {
        this.ruleta = ruleta;
    }

    
    
}
