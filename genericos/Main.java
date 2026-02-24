package genericos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Instanciación con Diamond Operator (<>)
        ContenedorUniversal<Robot, Integer> hangar = new ContenedorUniversal<>(101);
        hangar.cargar(new Robot());

        // 2. Uso de Métodos Genéricos
        OperadorLogistico.imprimirInfoTecnica("Frecuencia de radio: 440Hz");
        OperadorLogistico.imprimirInfoTecnica(2026); // Autoboxing a Integer

        // 3. Demostración de PECS (Producer Extends, Consumer Super)
        List<RobotExplorador> exploradores = List.of(new RobotExplorador());
        
        // Funciona porque RobotExplorador extends EquipoEspacial (Upper Bound)
        OperadorLogistico.inspeccionarEquipos(exploradores);

        List<EquipoEspacial> almacenCentral = new ArrayList<>();
        // Funciona porque EquipoEspacial es padre de Robot (Lower Bound)
        OperadorLogistico.registrarRobots(almacenCentral);

        System.out.println("Items en almacén: " + almacenCentral.size());
    }
}
