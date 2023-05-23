package servicios;

import entidades.Revolver;

public class JugadorServicios {

    public boolean disparo(Revolver r) {
        boolean mojado = false;
        if (r.getRs().mojar(r)) {
            mojado = true;
        } else {
            r.getRs().siguienteChorro(r);
        }
        return mojado;
    }
}
