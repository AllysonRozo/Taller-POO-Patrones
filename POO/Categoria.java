public class Categoria {
    private String nombre;

    public Categoria(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void obtenerRecetasPorCategoria() {
        System.out.println("Buscando recetas en la categoría: " + nombre);
    }
}
