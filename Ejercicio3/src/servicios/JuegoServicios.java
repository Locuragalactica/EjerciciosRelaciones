package servicios;

import entidades.Baraja;
import entidades.Carta;
import enumeraciones.Palos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class JuegoServicios {

    Scanner leer = new Scanner(System.in);
    Baraja b1 = new Baraja();
    ArrayList<Carta> mano = new ArrayList<>();

    public void crearCartas() {

        for (int i = 1; i < 11; i++) {
            Carta c1 = new Carta();
            Carta c2 = new Carta();
            Carta c3 = new Carta();
            Carta c4 = new Carta();
            switch (i) {
                case 8:
                    c1.setNum(11);
                    c2.setNum(11);
                    c3.setNum(11);
                    c4.setNum(11);
                    break;
                case 9:
                    c1.setNum(12);
                    c2.setNum(12);
                    c3.setNum(12);
                    c4.setNum(12);
                    break;
                default:
                    c1.setNum(i);
                    c2.setNum(i);
                    c3.setNum(i);
                    c4.setNum(i);
                    break;
            }

            c1.setPalo(Palos.BASTO.toString());
            b1.getMazo().add(c1);

            c2.setPalo(Palos.COPAS.toString());
            b1.getMazo().add(c2);

            c3.setPalo(Palos.ESPADA.toString());
            b1.getMazo().add(c3);

            c4.setPalo(Palos.ORO.toString());
            b1.getMazo().add(c4);
        }

    }

    public void barajar() {
        Collections.shuffle(b1.getMazo());
    }

    public void siguienteCarta() {
        if (b1.getMazo().isEmpty()) {
            System.out.println("No quedan mas cartas");
        } else {
            mano.add(b1.getMazo().get(0));
            System.out.println("Usted recibio la Carta: " + b1.getMazo().get(0));
            b1.getMazo().remove(0);

        }

    }

    public void cartasDisponibles() {
        System.out.println(b1.getMazo().size());
    }

    public void darCartas() {
        System.out.println(b1.getMazo().size());
        System.out.println("Ingrese cuantas cartas desea recibir");
        int cant = leer.nextInt();

        if (cant > b1.getMazo().size()) {
            System.out.println("No hay suficientes cartas en el mazo");
        } else {

            for (int i = 0; i < cant; i++) {
                siguienteCarta();
            }

        }
    }

    public void cartasMonton() {
        if (mano.isEmpty()) {
            System.out.println("No hay cartas en tu mano");
        } else {
            System.out.println("Las cartas de tu mano son: ");
            for (Carta aux : mano) {
                System.out.println(aux);
            }
        }
    }

    public void ordenarMazo() {
        b1.getMazo().sort(comparators.Comparadores.ordenarBaraja);
    }

    public void ordenarMano() {
        mano.sort(comparators.Comparadores.ordenarBaraja);
    }

}
