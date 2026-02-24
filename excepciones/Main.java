package excepciones;

public class Main {
    public static void main(String[] args) {
        NucleoEnergia nucleo = new NucleoEnergia();

        // 1. TRY-WITH-RESOURCES: Garantiza que el SoporteVital se cierre solo.
        try (SoporteVital oxigeno = new SoporteVital()) {
            oxigeno.monitorear();

            // 2. BLOQUE TRY-CATCH MÚLTIPLE
            System.out.println("Intentando activar propulsores...");
            nucleo.activarSaltoCurvatura(false); 

        } catch (FalloCriticoException | CombustibleAgotadoException e) {
            // Multi-catch: Manejamos varios tipos de error de forma similar (Java 7+)
            System.err.println("[ALERTA ROJA]: " + e.getMessage());
            
        } catch (Exception e) {
            // Catch genérico: Para cualquier otro error no previsto.
            System.err.println("Error desconocido: " + e.getMessage());
            
        } finally {
            // 3. BLOQUE FINALLY: Se ejecuta SIEMPRE (haya error o no).
            // Ideal para limpieza final que no sea AutoCloseable.
            System.out.println("Protocolo de emergencia finalizado. Estado: Stand-by.");
        }
    }
}