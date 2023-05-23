package servicio;

import entidad.Juego;
import entidad.Jugador;
import entidad.Revolver;
import java.util.List;

public class servicioJuego {
    Juego juego1= new Juego();
    public void llenarRevolver(Revolver r){
        r.setPosI((int)(Math.random()*6+1));
        r.setPosAgua((int)(Math.random()*6+1));
    }
    
    public boolean mojar(Revolver r){
        boolean agua=false;
        if (r.getPosI()==r.getPosAgua()){
            agua=true;
        }
        return agua;
    }
    
    public void siguienteChorro(Revolver r){
        if(r.getPosI()==6){
            r.setPosI(1);
        }else{
            r.setPosI(r.getPosI()+1);
        }
    }
    
    
    public boolean disparo(Revolver r){
        boolean mojado = false;
        if(mojar(r)){
            mojado = true;
        }else {
            siguienteChorro(r); 
        }
        return mojado;
    }
    public void ruleta (){
        System.out.println("Ingrese la cantidad de jugadores:");
        
    }
    public void llenarJuego(List <Jugador> jugadores, Revolver r){
        juego1.setJugadores(jugadores);
        juego1.setRuleta(r);
    }
    public void ronda(Revolver r){
            do {
                for (Jugador aux : juego1.getJugadores()) {
                    System.out.println("El "+ aux.getNombre() + " ejecutará su disparo.");
                    if(disparo(r)){
                        aux.setMojado(true);
                        System.out.println(aux);
                        break;
                    }
                }    
            }while(r.getPosAgua()!=r.getPosI()); 
    }
}
