package cl.ucn.disc.pdbp.tdd.util;

import java.util.regex.Pattern;

public class Validator {

  public Validator() {
  }

  /**
   * verifica la validez del rut
   * @param rut rut de persona
   * @return validez s/n
   */
  public static boolean isRut_valid(String rut) {

    // Not null
    if (rut == null) {
      return false;
    }

    // Wrong size
    if (rut.length() < 2) {
      return false;
    }

    // Last char
    char dv = rut.charAt(rut.length() - 1);

    // Only numbers
    String numbers = rut.substring(0, rut.length() - 1);
    if (!Pattern.matches("[0-9]+", numbers)) {
      return false;
    }

    // The validation
    return validarRut(Integer.parseInt(numbers), dv);

  }
  private static boolean validarRut(int rut, char dv) {
    int m = 0, s = 1;
    for (; rut != 0; rut /= 10) {
      s = (s + rut % 10 * (9 - m++ % 6)) % 11;
    }
    return dv == (char) (s != 0 ? s + 47 : 75);
  }
}

