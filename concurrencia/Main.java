package concurrencia;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws Exception {
        HangarProtegido hangar = new HangarProtegido();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        System.out.println("--- INICIANDO CONCURRENCIA ---");

        // 1. Ejecutar Runnable clásico
        Thread thread1 = new Thread(new ProcesadorNaves(), "Escaner-1");
        thread1.start();

        // 2. Uso de Future con Callable
        Future<String> futuroCalculo = executor.submit(new TareaCalculoVuelo());
        System.out.println("Esperando cálculo de vuelo (esto no bloquea el resto del código)...");

        // 3. Sincronización y Locks
        executor.execute(hangar::realizarMantenimientoCritico);
        executor.execute(hangar::realizarMantenimientoCritico);

        // 4. Obtener resultado del Future (Esto sí es bloqueante hasta que termine)
        String resultado = futuroCalculo.get();
        System.out.println("Resultado recibido: " + resultado);

        // 5. Demostración CompletableFuture (No bloqueante)
        GestorFlotaAsincrono gestorAsinc = new GestorFlotaAsincrono();
        gestorAsinc.ejecutarFlujoAsincrono();

        // Limpieza final
        executor.shutdown();
        if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
            executor.shutdownNow();
        }
        System.out.println("\n--- SISTEMA DE CONTROL FINALIZADO ---");
    }
}