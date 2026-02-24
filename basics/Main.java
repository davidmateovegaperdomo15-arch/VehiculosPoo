package basics;

public class Main {
    public static void main(String[] args) {
        // 1. TIPOS PRIMITIVOS VS WRAPPERS
        int temperaturaBase = 1500; // Primitivo (Memoria Stack)
        Integer temperaturaObjeto = Integer.valueOf(temperaturaBase); // Wrapper (Memoria Heap)

        // 2. CASTING (Conversión de tipos)
        double precision = 9.99;
        int precisionReducida = (int) precision; // Casting explícito (Pérdida de datos)
        double expansion = temperaturaBase;      // Casting implícito (Seguro)

        // 3. MANIPULACIÓN DE STRINGS (Inmutabilidad)
        String prefijo = "FORJA";
        String id = prefijo + "-" + 101; // Concatenación

        System.out.println("ID de Forja: " + id);
        System.out.println("Casting de precisión: " + precisionReducida);

        // 4. PRUEBA DE LÓGICA
        ForjadorLogica forja = new ForjadorLogica();
        
        // Arrays de tamaño fijo
        double[] materiales = {0.99, 0.85, 0.40, 0.15};
        forja.procesarLote(materiales);

        String calidad = forja.evaluarResistencia(0.95, 1200);
        System.out.println("Calidad resultante: " + calidad);

        forja.estabilizarTemperatura(1500, 1200);

        // 5. COMPARACIÓN DE STRINGS (Punto crítico de básicos)
        String s1 = new String("ALPHA");
        String s2 = "ALPHA";
        // Jamás usar == para contenido de Strings, usar .equals()
        System.out.println("¿Mismo contenido? " + s1.equals(s2));
    }
}