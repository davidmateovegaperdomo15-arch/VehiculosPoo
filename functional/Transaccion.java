package functional;

/**
 * INMUTABILIDAD: Un Record es final y sus campos también. 
 * Reemplaza a las clases POJO pesadas.
 */
public record Transaccion(
    String id, 
    String planeta, 
    double monto, 
    String categoria,
    boolean esPrioritaria
) {}