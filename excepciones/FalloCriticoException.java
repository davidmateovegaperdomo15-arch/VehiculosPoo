package excepciones;

/**
 * CHECKED EXCEPTION: Obliga al programador a usar try-catch o throws.
 * Se usa para fallos externos recuperables (ej: fallo de hardware).
 */
public class FalloCriticoException extends Exception {
    public FalloCriticoException(String mensaje) {
        super(mensaje);
    }
}

/**
 * UNCHECKED EXCEPTION (RuntimeException): No obliga a captura explícita.
 * Se usa para errores que no deberían ocurrir si la lógica es correcta.
 */
class CombustibleAgotadoException extends RuntimeException {
    public CombustibleAgotadoException(String mensaje) {
        super(mensaje);
    }
}