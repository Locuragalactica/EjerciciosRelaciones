package enumeraciones;

public enum MarcaAuto {
    ALFA_ROMEO("Alfa Romeo"), AUDI("Audi"), BMW("BMW"), CHEVROLET("Chevrolet"), CITROEN("Citroen"), FIAT("Fiat"), FORD("Ford"), HONDA("Honda");

    private String marca;

    private MarcaAuto(String marca) {
        this.marca = marca;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
