package entidades;

import entidades.Vehiculo;
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {

    private String nombre;
    private String apellido;
    private String mail;
    private String domicilio;
    private Integer DNI;
    private String tel;
    private Vehiculo v1;
    private ArrayList<Vehiculo> propCoche = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String mail, String domicilio, Integer DNI, String tel, Vehiculo v1) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.domicilio = domicilio;
        this.DNI = DNI;
        this.tel = tel;
        this.v1 = v1;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Vehiculo getV1() {
        return v1;
    }

    public void setV1(Vehiculo v1) {
        this.v1 = v1;
    }

    public ArrayList<Vehiculo> getPropCoche() {
        return propCoche;
    }

    public void setPropCoche(ArrayList<Vehiculo> propCoche) {
        this.propCoche = propCoche;
    }

    @Override
    public String toString() {
        return "----------------------------------------\n"
                + "Nombre: " + nombre + " " + apellido + "\n"
                + "Mail: " + mail + "\n"
                + "Domicilio: " + domicilio + "\n"
                + "DNI: " + DNI + "\n"
                + "Telefono: " + tel + "\n"
                + "Vehiculo: \n";
//                + "" + v1;
    }

}
