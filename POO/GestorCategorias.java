import java.util.ArrayList;
import java.util.List;

public class GestorCategorias {

    private static GestorCategorias instancia;
    
    private List<Categoria> listaCategorias;

    private GestorCategorias() {
        listaCategorias = new ArrayList<>();
        listaCategorias.add(new Categoria("Platos Principales"));
        listaCategorias.add(new Categoria("Postres"));
        listaCategorias.add(new Categoria("Vegano"));
        System.out.println("[INFO] GestorCategorias inicializado con 3 categorías.");
    }

    public static GestorCategorias obtenerInstancia() {
        if (instancia == null) {
            instancia = new GestorCategorias();
        }
        return instancia;
    }

    public void agregarCategoria(String nombre) {
        listaCategorias.add(new Categoria(nombre));
        System.out.println("[INFO] Categoría '" + nombre + "' agregada.");
    }

    public Categoria obtenerCategoria(String nombre) {
        for (Categoria c : listaCategorias) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        System.err.println("[ERROR] Categoría '" + nombre + "' no encontrada.");
        return null;
    }
}