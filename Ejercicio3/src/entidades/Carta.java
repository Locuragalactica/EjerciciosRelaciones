package entidades;

public class Carta {

    private String palo;
    private Integer num;

    public Carta() {
    }

    public Carta(String palo, Integer num) {
        this.palo = palo;
        this.num = num;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return num + " " + palo;
    }

}
