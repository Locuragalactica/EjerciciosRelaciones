package entidad;

import java.util.ArrayList;
import java.util.List;

public class Juego {
    private List <Jugador> jugadores;
    private Revolver ruleta;

    public Juego(List<Jugador> jugadores, Revolver ruleta) {
        this.jugadores = new ArrayList();
        this.ruleta = ruleta;
    }

    public Juego() {
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRuleta() {
        return ruleta;
    }

    public void setRuleta(Revolver ruleta) {
        this.ruleta = ruleta;
    }
    
    
}
