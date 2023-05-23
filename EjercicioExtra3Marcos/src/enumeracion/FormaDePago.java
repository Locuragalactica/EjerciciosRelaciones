package enumeracion;

public enum FormaDePago {
    EFECTIVO("Efectivo"), TARJETA_DEBITO("Tarjeta de debito"), TRANSFERENCIA("Transferencias bancarias"), TARJETA_CREDITO("Tarjeta de credito"), PAGO_MOVIL("Pagos moviles");

    private FormaDePago(String nombre) {
        this.nombre = nombre;
    }
    
    private final String nombre;

    @Override
    public String toString() {
        return nombre;
    }
    
    

}
