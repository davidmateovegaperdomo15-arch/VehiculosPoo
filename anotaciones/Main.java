package anotaciones;

public class Main {
    public static void main(String[] args) {
        TerminalMando terminal = new TerminalMando();

        try {
            System.out.println("--- INICIANDO ESCANEO DE METADATOS ---");
            // El procesador usa Reflection para leer las etiquetas que pusimos.
            ProcesadorSeguridad.procesar(terminal);

            System.out.println("\n--- EJECUCIÓN NORMAL ---");
            terminal.lanzarMisiles();

        } catch (Exception e) {
            System.err.println("Error al procesar anotaciones: " + e.getMessage());
        }
    }
}
