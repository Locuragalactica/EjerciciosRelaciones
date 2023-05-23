package servicios;

import entidades.Cine;
import entidades.Espectador;
import enumeraciones.Nombres;

public class EspectadorServicios {

    Espectador e1;

    public void crearEspectadores(Cine c1) {

        for (Nombres aux : enumeraciones.Nombres.values()) {
            e1 = new Espectador();
            e1.setNombre(aux.toString());
            e1.setEdad((int) (Math.random() * 99));
            e1.setDineroDisp((int) (Math.random() * 5000));

            //Prueba de que funciona
            //e1.setEdad(20);
            //e1.setDineroDisp(2000);
            c1.getEspectadores().add(e1);
        }

    }

}
