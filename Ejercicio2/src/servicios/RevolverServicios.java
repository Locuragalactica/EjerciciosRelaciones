package servicios;

import entidades.Revolver;

public class RevolverServicios {

    public void llenarRevolver(Revolver r) {
        int in = (int) (Math.random() * 6) + 1;
        int ag = (int) (Math.random() * 6) + 1;
        r.setPosAct(in);
        r.setPosAgua(ag);
    }

    public boolean mojar(Revolver r) {
        boolean mojo = false;
        if (r.getPosAct() == r.getPosAgua()) {
            mojo = true;
        }
        return mojo;
    }

    public void siguienteChorro(Revolver r) {
        if (r.getPosAct() == 6) {
            r.setPosAct(1);
        } else {
            r.setPosAct((r.getPosAct() + 1));
        }

    }
}
