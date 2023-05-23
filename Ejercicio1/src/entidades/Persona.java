package entidades;

public class Persona {

    private String nombre, apellido;
    private int edad, documento;
    private Perro pichicho;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, int documento, Perro pichicho) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.pichicho = pichicho;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Perro getPichicho() {
        return pichicho;
    }

    public void setPichicho(Perro pichicho) {
        this.pichicho = pichicho;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + apellido + "\n"
                + "Edad: " + edad + "\n"
                + "Documento: " + documento + "\n"
                + "Perro: " + pichicho;
    }

}
