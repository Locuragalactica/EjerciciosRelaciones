package entidades;

public class Perro {

    private String nombre, raza, tamanio;
    private int edad;

    public Perro() {
    }

    public Perro(String nombre, String raza, String tamaño, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.tamanio = tamaño;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamaño() {
        return tamanio;
    }

    public void setTamaño(String tamaño) {
        this.tamanio = tamaño;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + ", Raza: " + raza + ", Tamaño: " + tamanio + ", Edad: " + edad;
    }

}
