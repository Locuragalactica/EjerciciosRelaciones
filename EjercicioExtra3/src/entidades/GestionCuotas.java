package entidades;

import java.time.LocalDate;
import java.util.Scanner;

public class GestionCuotas {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private Integer nroCuota;
    private Float totalCuota;
    private Boolean pagada;
    private LocalDate fechaVenc;

    public GestionCuotas() {
    }

    public GestionCuotas(Integer nroCuota, Float totalCuota, Boolean pagada, LocalDate fechaVenc) {
        this.nroCuota = nroCuota;
        this.totalCuota = totalCuota;
        this.pagada = pagada;
        this.fechaVenc = fechaVenc;

    }

    public Integer getNroCuota() {
        return nroCuota;
    }

    public void setNroCuota(Integer nroCuota) {
        this.nroCuota = nroCuota;
    }

    public Float getTotalCuota() {
        return totalCuota;
    }

    public void setTotalCuota(Float totalCuota) {
        this.totalCuota = totalCuota;
    }

    public Boolean getPagada() {
        return pagada;
    }

    public void setPagada(Boolean pagada) {
        this.pagada = pagada;
    }

    public LocalDate getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(LocalDate fechaVenc) {
        this.fechaVenc = fechaVenc;
    }

    @Override
    public String toString() {
        return "--------------------------------------\n"
                + "Numero de Cuota: " + nroCuota + "\n"
                + "Total de Cuotas: " + totalCuota + "\n"
                + "Pagada: " + pagada + "\n"
                + "Fecha Vencimiento: " + fechaVenc;
    }

}
