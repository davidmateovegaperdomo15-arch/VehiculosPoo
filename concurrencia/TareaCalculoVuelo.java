package concurrencia;
import java.util.concurrent.Callable;

// CALLABLE: Tarea que devuelve un valor y puede lanzar excepciones.
class TareaCalculoVuelo implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(2000);
        return "Coordenadas de salto calculadas para el sector Alfa.";
    }
}