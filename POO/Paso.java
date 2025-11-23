public class Paso {
    private int numero;
    private String descripcion;

    public Paso(int numero, String descripcion) {
        this.numero = numero;
        this.descripcion = descripcion;
    }

    public String toString() {
        return "Paso " + numero + ": " + descripcion;
    }
}
