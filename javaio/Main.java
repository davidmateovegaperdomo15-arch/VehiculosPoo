package javaio;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String archivoObjeto = "mision.dat";
        GestorIOTradicional ioClasico = new GestorIOTradicional();
        MotorNio nio = new MotorNio();

        try {
            // 1. Demostración de Serialización
            ReporteMision reporte = new ReporteMision("Marte", 5, "DELTA-99");
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivoObjeto))) {
                oos.writeObject(reporte);
                System.out.println("Objeto serializado con éxito.");
            }

            // 2. Demostración de Deserialización
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivoObjeto))) {
                ReporteMision recuperado = (ReporteMision) ois.readObject();
                System.out.println("Objeto recuperado: " + recuperado);
            }

            // 3. Demostración de NIO.2
            nio.gestionarArchivosNio("LogsEstelares");
            
            // 4. Escritura de Texto clásica
            ioClasico.escribirBitacora("Entrada de bitacora: Todo en calma.", "LogsEstelares/bitacora.txt");

        } catch (Exception e) {
            System.err.println("Fallo en la comunicación con el disco: " + e.getMessage());
        }
    }
}
