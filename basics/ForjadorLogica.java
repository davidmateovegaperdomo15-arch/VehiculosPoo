package basics;

public class ForjadorLogica {

    // 1. OPERADOR TERNARIO Y CONDICIONALES
    public String evaluarResistencia(double pureza, int temperatura) {
        // Uso de condicional anidado y operadores lógicos (&&)
        if (pureza >= 0.9 && temperatura > 1000) {
            return "ALTA";
        } else if (pureza >= 0.5 || temperatura > 500) {
            return "MEDIA";
        } else {
            return "BAJA";
        }
    }

    // 2. SWITCH (Versión moderna de Java)
    public int calcularTiempoEnfriamiento(TipoMaterial material) {
        return switch (material) {
            case HIERRO -> 30;
            case ACERO -> 60;
            case TITANIO -> 120;
            case BESKAR -> 500;
        };
    }

    // 3. BUCLES Y ARRAYS
    public void procesarLote(double[] lote) {
        System.out.print("Procesando lote de materiales: ");
        
        // Bucle For Clásico
        for (int i = 0; i < lote.length; i++) {
            // Operador de asignación compuesta
            lote[i] *= 0.95; // Aplicamos un factor de pérdida por calor
            
            // Control de flujo: continue
            if (lote[i] < 0.1) continue; 
            
            System.out.print("[" + String.format("%.2f", lote[i]) + "] ");
        }
        System.out.println();
    }

    // 4. BUCLE WHILE
    public void estabilizarTemperatura(int actual, int objetivo) {
        System.out.print("Estabilizando: ");
        while (actual > objetivo) {
            actual -= 50; // Decremento
            System.out.print(actual + "°C ");
        }
        System.out.println("-> Estable.");
    }
}