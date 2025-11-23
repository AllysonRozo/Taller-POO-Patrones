public class Ingredientes {
    private String nombre;
    private float cantidad;
    private String unidad;

    public Ingredientes(String nombre, float cantidad, String unidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidad = unidad;
    }

    public String obtenerDetalle() {
        return String.format("%s %.1f %s", nombre, cantidad, unidad);
    }
}