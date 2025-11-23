import java.util.Arrays;
import java.util.List;

public class CookMasterApp {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA DE SINGLETON ---");
        GestorCategorias gestor1 = GestorCategorias.obtenerInstancia();
        GestorCategorias gestor2 = GestorCategorias.obtenerInstancia();

        System.out.println("¿Ambos gestores son la misma instancia? " + (gestor1 == gestor2)); 

        Categoria postres = gestor1.obtenerCategoria("Postres");
        
        System.out.println("\n--- PRUEBA DE FACTORY ---");
        
        List<Ingredientes> ingredientesTorta = Arrays.asList(
            new Ingredientes("Harina", 250, "gramos"),
            new Ingredientes("Azúcar", 200, "gramos"),
            new Ingredientes("Huevo", 3, "unidades"),
            new Ingredientes("Leche", 120, "ml")
        );

        List<Paso> pasosTorta = Arrays.asList(
            new Paso(1, "Precalentar el horno a 180°C."),
            new Paso(2, "Mezclar ingredientes secos."),
            new Paso(3, "Agregar líquidos y batir hasta obtener una mezcla homogénea."),
            new Paso(4, "Hornear por 30 minutos.")
        );

        Receta tortaVainilla = RecetaFactory.crearReceta(
            "Torta de Vainilla Clásica",
            "Un postre suave y esponjoso, ideal para cualquier ocasión.",
            45, 
            8,
            postres,
            ingredientesTorta,
            pasosTorta
        );

        tortaVainilla.mostrarDetalles();
    }
}
