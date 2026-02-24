package OOPbasics;

import java.util.ArrayList;
import java.util.List;

public class Ejecucion {
    public static void excecution(String[] args) throws Exception {
        System.out.println("Hello, World!");
                    List<Vehiculo> flota = new ArrayList<>();
            flota.add(new CazaEstelar("X-Wing"));
            flota.add(new CargueroPesado("Millennium Falcon"));

            for (Vehiculo v : flota) {
                v.iniciarMotor(); // Aquí se ve el Polimorfismo: cada uno arranca distinto.
            }
        }
}
