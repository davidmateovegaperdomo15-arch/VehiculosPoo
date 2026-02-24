package javaio;

import java.io.Serializable;

/**
 * SERIALIZACIÓN: Permite convertir un objeto en una secuencia de bytes.
 */
public class ReporteMision implements Serializable {
    // serialVersionUID: El "DNI" de la clase para evitar errores al leer el archivo.
    private static final long serialVersionUID = 1L;
    
    private String destino;
    private int tripulantes;
    // transient: Este campo NO se guardará en el disco (seguridad/espacio).
    private transient String codigoSecreto; 

    public ReporteMision(String destino, int tripulantes, String codigoSecreto) {
        this.destino = destino;
        this.tripulantes = tripulantes;
        this.codigoSecreto = codigoSecreto;
    }

    @Override
    public String toString() {
        return "Reporte [Destino=" + destino + ", Tripulantes=" + tripulantes + "]";
    }
}