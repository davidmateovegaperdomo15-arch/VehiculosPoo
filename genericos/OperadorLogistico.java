package genericos;

import java.util.List;

public class OperadorLogistico {

    /**
     * UPPER BOUNDED WILDCARD (? extends T): Covarianza.
     * Útil para LECTURA. Acepta T o cualquier hijo de T.
     */
    public static void inspeccionarEquipos(List<? extends EquipoEspacial> equipos) {
        System.out.println("--- Inspeccionando flota ---");
        for (EquipoEspacial e : equipos) {
            // Sabemos que es al menos un EquipoEspacial
            System.out.println("Revisando: " + e.getNombre());
        }
    }

    /**
     * LOWER BOUNDED WILDCARD (? super T): Contravarianza.
     * Útil para ESCRITURA. Acepta T o cualquier padre de T.
     */
    public static void registrarRobots(List<? super Robot> listaDestino) {
        // Podemos añadir un Robot o un RobotExplorador de forma segura
        listaDestino.add(new RobotExplorador());
        System.out.println("Robot registrado en el historial.");
    }

    /**
     * MÉTODO GENÉRICO: El tipo <G> se define solo para este método.
     */
    public static <G> void imprimirInfoTecnica(G info) {
        System.out.println("INFO TÉCNICA: " + info.toString());
    }
}
