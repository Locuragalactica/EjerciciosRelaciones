package servicios;

import entidades.Juego;
import entidades.Jugador;
import entidades.Revolver;
import java.util.ArrayList;

public class JuegoServicios {

    Juego game = new Juego();
    JugadorServicios js = new JugadorServicios();

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r) {
        game.setJugadores(jugadores);
        game.setRuleta(r);
    }

    public void ronda() {
        do {
            for (Jugador aux : game.getJugadores()) {
                System.out.println("El " + aux + " ejecutara su disparo.");
                if (js.disparo(game.getRuleta())) {
                    System.out.println("El jugador ha perdido");
                    aux.setMojado(true);
                    break;
                } else {
                    System.out.println("Se ha salvado");
                }
            }
        } while (game.getRuleta().getPosAct() != game.getRuleta().getPosAgua());
    }
}
