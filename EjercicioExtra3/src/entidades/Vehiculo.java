package entidades;

public class Vehiculo {

    private String marca;
    private String modelo;
    private String color;
    private String tipo;
    private Integer anio;
    private String nroMotor;
    private String chasis;
    private Poliza p1;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String color, String tipo, Integer anio, String nroMotor, String chasis, Poliza p1) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipo = tipo;
        this.anio = anio;
        this.nroMotor = nroMotor;
        this.chasis = chasis;
        this.p1 = p1;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getNroMotor() {
        return nroMotor;
    }

    public void setNroMotor(String nroMotor) {
        this.nroMotor = nroMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public Poliza getP1() {
        return p1;
    }

    public void setP1(Poliza p1) {
        this.p1 = p1;
    }

    @Override
    public String toString() {
        return "--------------------------------------\n"
                + "Marca: " + marca + "\n"
                + "Modelo: " + modelo + "\n"
                + "Color: " + color + "\n"
                + "Tipo: " + tipo + "\n"
                + "Año: " + anio + "\n"
                + "Nro Motor: " + nroMotor + "\n"
                + "Chasis: " + chasis + "\n"
                + "Poliza: " + p1.getNroPoliza();

    }

}
