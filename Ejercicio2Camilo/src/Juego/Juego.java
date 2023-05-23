/*
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package Juego;

import Jugador.Jugador;
import Revolver.Revolver;
import java.util.ArrayList;

/**
 *
 * @author PAVILION
 */
public class Juego {
    private Jugador j= new Jugador();
    private ArrayList<Jugador> jugadores = new ArrayList();
    private Revolver r = new Revolver();
    
    public void llenarJuego(){
        r.llenarRevolver();
        j.crearJugadores(jugadores);
    }
    
    public void ronda(){
      
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println(jugadores.get(i));
            if (j.disparo(r)) {
                jugadores.get(i).setMojado(true);
                System.out.println("El jugdor que se mojo es: "+jugadores.get(i));
                break;
            }
        }
    }
}
//• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//mojar. Al final del juego, se debe mostrar que jugador se mojó.
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
