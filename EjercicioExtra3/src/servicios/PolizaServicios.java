package servicios;

import entidades.Cliente;
import entidades.GestionCuotas;
import entidades.Poliza;
import entidades.Vehiculo;
import enumeraciones.MarcaAuto;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

public class PolizaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Cliente> clientes = new ArrayList<>();

    public Cliente ingresarCliente(Cliente c1) {

        /////////////////////REGISTRO CLIENTE///////////////////
        System.out.println("Registro del cliente");
        System.out.println("----------------------------------------------------");
        System.out.println("Ingrese el nombre del cliente");
        c1.setNombre(leer.next());
        System.out.println("Ingrese el apellido del cliente");
        c1.setApellido(leer.next());
        System.out.println("Ingrese el mail del cliente");
        c1.setMail(leer.next());
        System.out.println("Ingrese el domicilio del cliente");
        c1.setDomicilio(leer.next());
        System.out.println("Ingrese el DNI del cliente");
        c1.setDNI(leer.nextInt());
        System.out.println("Ingrese el telefono del cliente");
        c1.setTel(leer.next());

        /////////////////////REGISTRO VEHICULOS///////////////////
        System.out.println("Ingrese la cantidad de vehiculos que desea asegurar: ");
        int cant = leer.nextInt();

        for (int i = 0; i < cant; i++) {
            System.out.println("Registro del vehiculo: " + (i + 1) + " del cliente");
            System.out.println("----------------------------------------------------");
            ingresarVehiculo(c1);
            c1.getPropCoche().add(c1.getV1());
        }

        return c1;
    }

    public Vehiculo ingresarVehiculo(Cliente c1) {
        Vehiculo v1 = new Vehiculo();
        int cont = 1;
        System.out.println("Ingrese la marca del coche");

        for (MarcaAuto aux : enumeraciones.MarcaAuto.values()) {
            System.out.println(cont + "-" + aux);
            cont++;
        }
        v1.setMarca(leer.next());
        System.out.println("Ingrese el modelo del coche");
        v1.setModelo(leer.next());
        System.out.println("Ingrese el color del coche");
        v1.setColor(leer.next());
        System.out.println("Ingrese el tipo de coche");
        v1.setTipo(leer.next());
        System.out.println("Ingrese el año del coche");
        v1.setAnio(leer.nextInt());
        System.out.println("Ingrese el numero de motor del coche");
        v1.setNroMotor(leer.next());
        System.out.println("Ingrese el numero chasis del coche");
        v1.setChasis(leer.next());

        c1.setV1(v1);

        /////////////////////REGISTRO POLIZA///////////////////
        System.out.println("Registro de poliza del coche");
        System.out.println("----------------------------------------------------");
        ingresarPoliza(c1);

        return v1;

    }

    public void ingresarPoliza(Cliente c1) {
        Poliza p1 = new Poliza();
        p1.setNroPoliza((int) (Math.random() * 13246));
        System.out.println("Ingrese la fecha de inicio de la poliza (aaaa-mm-dd)");
        String fecha = leer.next();
        p1.setFechaIni(LocalDate.parse(fecha));
        System.out.println("Ingrese la fecha de finalizacion de la poliza (aaaa-mm-dd)");
        fecha = leer.next();
        p1.setFechaFin(LocalDate.parse(fecha));
        System.out.println("Ingrese la cantidad de cuotas: (3-6-9-12)");
        p1.setCantCuotas(leer.nextInt());
        System.out.println("Ingrese la forma de pago (Debito-Credito-Efectivo)");
        p1.setFormaPago(leer.next());
        System.out.println("¿Que tipo de cobertura tiene? (Total-Parcial-Contra Terceros)");
        p1.setTipCobertura(leer.next());
        System.out.println("¿Cuenta con poliza de granizo? S/N");
        p1.setGranizo(seguroGranizo());
        System.out.println("Ingrese el monto total a asegurar: ");
        p1.setMontTotal(leer.nextFloat());

        c1.getV1().setP1(p1);
        montoSeguro(c1);

        c1.getV1().getP1().setMontGranizo((float) 10000);

        for (int i = 0; i < p1.getCantCuotas(); i++) {
            GestionCuotas g1 = new GestionCuotas();
            p1.getGestCuot().add(admCuotas(g1, (i + 1), p1));
        }
        c1.getV1().setP1(p1);
    }

    public boolean seguroGranizo() {
        String sgran = leer.next();
        if (sgran.equalsIgnoreCase("S")) {
            return true;
        } else {
            return false;
        }
    }

    public GestionCuotas admCuotas(GestionCuotas g1, int i, Poliza p1) {
        g1.setNroCuota(i);
        g1.setTotalCuota(p1.getMontTotal() / p1.getCantCuotas());
        g1.setPagada(false);

        g1.setFechaVenc(p1.getFechaFin());     
        return g1;
    }

    public void montoSeguro(Cliente c1) {
        float monto;
        if (c1.getV1().getAnio() > 2020) {
            monto = 15000;
        } else if (c1.getV1().getAnio() > 2015 && c1.getV1().getAnio() < 2020) {
            monto = 10000;
        } else if (c1.getV1().getAnio() > 2000 && c1.getV1().getAnio() < 2015) {
            monto = 7500;
        } else {
            monto = 5000;
        }

        if (c1.getV1().getP1().getGranizo()) {
            c1.getV1().getP1().setMontTotal(monto + 10000);
        } else {
            c1.getV1().getP1().setMontTotal(monto);
        }

    }

    public void menu() {
        creacionClientes();
        int rta;
        String rta2 = "";
        System.out.println("Bienvenido al sistema de polizas de la Tercera Seguros");
        System.out.println("-------------------------------------------------------");
        do {
            System.out.println("\u001B[41m ----------MENU----------");
            System.out.println("\u001B[41m");
            System.out.println("\u001B[41m1- Ingresar nuevo Cliente");
            System.out.println("\u001B[41m2- Buscar cliente por apellido");
            System.out.println("\u001B[41m3- Buscar por numero de poliza");
            System.out.println("\u001B[41m4- Salir");

            rta = leer.nextInt();
            if (rta == 4) {
                System.out.println("¿Esta seguro que desea salir? S/N");
                rta2 = leer.next();
                if (rta2.equals("s")) {
                    break;
                }
            }
            switch (rta) {
                case 1:
                    System.out.println("-------------------------------------");
                    Cliente c1 = new Cliente();
                    clientes.add(ingresarCliente(c1));
                    System.out.println("-------------------------------------");
                    break;
                case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("Ingrese el apellido del cliente a buscar");
                    String busc = leer.next();
                    for (Cliente aux : clientes) {
                        if (aux.getApellido().equalsIgnoreCase(busc)) {
                            System.out.println("Ingrese la opción que desea ver");

                            System.out.println("1- Datos Cliente");
                            System.out.println("2- Datos de sus vehiculos");
                            System.out.println("3- Datos de sus polizas");
                            System.out.println("4- Gestion de sus cuotas");

                            int opc = leer.nextInt();

                            switch (opc) {
                                case 1:
                                    System.out.println(aux);
                                    break;
                                case 2:
                                    System.out.println("El cliente tiene: " + aux.getPropCoche().size() + " vehiculos asegurados");
                                    for (Vehiculo auxvehiculo : aux.getPropCoche()) {
                                        System.out.println(auxvehiculo);
                                    }
                                    break;
                                case 3:
                                    System.out.println("El cliente tiene: " + aux.getPropCoche().size() + " vehiculos asegurados");
                                    for (Vehiculo auxvehiculo : aux.getPropCoche()) {
                                        System.out.println(auxvehiculo.getP1());
                                    }
                                    break;
                                case 4:
                                    System.out.println("El cliente tiene: " + aux.getPropCoche().size() + " vehiculos asegurados");
                                    for (Vehiculo auxvehiculo : aux.getPropCoche()) {
                                        System.out.println(auxvehiculo.getP1().getGestCuot());
                                    }
                                    break;

                            }

                        }
                    }
                    System.out.println("-------------------------------------");

                    break;
                case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("Ingrese el numero de poliza a buscar");
                    int opc = leer.nextInt();
                    boolean confirm = false;
                    for (Cliente aux : clientes) {
                        if (aux.getV1().getP1().getNroPoliza() == opc) {
                            System.out.println("El Cliente dueño de esa poliza es: \n"
                                    + "" + aux);
                            System.out.println("Los datos del coche asegurado son: \n"
                                    + "" + aux.getV1());
                            System.out.println("Los datos de la poliza son: \n"
                                    + "" + aux.getV1().getP1());
                            confirm = true;
                        }
                    }

                    if (!confirm) {
                        System.out.println("La poliza no se encuentra registrada en el sistema");
                    }
                    System.out.println("-------------------------------------");
                    break;
            }
        } while (!rta2.equals("s"));
    }

    public void creacionClientes() {

        Poliza polnuev = new Poliza(LocalDate.of(2023, Month.MARCH, 05), LocalDate.of(2024, Month.MARCH, 25), 6, "Efectivo", ((float) 12454.05), true, ((float) 12345.05), "Total", 863454);
        Poliza polnuev2 = new Poliza(LocalDate.of(2023, Month.APRIL, 05), LocalDate.of(2024, Month.APRIL, 25), 9, "Efectivo", ((float) 52324.05), true, ((float) 535445.05), "Parcial", 153547);
        Poliza polnuev3 = new Poliza(LocalDate.of(2023, Month.AUGUST, 05), LocalDate.of(2024, Month.AUGUST, 25), 12, "Efectivo", ((float) 122123.05), true, ((float) 3531.05), "Total", 123545);

        Vehiculo venuev = new Vehiculo("Audi", "C1", "Negro", "Coupe", 2023, "1234222", "1234224", polnuev);
        Vehiculo venuev2 = new Vehiculo("BMW", "A4", "Blanco", "Camioneta", 2023, "845383", "43453453", polnuev2);
        Vehiculo venuev3 = new Vehiculo("Chevrolet", "Corsa", "Azul", "Coupe", 2023, "134538", "8645645", polnuev3);

        Cliente clnuev = new Cliente("Jorge", "Perez", "jorPerez@gmail.com", "Las heras 371", 35323410, "01115417150", venuev);
        Cliente clnuev2 = new Cliente("Juana", "Arco", "juanAr@gmail.com", "Las heras 371", 38654987, "387989888", venuev2);
        Cliente clnuev3 = new Cliente("Elias", "Demetri", "Elidemi@gmail.com", "Jorge Lima 222", 37878951, "654533333", venuev3);
        clnuev.getPropCoche().add(venuev);
        clnuev.getPropCoche().add(venuev2);
        clnuev.getPropCoche().add(venuev3);

        clnuev2.getPropCoche().add(venuev2);
        clnuev3.getPropCoche().add(venuev3);

        clientes.add(clnuev);
        clientes.add(clnuev2);
        clientes.add(clnuev3);
    }

}
