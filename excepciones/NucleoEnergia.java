package excepciones;

public class NucleoEnergia {
    private int nivelCombustible = 10;

    /**
     * El uso de 'throws' advierte que este método es peligroso.
     */
    public void activarSaltoCurvatura(boolean sistemaEstable) throws FalloCriticoException {
        if (!sistemaEstable) {
            // Lanzamos una excepción verificada
            throw new FalloCriticoException("El núcleo de energía está inestable para el salto.");
        }
        
        if (nivelCombustible < 50) {
            // Lanzamos una excepción no verificada
            throw new CombustibleAgotadoException("Nivel de combustible crítico para esta maniobra.");
        }
        
        System.out.println("Salto con éxito.");
    }
}
