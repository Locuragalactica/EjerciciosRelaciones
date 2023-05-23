/*
c. Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
muchos a uno o de muchos a muchos.
*/
package entidad;

import enumeracion.Cobertura;
import enumeracion.FormaDePago;
import java.time.LocalDate;


public class Poliza {
    
    private Cliente cliente;
    private Vehiculo vehiculo;
    
    private String nPoliza;
    private LocalDate fechaInicio, fechaFin;
    private int cantidadDeCuotas;
    private FormaDePago formaDePago;
    private int montoAsegurado;
    private boolean incluyeGranizo;
    private int montoGranizo;
    private Cobertura tipoCobertura;

    public Poliza() {
    }

    public Poliza(Cliente cliente, Vehiculo vehiculo, String nPoliza, LocalDate fechaInicio, LocalDate fechaFin, int cantidadDeCuotas, FormaDePago formaDePago, int montoAsegurado, boolean incluyeGranizo, int montoGranizo, Cobertura tipoCobertura) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.nPoliza = nPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantidadDeCuotas = cantidadDeCuotas;
        this.formaDePago = formaDePago;
        this.montoAsegurado = montoAsegurado;
        this.incluyeGranizo = incluyeGranizo;
        this.montoGranizo = montoGranizo;
        this.tipoCobertura = tipoCobertura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getAuto() {
        return vehiculo;
    }

    public void setAuto(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getnPoliza() {
        return nPoliza;
    }

    public void setnPoliza(String nPoliza) {
        this.nPoliza = nPoliza;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCantidadDeCuotas() {
        return cantidadDeCuotas;
    }

    public void setCantidadDeCuotas(int cantidadDeCuotas) {
        this.cantidadDeCuotas = cantidadDeCuotas;
    }

    public FormaDePago getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(FormaDePago formaDePago) {
        this.formaDePago = formaDePago;
    }

    public int getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(int montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public boolean isIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public int getMontoGranizo() {
        return montoGranizo;
    }

    public void setMontoGranizo(int montoGranizo) {
        this.montoGranizo = montoGranizo;
    }

    public Cobertura getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(Cobertura tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    @Override
    public String toString() {
        return "Poliza a nombre de: " + cliente + " Vehiculo: " + vehiculo + "\n"
                + "N° De Poliza: " + nPoliza + ", Fecha de Inicio de la poliza: " + fechaInicio + ", Fecha de Vencimiento: " + fechaFin + "\n" + "Cantidad de cuotas a pagar: " + cantidadDeCuotas + ", Forma de pago: " + formaDePago + ", Monto que asegura la poliza: " + montoAsegurado + "\n" + "¿La poliza cubre daños ante granizo?: " + incluyeGranizo + ", Monto que cubre ante granizo: " + montoGranizo + ", Tipo de cobertura de la poliza: " + tipoCobertura + ']';
    }
    
    public String toStringCuotas() {
        return "Poliza a nombre de: " + cliente + " Vehiculo: " + vehiculo + "\n"
                + "N° De Poliza: " + nPoliza  + ", Cantidad de cuotas a pagar: " + cantidadDeCuotas + ", Forma de pago: " + formaDePago + ']';
    }
    
    
    
}
