package javaio;

import java.nio.file.*;
import java.util.List;

public class MotorNio {

    public void gestionarArchivosNio(String nombreCarpeta) throws Exception {
        // Path es la evolución de la clase File
        Path ruta = Paths.get(nombreCarpeta);

        // Crear directorios de forma segura
        if (Files.notExists(ruta)) {
            Files.createDirectory(ruta);
            System.out.println("Sector creado: " + ruta.toAbsolutePath());
        }

        // Escritura rápida y moderna
        Path archivoLog = ruta.resolve("sistema.log");
        Files.write(archivoLog, List.of("Sistema Operativo Galáctico v1.0", "Estado: Online"), 
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }
}
