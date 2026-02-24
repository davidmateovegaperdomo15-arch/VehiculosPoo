package concurrencia;

import java.util.concurrent.*;

public class GestorFlotaAsincrono {
    // ExecutorService: Maneja un grupo de hilos reutilizables (Thread Pool).
    private final ExecutorService pool = Executors.newFixedThreadPool(3);

    public void ejecutarFlujoAsincrono() {
        // CompletableFuture: Permite encadenar tareas de forma no bloqueante.
        CompletableFuture.supplyAsync(() -> {
            return "Datos de radar recibidos";
        }).thenApply(datos -> {
            return datos + " -> Procesados por IA";
        }).thenAccept(resultado -> {
            System.out.println("FLUJO ASÍNCRONO: " + resultado);
        });
    }

    public void apagar() {
        pool.shutdown();
    }
}