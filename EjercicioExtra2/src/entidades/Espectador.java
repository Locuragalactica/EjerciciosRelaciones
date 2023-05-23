package entidades;

public class Espectador {

    /*
    el espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
     */
    private String nombre;
    private int edad;
    private Integer dineroDisp;

    public Espectador() {
    }

    public Espectador(String nombre, int edad, Integer dineroDisp) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisp = dineroDisp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Integer getDineroDisp() {
        return dineroDisp;
    }

    public void setDineroDisp(Integer dineroDisp) {
        this.dineroDisp = dineroDisp;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n"
                + "Edad: " + edad + "\n"
                + "Dinero Disponible: " + dineroDisp;
    }

}
