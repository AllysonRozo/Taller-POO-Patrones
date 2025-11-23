import java.util.List;

public class RecetaFactory {

    public static Receta crearReceta(
        String nombre, 
        String descripcion, 
        int tiempoPreparacion, 
        int porciones, 
        Categoria categoria, 
        List<Ingredientes> ingredientes, 
        List<Paso> pasos) {
        
        return new Receta(nombre, descripcion, tiempoPreparacion, porciones, 
                          categoria, ingredientes, pasos);
    }
}