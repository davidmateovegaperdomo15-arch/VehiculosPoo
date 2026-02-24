package functional;

import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        List<Transaccion> mercado = List.of(
            new Transaccion("T1", "Tatooine", 1200, "Repuestos", false),
            new Transaccion("T2", "Coruscant", 15000, "Lujo", true),
            new Transaccion("T3", "Hoth", 450, "Combustible", false),
            new Transaccion("T4", "Coruscant", 8000, "Lujo", true)
        );

        // 1. PREDICATE & CONSUMER
        System.out.println("--- Notificando Transacciones Prioritarias ---");
        Consumer<Transaccion> notificador = t -> System.out.println("ALERT: " + t.id());
        mercado.stream()
               .filter(Transaccion::esPrioritaria) // Predicate
               .forEach(notificador);             // Consumer

        // 2. USO DE INTERFAZ PERSONALIZADA (Lambda)
        CalculadoraImpuestos tasaImperial = monto -> monto * 0.15;
        double totalImpuestos = mercado.stream()
               .mapToDouble(t -> tasaImperial.calcular(t.monto()))
               .sum();
        System.out.println("\nImpuestos Totales: " + totalImpuestos);

        // 3. OPTIONAL EN ACCIÓN
        AnalizadorMercado.encontrarTransaccionMasCara(mercado)
            .ifPresentOrElse(
                t -> System.out.println("Más cara: " + t.monto()),
                () -> System.out.println("No hay transacciones")
            );

        // 4. METHOD REFERENCE & COMPOSICIÓN
        System.out.println("\n--- Log de Auditoría ---");
        mercado.forEach(Procesadores::imprimirLog);
    }
}