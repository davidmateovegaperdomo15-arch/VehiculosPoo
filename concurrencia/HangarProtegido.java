package concurrencia;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class HangarProtegido {
    // ATOMIC: Hilo seguro sin necesidad de sincronización explícita.
    private final AtomicInteger navesEnHangar = new AtomicInteger(0);
    
    // LOCK: Alternativa más flexible al bloque synchronized.
    private final Lock cerrojoFisico = new ReentrantLock();

    // synchronized: Solo un hilo puede ejecutar este método a la vez.
    public synchronized void registrarEntrada() {
        navesEnHangar.incrementAndGet();
        System.out.println("Nave detectada. Total en hangar: " + navesEnHangar.get());
    }

    public void realizarMantenimientoCritico() {
        cerrojoFisico.lock(); // Bloqueamos manualmente
        try {
            System.out.println(Thread.currentThread().getName() + " ejecutando mantenimiento...");
            Thread.sleep(1000); // Simulando trabajo pesado
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            cerrojoFisico.unlock(); // SIEMPRE liberar en el finally
        }
    }
}