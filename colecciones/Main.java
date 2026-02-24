package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AlmacenLogistico almacen = new AlmacenLogistico();

        // 1. CREACIÓN DE DATOS
        Suministro s1 = new Suministro("Células de Energía", 50, 150.0);
        Suministro s2 = new Suministro("Placas de Titanio", 20, 500.0);
        Suministro s3 = new Suministro("Células de Energía", 10, 150.0); // Duplicado lógico (mismo nombre)
        Suministro s4 = new Suministro("Cristal Kyber", 1, 10000.0);

        System.out.println("--- REGISTRANDO SUMINISTROS ---");
        almacen.agregarSuministro(s1);
        almacen.agregarSuministro(s2);
        almacen.agregarSuministro(s3);
        almacen.agregarSuministro(s4);

        // 2. DEMOSTRACIÓN DE SET (DUPLICADOS)
        // Gracias a equals() y hashCode(), el set en AlmacenLogistico 
        // debería haber ignorado la entrada duplicada de "Células de Energía".
        
        // 3. DEMOSTRACIÓN DE ORDENACIÓN (COMPARABLE)
        List<Suministro> listaParaOrdenar = new ArrayList<>();
        listaParaOrdenar.add(s1);
        listaParaOrdenar.add(s2);
        listaParaOrdenar.add(s4);

        System.out.println("\n--- ORDEN NATURAL (Comparable: Nombre) ---");
        Collections.sort(listaParaOrdenar);
        listaParaOrdenar.forEach(System.out::println);

        // 4. DEMOSTRACIÓN DE ORDENACIÓN (COMPARATOR)
        System.out.println("\n--- ORDEN PERSONALIZADO (Comparator: Precio) ---");
        listaParaOrdenar.sort(new ComparadorPrecio());
        listaParaOrdenar.forEach(System.out::println);

        // 5. DEMOSTRACIÓN DE ESTRUCTURAS COMPLEJAS
        // Aquí mostramos el estado del Almacén, que internamente usa 
        // Mapas para acceso rápido y PriorityQueues para despacho.
        System.out.println("\n--- ESTADO FINAL DEL ALMACÉN ---");
        almacen.mostrarEstado();
    }
}
