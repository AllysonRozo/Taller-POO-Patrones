import java.util.List;

public class Receta {
    private String nombre;
    private String descripcion;
    private int tiempoPreparacion;
    private int porciones;
    private Categoria categoria;
    private List<Ingredientes> ingredientes;
    private List<Paso> pasos;

    protected Receta(String nombre, String descripcion, int tiempoPreparacion, int porciones,
                   Categoria categoria, List<Ingredientes> ingredientes, List<Paso> pasos) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tiempoPreparacion = tiempoPreparacion;
        this.porciones = porciones;
        this.categoria = categoria;
        this.ingredientes = ingredientes;
        this.pasos = pasos;
        System.out.println("\n[INFO] Receta '" + nombre + "' creada exitosamente.");
    }

    public void mostrarDetalles() {
        System.out.println("\n--- Receta: " + nombre + " ---");
        System.out.println("Descripción: " + descripcion);
        System.out.println("Categoría: " + categoria.getNombre());
        System.out.println("Tiempo Prep.: " + tiempoPreparacion + " min | Porciones: " + porciones);
        
        System.out.println("\nIngredientes:");
        for (Ingredientes i : ingredientes) {
            System.out.println("  - " + i.obtenerDetalle());
        }

        System.out.println("\nInstrucciones:");
        for (Paso p : pasos) {
            System.out.println("  - " + p);
        }
        System.out.println("---------------------------------");
    }
}