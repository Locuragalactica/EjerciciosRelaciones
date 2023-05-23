/*
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package Revolver;

/**
 *
 * @author PAVILION
 */
public class Revolver {
    private int posI;
    private int posA;

    public Revolver() {
    }

    public Revolver(int posI, int posA) {
        this.posI = posI;
        this.posA = posA;
    }

    public int getPosI() {
        return posI;
    }

    public void setPosI(int posI) {
        this.posI = posI;
    }

    public int getPosA() {
        return posA;
    }

    public void setPosA(int posA) {
        this.posA = posA;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posI=" + posI + ", posA=" + posA + '}';
    }
    
    public void llenarRevolver(){
        posI=(int)(Math.random()*6+1);
        posA=(int)(Math.random()*6+1);
        System.out.println(posI);
        System.out.println(posA);
    }
    
    public boolean mojar(){
        boolean mojado=false; 
        if (posA==posI) {
            mojado=true;
        }else{
            siguienteChorro();
        }
        return mojado;
    }
    public void siguienteChorro(){
        if (posI==6) {
            posI=0;
        }
        posI+=1;
    }
}
