package functional;

public class Procesadores {
    // METHOD REFERENCE: Este método estático se usará como referencia más tarde.
    public static void imprimirLog(Transaccion t) {
        System.out.println("[LOG]: Procesando transacción de " + t.planeta());
    }
}