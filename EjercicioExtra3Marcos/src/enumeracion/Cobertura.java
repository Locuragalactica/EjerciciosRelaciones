package enumeracion;

public enum Cobertura {
    
    TODO_RIESGO("Todo riesgo"), CONTRA_TERCEROS("Contra terceros"), TOTAL("Total"), PARCIAL("Parcial"), RESP_CIVIL("Responsabilidad civil");
    
    private Cobertura(String nombre) {
        this.nombre = nombre;
    }
    
    private final String nombre;

    @Override
    public String toString() {
        return nombre;
    }
    
}
