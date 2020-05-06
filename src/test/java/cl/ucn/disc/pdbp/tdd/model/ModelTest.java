package cl.ucn.disc.pdbp.tdd.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.InvalidKeyException;

/**
 * Model test.
 */
public final class ModelTest {

    /**
     * The Logger (console)
     */
    private static final Logger log = LoggerFactory.getLogger(ModelTest.class);

    /**
     * Test the Persona.
     * - El nombre no puede ser null.
     * - El nombre debe tener al menos 2 letras.
     * - El apellido no puede ser null.
     * - El apellido debe tener al menos 3 letras.
     * - El rut debe ser valido.
     */
    @Test
    public void testPersona() throws InvalidKeyException {

        log.debug("Testing Persona ..");

        // The data!
        log.debug(".. valid ..");
        String nombre = "Andrea";
        String apellido = "Contreras";
        String nombreApellido = nombre + " " + apellido;
        String rutOk = "152532873";
        String rutError = "15253287K";
        String nombreError = "a";
        String apellidoError = "ko";

        // Test constructor and getters
        Persona persona = new Persona(nombre, apellido, rutOk);
        Assertions.assertEquals(persona.getNombre(), nombre);
        Assertions.assertEquals(persona.getApellido(), apellido);
        Assertions.assertEquals(persona.getNombreApellido(), nombreApellido);

        // Testing nullity
        log.debug(".. nullity ..");
        Assertions.assertThrows(NullPointerException.class, () -> new Persona(null, null, null));
        Assertions.assertThrows(NullPointerException.class, () -> new Persona(null, null, rutOk));
        Assertions.assertThrows(NullPointerException.class, () -> new Persona(null, apellido, null));
        Assertions.assertThrows(NullPointerException.class, () -> new Persona(null, apellido, rutOk));
        Assertions.assertThrows(NullPointerException.class, () -> new Persona(nombre, null, null));
        Assertions.assertThrows(NullPointerException.class, () -> new Persona(nombre, null, rutOk));
        Assertions.assertThrows(NullPointerException.class, () -> new Persona(nombre, apellido, null));

        // Testing invalid rut, nombre and apellido
        log.debug(".. rut ..");
        Assertions.assertThrows(RuntimeException.class, () -> new Persona(nombre, apellido, rutError));
        Assertions.assertThrows(RuntimeException.class, () -> new Persona(nombreError, apellido, rutError));
        Assertions.assertThrows(RuntimeException.class, () -> new Persona(nombre, apellidoError, rutError));

        // TODO: Add the size of nombre y apellido.

        log.debug("Done.");

    }

    /**
     * Test the digito verificador.
     */
    @Test

    public void testDigitoVerificador() throws InvalidKeyException {

        Assertions.assertFalse(Validator.isRut_valid(null));

        Assertions.assertTrue(Validator.isRut_valid("152532873"));
        Assertions.assertTrue(Validator.isRut_valid("21195194K"));
        Assertions.assertTrue(Validator.isRut_valid("121244071"));
        Assertions.assertTrue(Validator.isRut_valid("198127949"));
        Assertions.assertTrue(Validator.isRut_valid("202294316"));

        Assertions.assertFalse(Validator.isRut_valid("1525A2873"));
        Assertions.assertFalse(Validator.isRut_valid("15253287K"));
        Assertions.assertFalse(Validator.isRut_valid("15253287-"));

    }

}
