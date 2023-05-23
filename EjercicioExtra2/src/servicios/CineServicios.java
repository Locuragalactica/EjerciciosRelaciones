package servicios;

import entidades.Asiento;
import entidades.Cine;
import entidades.Espectador;
import java.util.ArrayList;
import java.util.Scanner;

public class CineServicios {

    Scanner leer = new Scanner(System.in);
    Cine c1 = new Cine();
    EspectadorServicios es = new EspectadorServicios();
    PeliculaServicios ps = new PeliculaServicios();
    Asiento a1;

    public void llamarEspectador() {
        es.crearEspectadores(c1);
    }

    public void llamarPelicula() {
        ps.crearPeliculas(c1);
    }

    public void imprimirEspectadores() {
        System.out.println(c1.getEspectadores());
    }

    public void crearAsiento() {
        char let;
        for (int i = 8; i > 0; i--) {
            for (int j = 0; j < 6; j++) {
                a1 = new Asiento();
                let = (char) ('A' + j);
                a1.setNum(i);
                a1.setLetra(String.valueOf(let));
                a1.setOcupado(false);
                c1.getSala()[i - 1][j] = (a1);
            }
        }
    }

    public void imprimirAsiento() {
        for (int i = 8; i > 0; i--) {
            for (int j = 0; j < 6; j++) {
                System.out.print(c1.getSala()[(i - 1)][j]);
            }
            System.out.println(" ");
        }
    }

    public void comprarBoletos() {
        for (Espectador aux : c1.getEspectadores()) {
            if (aux.getEdad() >= 18 && aux.getDineroDisp() >= 800) {

                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 6; j++) {
                        if (!c1.getSala()[i][j].isOcupado()) {
                            c1.getSala()[i][j].setOcupado(true);
                            i = 8;
                            break;

                        }
                    }
                }
            }
        }

    }

    public void comprarBoletosRandom() {

        int lugares = 0;
        for (Espectador aux : c1.getEspectadores()) {
            if (aux.getEdad() >= 18 && aux.getDineroDisp() >= 800) {
                boolean concreto = false;
                do {
                    int x = (int) ((Math.random() * 9) - 1);
                    int y = (int) ((Math.random() * 7) - 1);
                    if (!c1.getSala()[x][y].isOcupado()) {
                        c1.getSala()[x][y].setOcupado(true);
                        concreto = true;
                        lugares++;
                    }
                } while (!concreto && lugares < 48);

            }
        }

    }

}
