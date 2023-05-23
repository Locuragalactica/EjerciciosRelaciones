package servicios;

import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class AdopcionServicios {

    Scanner leer = new Scanner(System.in);
    ArrayList<Persona> adoptantes = new ArrayList<>();
    ArrayList<Perro> perrosDisponibles = new ArrayList<>();

    public void crearPersonas() {
        adoptantes.add(new Persona("Jorge", "Perez", 34021415, 25));
        adoptantes.add(new Persona("Juana", "Lorenz", 28654124, 33));
        adoptantes.add(new Persona("Osvaldo", "Lamas", 14587986, 45));
        adoptantes.add(new Persona("Rene", "Estebanez", 7545666, 62));
        adoptantes.add(new Persona("Laura", "Dali", 1245687, 80));
    }

    public void crearPerros() {
        perrosDisponibles.add(new Perro("Pepo", enumeraciones.Razas.BEAGLE.toString(), "Chiquito", 4, false));
        perrosDisponibles.add(new Perro("Josefa", enumeraciones.Razas.CANICHE.toString(), "Chiquito", 6, false));
        perrosDisponibles.add(new Perro("Toto", enumeraciones.Razas.PASTOR_ALEMAN.toString(), "Grande", 8, false));
        perrosDisponibles.add(new Perro("Mostaza", enumeraciones.Razas.LABRADOR.toString(), "Mediano", 2, false));
        perrosDisponibles.add(new Perro("Lulu", enumeraciones.Razas.CANICHE.toString(), "Chiquito", 1, false));
    }

    public void adopcion() {
        System.out.println("Lista de Perros para adoptar: ");
        System.out.println(" ");
        for (Perro aux : perrosDisponibles) {

            System.out.println(aux);
        }

        for (Persona aux : adoptantes) {

            boolean concreto = false;
            do {
                concreto = false;
                System.out.println(aux.getNombre().concat(" " + aux.getApellido()) + " Ingrese el nombre del perro que desea adoptar");
                String perro = leer.next();
                for (Perro auxPerro : perrosDisponibles) {
                    if (auxPerro.getNombre().equalsIgnoreCase(perro)) {
                        if (auxPerro.getAdoptado().equals(false)) {
                            aux.setMascota(auxPerro);
                            auxPerro.setAdoptado(true);
                            concreto = true;
                            System.out.println("Usted ha adoptado a: " + perro);
                        } else {
                            System.out.println("El perro ya ha sido adoptado.");
                        }
                    }
                }
            } while (!concreto);

        }
    }

    public void mostrarAdopciones() {
        for (Persona aux : adoptantes) {
            System.out.println(aux);

        }
    }

}
