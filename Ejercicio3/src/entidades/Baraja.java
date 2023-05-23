package entidades;

import java.util.ArrayList;
import java.util.List;

public class Baraja {

    private List<Carta> mazo = new ArrayList<>();
    
    public Baraja() {
        
    }

    public List<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(List<Carta> mazo) {
        this.mazo = mazo;
    }

    @Override
    public String toString() {
        return "Baraja" + mazo;
    }

}
