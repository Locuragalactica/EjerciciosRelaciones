package entidades;

public class Perro {

    private String nombre, raza, tamanio;
    private Integer edad;
    private Boolean adoptado;

    public Perro() {
    }

    public Perro(String nombre, String raza, String tamanio, Integer edad, Boolean adoptado) {
        this.nombre = nombre;
        this.raza = raza;
        this.tamanio = tamanio;
        this.edad = edad;
        this.adoptado = adoptado;

    }

    public Boolean getAdoptado() {
        return adoptado;
    }

    public void setAdoptado(Boolean adoptado) {
        this.adoptado = adoptado;
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

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\t\t"
                + "Raza: " + raza + "\t\t"
                + "Tamaño: " + tamanio + "\t\t"
                + "Edad: " + edad;
    }

}
