package entidades;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private List<Jugador> jugadores = new ArrayList<>();

    public Equipo() {
        
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" + "jugadores=" + jugadores + '}';
    }
    
}
