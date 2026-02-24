package colecciones;

import java.util.*;

public class AlmacenLogistico {
    // 1. LIST: Orden de inserción y acceso por índice.
    private List<Suministro> inventarioGeneral = new ArrayList<>();

    // 2. SET: Elementos únicos (No permite duplicados).
    private Set<String> zonasDeEntrega = new HashSet<>();

    // 3. MAP: Parejas Clave-Valor (Acceso ultra rápido por ID).
    private Map<String, Suministro> registroCritico = new HashMap<>();

    // 4. QUEUE: Procesamiento por prioridad (PriorityQueue).
    private Queue<Suministro> colaDeCarga = new PriorityQueue<>(new ComparadorPrecio().reversed());

    public void agregarSuministro(Suministro s) {
        inventarioGeneral.add(s);
        zonasDeEntrega.add("Sector Delta"); // HashSet ignora si ya existe.
        registroCritico.put(s.toString(), s);
        colaDeCarga.add(s); // Se ordena internamente por el Comparator de precio.
    }

    public void mostrarEstado() {
        System.out.println("--- LISTA (Orden de llegada) ---");
        inventarioGeneral.forEach(System.out::println);

        System.out.println("\n--- MAPA (Búsqueda por Clave) ---");
        System.out.println("ID específico: " + registroCritico.keySet().iterator().next());

        System.out.println("\n--- PRIORITY QUEUE (Más caros primero) ---");
        while (!colaDeCarga.isEmpty()) {
            System.out.println("Despachando: " + colaDeCarga.poll());
        }
    }
}
