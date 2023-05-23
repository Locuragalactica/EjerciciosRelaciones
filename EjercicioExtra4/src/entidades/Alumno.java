package entidades;

public class Alumno {

    private String nombre;
    private Integer cantVot, DNI;

    public Alumno() {
    }

    public Alumno(String nombre, Integer cantVot, Integer DNI) {
        this.nombre = nombre;
        this.cantVot = cantVot;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantVot() {
        return cantVot;
    }

    public void setCantVot(Integer cantVot) {
        this.cantVot = cantVot;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Nombre Completo: " + nombre + "\n"
                + "DNI: " + DNI + "\n"
                + "Cantidad de votos: " + cantVot + "\n";
    }

}
