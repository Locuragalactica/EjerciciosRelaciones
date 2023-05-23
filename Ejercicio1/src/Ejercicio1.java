
import entidades.Perro;
import entidades.Persona;

public class Ejercicio1 {

    public static void main(String[] args) {

        /*
        Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
         */
        Perro pocho = new Perro("Pocho", "Caniche", "mediano", 6);
        Perro oreo = new Perro("Oreo", "Jack Russell", "pequeño", 3);

        Persona p1 = new Persona("Juan", "Perez", 25, 34576222, pocho);
        Persona p2 = new Persona("Laura", "Gomez", 45, 28978544, oreo);

        System.out.println(p1);
        System.out.println(p2);

    }

}
