package javaio;

import java.io.*;

public class GestorIOTradicional {

    // BYTE STREAMS: FileInputStream / FileOutputStream (Para cualquier tipo de archivo)
    public void copiarImagenBinaria(File origen, File destino) throws IOException {
        try (InputStream in = new FileInputStream(origen);
            OutputStream out = new FileOutputStream(destino)) {
            byte[] buffer = new byte[1024];
            int longitud;
            while ((longitud = in.read(buffer)) > 0) {
                out.write(buffer, 0, longitud);
            }
        }
    }

    // CHARACTER STREAMS: BufferedReader / BufferedWriter (Para texto)
    public void escribirBitacora(String mensaje, String ruta) throws IOException {
        // Uso de decoradores: BufferedWriter mejora el rendimiento.
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ruta, true))) {
            writer.write(mensaje);
            writer.newLine();
        }
    }
}