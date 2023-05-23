/*
d. Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
etc.).
 */
package servicio;

import entidad.Cliente;
import entidad.Poliza;
import entidad.Vehiculo;
import enumeracion.Cobertura;
import enumeracion.FormaDePago;
import enumeracion.Tipo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioPoliza {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Poliza p1;
    ArrayList<Poliza> polizas;
    Cliente c;
    Vehiculo v;
    
    public Cliente crearCliente() {      
        c = new Cliente();
        System.out.println("Para registrase debe ingresar los siguientes datos: \n"
                + "Nombre, Apellido, Documento");   
        System.out.print("Nombre: ");
        c.setNombre(leer.next());
        System.out.print("Apellido: ");
        c.setApellido(leer.next());
        System.out.print("DNI: ");
        c.setDocumento(leer.next());       
        p1.setCliente(c);
        return c;
    }
    
    public Vehiculo crearVehiculo() {
        v = new Vehiculo();
        System.out.println("Ingrese los siguientes datos del vehiculo: \n"
                + "Marca, Modelo, Tipo de auto");
        System.out.print("Marca: ");
        v.setMarca(leer.next());
        System.out.print("Modelo: ");
        v.setModelo(leer.next());
        
        System.out.println("Seleccione el tipo de vehiculo: ");
        for (Tipo aux : Tipo.values()) {
            System.out.print(aux.toString() + "  ");
        }
        System.out.println("");
        System.out.print("Tipo: ");

        String tipo = leer.next();

        for (Tipo aux : Tipo.values()) {
            if (tipo.equalsIgnoreCase(aux.toString())) {
                v.setTipo(aux);
            }
        }
 
        //System.out.println("Tipo: Predefinido Camion");
        //v.setTipo(Tipo.CAMION);
        p1.setAuto(v); 
        
        return v;
    }
    

    public Poliza registrarPoliza() {

       
        p1 = new Poliza();
        
        crearCliente();

        crearVehiculo();

        System.out.println("Generando N° de la Poliza");
        int nPoliza = (int) (Math.random() * 500000000);
        p1.setnPoliza(Integer.toString(nPoliza));        

        System.out.println("Digite la fecha en la que contactó nuestros servicios, digite DD/MM/aaAA");
        System.out.print("Dia: ");
        int d = leer.nextInt();
        System.out.print("Mes: ");
        int m = leer.nextInt();
        System.out.print("Año: ");
        int aA = leer.nextInt();
        p1.setFechaInicio(LocalDate.of(aA, m, d));
        p1.setFechaFin(LocalDate.of(aA + 1, m, d));
                
        System.out.println("Digite la cantidad de cuotas a pagar (1/3/6/12)");
        System.out.print("Cuotas: ");
        int cuota = leer.nextInt();
        p1.setCantidadDeCuotas(cuota);

        System.out.println("Seleccione el medio de pago va a utilizar de los siguientes: ");
        for (FormaDePago aux : FormaDePago.values()) {
            System.out.print(aux.toString() + "  ");
        }
        System.out.println("");
        System.out.print("Forma de Pago: ");

        String formaDePago2 = leer.next();

        for (FormaDePago aux : FormaDePago.values()) {
            if (formaDePago2.equalsIgnoreCase(aux.toString())) {
                p1.setFormaDePago(aux);
            }
        }
        
        System.out.println("Seteando el valor del Monto Asegurado segun el Tipo de vehiculo");
        switch (v.getTipo().toString()) {
            case "Automovil":
                p1.setMontoAsegurado(50000);
                break;
            case "Camioneta":
                p1.setMontoAsegurado(75000);
                break;
            case "Camion":
                p1.setMontoAsegurado(100000);
                break;
            case "Convertible":
                p1.setMontoAsegurado(120000);
                break;
            case "Sedan":
                p1.setMontoAsegurado(90000);
                break;
            case "Moto":
                p1.setMontoAsegurado(40000);
                break;
            case "Cuatrimoto":
                p1.setMontoAsegurado(60000);
                break;
        }
        
        System.out.println("Desea que su poliza lo cobra contra granizo (s/n): ");
        String opc = leer.next().toUpperCase();
        if (opc.equals("S")) {
            p1.setIncluyeGranizo(true);
            p1.setMontoGranizo(10000);
            p1.setMontoAsegurado(p1.getMontoAsegurado() + p1.getMontoGranizo());
        } else {
            p1.setMontoGranizo(0);
            p1.setIncluyeGranizo(false);
        }       

        System.out.println("Seleccione las coberturas disponibles, las cuales son: ");

        for (Cobertura aux : Cobertura.values()) {
            System.out.print(aux.toString() + "  ");
        }

        System.out.println("");
        System.out.print("Cobertura: ");
        String cobertura2 = leer.next();

        for (Cobertura aux : Cobertura.values()) {
            if (cobertura2.equalsIgnoreCase(aux.toString())) {
                p1.setTipoCobertura(aux);
            }
        }
        
        System.out.println("Registro Completo");
        
        return p1;
        //polizas.add(p1);
        
    }
    
    /*public ArrayList<Poliza> cargarPolizas() {
        
        polizas = new ArrayList();
        
        System.out.println("Ingrese la cantidad de usuarios a registrarse");
        System.out.print("Cantidad: ");
        int cantidad = leer.nextInt();
        
        for (int i = 0; i < cantidad; i++) {
            
            polizas.add(registrarPoliza());
            
        }

        return polizas;
    }*/
    

    public void consultaCompleta(ArrayList<Poliza> polizas) {

        //polizas = new ArrayList();
        
        System.out.println("Digite el nombre del cliente para mostrar su informacion");
        System.out.print("Nombre: ");
        String nombreCliente = leer.next();        
        for (int i = 0; i < polizas.size(); i++) {
            if (polizas.get(i).getCliente().getNombre().equalsIgnoreCase(nombreCliente)) {
                System.out.println(polizas.get(i));
            }
        }
        
        //System.out.println(polizas.size());
        //System.out.println(polizas);
        
        /*for (Poliza aux : polizas) {
            if (aux.getCliente().getNombre().equalsIgnoreCase(nombreCliente)) {
                System.out.println(aux);
            }
        }*/
        
        
    }

    public void consultaDeCuotas(ArrayList<Poliza> polizas) {
        
        
        
        System.out.println("Digite su nombre para mostrar la informacion de las cuotas");
        System.out.print("Nombre: ");
        String nombreCliente = leer.next();
        /*for (int i = 0; i < polizas.size(); i++) {
            if (polizas.get(i).getCliente().getNombre().equalsIgnoreCase(nombreCliente)) {
                System.out.println(polizas.get(i).toStringCuotas());
            }
        }*/
        
        for (Poliza aux : polizas) {
            if (aux.getCliente().getNombre().equalsIgnoreCase(nombreCliente)) {
                System.out.println(aux.toStringCuotas());
            }
        }

        for (Poliza aux : polizas) {

            if (aux.getCliente().getNombre().equalsIgnoreCase(nombreCliente)) {

                System.out.print("Monto total asegurado: ");
                System.out.println(aux.getMontoAsegurado());
                
                int montoAnualSeguro = aux.getMontoAsegurado() / 10;

                System.out.print("Monto anual del seguro contratado: ");
                System.out.println(montoAnualSeguro);

                int montoSegunCuotas = montoAnualSeguro / aux.getCantidadDeCuotas();

                System.out.print("Cantidad de cuotas: ");
                System.out.println(aux.getCantidadDeCuotas());

                System.out.print("Monto a pagar segun las cuotas establecidas: ");
                System.out.println(montoSegunCuotas);

                System.out.print("Forma de pago: ");
                System.out.println(aux.getFormaDePago());

                System.out.println("Esta pagada: ");

                System.out.println("Fecha de vencimiento: ");

            }

        }

        
       
        
        

    }

}
