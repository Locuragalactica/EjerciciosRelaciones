package ejercicioguia2;

import entidades.Equipo;
import entidades.Jugador;
import java.util.ArrayList;

/**
 *
 * @author felip
 */
public class EjercicioGuia2 {

    public static void main(String[] args) {
        /*
        Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
         */

        Jugador p1 = new Jugador("Franco", "Armani", "Arquero", 1);
        Jugador p2 = new Jugador("Enzo", "Perez", "Mediocampista", 5);
        Jugador p3 = new Jugador("Ignacio", "Fernandez", "Mediocampista", 8);

        ArrayList<Jugador> equipo = new ArrayList<>();
        equipo.add(p1);
        equipo.add(p2);
        equipo.add(p3);
        Equipo river = new Equipo();
        river.setJugadores(equipo);

        System.out.println(river);
        System.out.println("");

    }

}
