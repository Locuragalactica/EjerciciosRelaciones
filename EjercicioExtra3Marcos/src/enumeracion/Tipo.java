
package enumeracion;


public enum Tipo {
    AUTOMOVIL("Automovil"), CAMIONETA("Camioneta"), CAMION("Camion"), CONVERTIBLE("Convertible"), SEDAN("Sedan"), MOTO("Moto"), CUATRIMOTO("Cuatrimoto");
    
    private Tipo(String nombre) {
        this.nombre = nombre;
    }
    
    private final String nombre;

    @Override
    public String toString() {
        return nombre;
    }
}
