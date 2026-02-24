package functional;

import java.util.*;
import java.util.stream.Collectors;

public class AnalizadorMercado {

    public static List<String> obtenerPlanetasVIP(List<Transaccion> transacciones) {
        return transacciones.stream()
            // PREDICATE: Filtramos (Lambda)
            .filter(t -> t.monto() > 5000)
            // FUNCTION: Transformamos el objeto a String (Method Reference)
            .map(Transaccion::planeta)
            // Agrupamos y eliminamos duplicados
            .distinct()
            .sorted()
            // TERMINAL OPERATION: Recolectamos el resultado
            .collect(Collectors.toList());
    }

    public static Optional<Transaccion> encontrarTransaccionMasCara(List<Transaccion> transacciones) {
        // OPTIONAL: Evitamos el NullPointerException de forma funcional.
        return transacciones.stream()
            .max(Comparator.comparingDouble(Transaccion::monto));
    }
}