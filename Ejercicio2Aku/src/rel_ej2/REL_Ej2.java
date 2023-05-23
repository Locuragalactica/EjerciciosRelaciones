package rel_ej2;

import entidad.Jugador;
import entidad.Revolver;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import servicio.servicioJuego;

public class REL_Ej2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        servicioJuego sj = new servicioJuego();

        List <Jugador> juegoJugadores = new ArrayList();
        System.out.print("Ingrese la cantidad de jugadores: ");
        int cant = leer.nextInt();
        if(cant<0 || cant>6){
            cant=6;
        }
        for (int i = 0; i < cant; i++) {
            Jugador j = new Jugador();
            j.setId(i+1);
            j.setNombre("Jugador "+j.getId());
            j.setMojado(false);
            juegoJugadores.add(j);
        }
        Revolver r = new Revolver();
        sj.llenarRevolver(r);
        System.out.println("COMIENZA EL JUEGO: " +r);
        sj.llenarJuego(juegoJugadores, r);
        
        sj.ronda(r);
        
        System.out.println("FINALIZA EL JUEGO: "+ r);
    }
    
}
