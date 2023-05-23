
package entidad;

import enumeracion.Color;
import enumeracion.Tipo;
import java.time.LocalDate;


public class Vehiculo {
    
    private String Marca;
    private String modelo;
    private LocalDate año;
    private String numeroDeMotor;
    private String chasis;
    private Color color;
    private Tipo tipo;

    public Vehiculo() {
    }

    public Vehiculo(String Marca, String modelo, LocalDate año, String numeroDeMotor, String chasis, Color color, Tipo tipo) {
        this.Marca = Marca;
        this.modelo = modelo;
        this.año = año;
        this.numeroDeMotor = numeroDeMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getAño() {
        return año;
    }

    public void setAño(LocalDate año) {
        this.año = año;
    }

    public String getNumeroDeMotor() {
        return numeroDeMotor;
    }

    public void setNumeroDeMotor(String numeroDeMotor) {
        this.numeroDeMotor = numeroDeMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "[Marca: " + Marca + ", Modelo: " + modelo + ", Tipo: " + tipo + ']';
    }
    
    
    
}
