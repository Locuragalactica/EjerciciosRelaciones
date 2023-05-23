package entidades;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import utilidades.Comparadores;

public class Simulador {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Random random = new Random();
    ArrayList<Alumno> alumnos = new ArrayList<>();
    ArrayList<Voto> votos = new ArrayList<>();

    public String generarNombres() {

        String[] nombres = {"Juan", "María", "Pedro", "Ana", "Luis", "Sofía", "Javier", "Laura", "David", "Carla"};
        String[] apellidos = {"García", "Hernández", "Martínez", "González", "López", "Pérez", "Fernández", "Rodríguez", "Sánchez", "Romero"};

        String nombreAleatorio = nombres[random.nextInt(nombres.length)].concat(" ").concat(apellidos[random.nextInt(apellidos.length)]);

        return nombreAleatorio;
    }

    public int generarDNI() {

        int dni = (int) (Math.random() * 50000000);
        return dni;
    }

    public void crearAlumnos() {
        System.out.println("Ingrese cuantos alumnos desea agregar: ");
        int cant = leer.nextInt();

        for (int i = 0; i < cant; i++) {
            Alumno a = new Alumno();
            a.setDNI(generarDNI());
            a.setNombre(generarNombres());
            a.setCantVot(0);
            alumnos.add(a);
        }
    }

    public void imprimirAlumnos() {
        Collections.sort(alumnos, Comparadores.compararVotos);
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }

    }

    public void votacion() {

        for (Alumno alumno : alumnos) {
            Voto v1 = new Voto();
            v1.setA1(alumno);
            do {
                int n = random.nextInt(alumnos.size());
                Alumno alvot = alumnos.get(n);

                if (!Objects.equals(alvot.getDNI(), alumno.getDNI()) && !v1.getVotados().contains(alvot)) {
                    v1.getVotados().add(alvot);

                    alumnos.get(n).setCantVot((alumnos.get(n).getCantVot() + 1));

                }
            } while (v1.getVotados().size() < 3);

            votos.add(v1);
        }
    }

    public void imprimirVotos() {

        for (Voto aux : votos) {

            System.out.println(aux);
            System.out.println("-------------------------------");
        }

    }

    public void facilitadores() {
        int i = 0;
        if (alumnos.size() < 10) {

            for (Alumno alumno : alumnos) {

                if (i < 5) {
                    System.out.print("Facilitador Titular: " + (i + 1) + " ");
                    System.out.println(alumnos.get(i));
                } else {
                    System.out.print("Facilitador Suplente: " + (i + 1) + " ");
                    System.out.println(alumnos.get(i));
                }
                i++;
            }

        } else {
            for (i = 0; i < 10; i++) {
                if (i < 5) {
                    System.out.print("Facilitador Titular: " + (i + 1) + " ");
                    System.out.println(alumnos.get(i));
                } else {
                    System.out.print("Facilitador Suplente: " + (i + 1) + " ");
                    System.out.println(alumnos.get(i));
                }

            }
        }

    }
}
