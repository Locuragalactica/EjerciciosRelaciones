package entidades;

import servicios.RevolverServicios;

public class Revolver {

    private Integer posAct;
    private Integer posAgua;
    RevolverServicios rs = new RevolverServicios();

    public RevolverServicios getRs() {
        return rs;
    }

    public void setRs(RevolverServicios rs) {
        this.rs = rs;
    }

    public Revolver() {
    }

    public Revolver(Integer posAct, Integer posAgua) {
        this.posAct = posAct;
        this.posAgua = posAgua;
    }

    public Integer getPosAct() {
        return posAct;
    }

    public void setPosAct(Integer posAct) {
        this.posAct = posAct;
    }

    public Integer getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(Integer posAgua) {
        this.posAgua = posAgua;
    }

    @Override
    public String toString() {
        return "Revolver: \n"
                + "Posición Actual del tambor: " + posAct + "\n"
                + "Posición del agua: " + posAgua;
    }

}
