package entidades;

import entidades.Vehiculo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Poliza {

    private LocalDate fechaIni;
    private LocalDate fechaFin;
    private Integer cantCuotas;
    private String formaPago;
    private Float montTotal;
    private Boolean granizo;
    private Float montGranizo;
    private String tipCobertura;
    private Integer nroPoliza;
    private ArrayList<GestionCuotas> gestCuot = new ArrayList<>();

    public Poliza() {
    }

    public Poliza(LocalDate fechaIni, LocalDate fechaFin, Integer cantCuotas, String formaPago, Float montTotal, Boolean granizo, Float montGranizo, String tipCobertura, Integer nroPoliza) {
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.cantCuotas = cantCuotas;
        this.formaPago = formaPago;
        this.montTotal = montTotal;
        this.granizo = granizo;
        this.montGranizo = montGranizo;
        this.tipCobertura = tipCobertura;
        this.nroPoliza = nroPoliza;
    }

    public LocalDate getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(LocalDate fechaIni) {
        this.fechaIni = fechaIni;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(Integer cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Float getMontTotal() {
        return montTotal;
    }

    public void setMontTotal(Float montTotal) {
        this.montTotal = montTotal;
    }

    public Boolean getGranizo() {
        return granizo;
    }

    public void setGranizo(Boolean granizo) {
        this.granizo = granizo;
    }

    public Float getMontGranizo() {
        return montGranizo;
    }

    public void setMontGranizo(Float montGranizo) {
        this.montGranizo = montGranizo;
    }

    public String getTipCobertura() {
        return tipCobertura;
    }

    public void setTipCobertura(String tipCobertura) {
        this.tipCobertura = tipCobertura;
    }

    public Integer getNroPoliza() {
        return nroPoliza;
    }

    public void setNroPoliza(Integer nroPoliza) {
        this.nroPoliza = nroPoliza;
    }

    public ArrayList<GestionCuotas> getGestCuot() {
        return gestCuot;
    }

    public void setGestCuot(ArrayList<GestionCuotas> gestCuot) {
        this.gestCuot = gestCuot;
    }

    @Override
    public String toString() {
        return "--------------------------------------\n"
                + "Poliza nro: " + nroPoliza + "\n"
                + "Fecha Inicio: " + fechaIni + "\n"
                + "Fecha Fin: " + fechaFin + "\n"
                + "Tipo de Cobertura: " + tipCobertura + "\n"
                + "Cuenta con seguro de granizo: " + granizo + "\n"
                + "Monto Granizo: " + montGranizo + "\n"
                + "Monto Total Asegurado: " + montTotal + "\n"
                + "Cantidad de Cuotas: " + cantCuotas + "\n"
                + "FormaPago: " + formaPago + "\n";
    }

}
