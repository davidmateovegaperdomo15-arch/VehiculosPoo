package excepciones;
/**
 * Implementar AutoCloseable permite usar esta clase en un bloque try-with-resources.
 */
public class SoporteVital implements AutoCloseable {
    
    public void monitorear() {
        System.out.println("Soporte Vital: Operando niveles de oxígeno.");
    }

    @Override
    public void close() {
        System.out.println("Soporte Vital: Cerrando escotillas y liberando presión de forma segura.");
    }
}