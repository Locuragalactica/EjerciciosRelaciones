package utilidades;

import entidades.Alumno;
import java.util.Comparator;

public class Comparadores {

    public static Comparator<Alumno> compararVotos = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno t, Alumno t1) {
            return t1.getCantVot().compareTo(t.getCantVot());
        }
    };

}
