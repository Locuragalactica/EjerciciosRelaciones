/*
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
• 
 */
package Jugador;

import Revolver.Revolver;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author PAVILION
 */
public class Jugador {
    Scanner leer = new Scanner(System.in);
    private String iD;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(String iD, String nombre, boolean mojado) {
        this.iD = iD;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    public void crearJugadores(ArrayList<Jugador>jugadores){
        System.out.println("¿Cuantas personas van a jugar?");
        int njugadores = leer.nextInt();
        if (njugadores>6 || njugadores<1) {
            njugadores=6;
        }
        for (int iD = 0; iD < njugadores; iD++) {
            Jugador j2 = new Jugador();
            String N =Integer.toString(iD+1);
            j2.setNombre("Jugador_"+N);
            j2.setiD(N);
            j2.setMojado(false);
            jugadores.add(j2);
        }
    }

    @Override
    public String toString() {
        return "Jugador: " + nombre + " ¿Esta mojado? " + mojado;
    }
    
    public boolean disparo(Revolver r){
        if (r.mojar()) {
            mojado=true;
        }
        return mojado;
    }
    
}
//disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
//mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
//revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//devuelve true, sino false.