package ejercicioguia;

import entidades.Persona;

public class EjercicioGuia {
    
    public static void main(String[] args) {

        /*
        Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
         */
        Persona p1 = new Persona();
        
        p1.setNombre("Jorge");
        p1.setApellido("Ramone");
        p1.getDni().setDniNum("Lolo");
        p1.getDni().setNum(0);
        
        System.out.println(p1);
        
    }
    
}
