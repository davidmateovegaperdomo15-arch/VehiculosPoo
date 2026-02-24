package anotaciones;

import java.lang.reflect.Method;

public class ProcesadorSeguridad {

    public static void procesar(Object objeto) throws Exception {
        Class<?> clazz = objeto.getClass();

        // 1. Leer anotación de Clase
        if (clazz.isAnnotationPresent(SeguridadNave.class)) {
            SeguridadNave sn = clazz.getAnnotation(SeguridadNave.class);
            System.out.println("🔒 Analizando Clase: " + clazz.getSimpleName());
            System.out.println("Nivel de Seguridad: " + sn.nivel());
            System.out.println("Cifrado: " + sn.codigoEncriptacion());
        }

        // 2. Leer anotaciones de Métodos
        for (Method metodo : clazz.getDeclaredMethods()) {
            if (metodo.isAnnotationPresent(PermisoRequerido.class)) {
                PermisoRequerido pr = metodo.getAnnotation(PermisoRequerido.class);
                System.out.print("🔑 El método [" + metodo.getName() + "] requiere roles: ");
                for (String role : pr.roles()) {
                    System.out.print(role + " ");
                }
                System.out.println();
            }
        }
    }
}