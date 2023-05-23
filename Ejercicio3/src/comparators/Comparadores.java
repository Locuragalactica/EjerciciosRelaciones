package comparators;

import entidades.Carta;
import java.util.Comparator;

public class Comparadores {

    public static Comparator<Carta> ordenarBaraja = (Carta p1, Carta p2) -> p1.getNum().compareTo(p2.getNum());

}
