package anotaciones;

import java.lang.annotation.*;

/**
 * SEGURIDAD NAVE: Anotación para clases.
 * @Retention(RUNTIME): Es vital para poder leerla con Reflection mientras el programa corre.
 * @Target(TYPE): Indica que solo se puede usar en Clases, Interfaces o Enums.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Inherited // Si una nave hereda de otra, también hereda este nivel de seguridad.
public @interface SeguridadNave {
    NivelAcceso nivel() default NivelAcceso.BAJO;
    String codigoEncriptacion() default "0000";
}
