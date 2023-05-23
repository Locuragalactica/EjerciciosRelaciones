package entidad;

public class Revolver {
    private Integer posI;
    private Integer posAgua;

    public Revolver() {
    }

    public int getPosI() {
        return posI;
    }

    public void setPosI(Integer posI) {
        this.posI = posI;
    }

    public int getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(Integer posAgua) {
        this.posAgua = posAgua;
    }
    
    @Override
    public String toString() {
        return "Posición actual:" + posI + " |    Posición Agua=" + posAgua;
    }
    
    
}
