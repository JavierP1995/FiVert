package cl.ucn.disc.pdbp.tdd.model;

import java.security.InvalidKeyException;

public class Validator {

  public Validator() {
  }

  public void nonEmpty_values(String nombre, String apellido, String rut) {
    if (nombre == null || apellido == null || rut == null) {
      throw new NullPointerException("Parámetros nulos");
    }
  }

  public static boolean isRut_valid(String rut) {
    if (rut == null) {
      return false;
    }
    boolean valid = false;
    try {
      rut = rut.toUpperCase();
      rut = rut.replace(".", "");
      rut = rut.replace("-", "");
      int aux = Integer.parseInt(rut.substring(0, rut.length() - 1));
      char dv = rut.charAt(rut.length() - 1);
      int m = 0;
      int s = 1;
      for (; aux != 0; aux /= 10) {
        s = (s + aux % 10 * (9 - m++ % 6)) % 11;
      }
      if (dv == (char) (s != 0 ? s + 47 : 75)) {
        valid = true;
      }
    } catch (java.lang.NumberFormatException e) {
    }
    return valid;
  }

  public boolean isNombre_valid(String nombre) {
    if (nombre.length() > 1 ){
      return true;
    }
    return false;
  }

  public boolean isApellido_valid(String apellido) {
    if (apellido.length() > 2 ){
      return true;
    }
    return false;
  }
}
