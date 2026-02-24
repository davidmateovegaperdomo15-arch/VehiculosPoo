package concurrencia;

import java.util.concurrent.Callable;

// RUNNABLE: Tarea que no devuelve nada.
class ProcesadorNaves implements Runnable {
    @Override
    public void run() {
        System.out.println("Hilo [" + Thread.currentThread().getName() + "] escaneando alrededores...");
    }
}

// CALLABLE: Tarea que devuelve un valor y puede lanzar excepciones.
class TareaCalculoVuelo implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(2000);
        return "Coordenadas de salto calculadas para el sector Alfa.";
    }
}