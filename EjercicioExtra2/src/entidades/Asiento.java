package entidades;

public class Asiento {

    private Integer num;
    private String letra;
    private boolean ocupado;

    public Asiento() {
    }

    public Asiento(Integer num, String letra, boolean ocupado) {
        this.num = num;
        this.letra = letra;
        this.ocupado = ocupado;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        if (ocupado) {
            return num + " " + letra + " X" + " | ";
        } else {
            return num + " " + letra + " -" + " | ";
        }

    }

}
