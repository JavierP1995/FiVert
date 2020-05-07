package cl.ucn.disc.pdbp.tdd.util;

public class Validator {

  public Validator() {
  }

  /**
   * verifica la validez del rut
   * @param rut rut de persona
   * @return validez s/n
   */
  public static boolean isRut_valid(String rut) {
    rut = rut.toUpperCase();
    String numero = rut.substring(0, rut.length() - 1);
    char verificador = rut.charAt(rut.length() - 1);
    int contador = numero.length() - 1;
    int multiplicador = 2;
    int suma = 0;
    while (contador > 0) {
      if (multiplicador == 8){
        multiplicador = 2;
      }
      contador =- 1;
      try{
        suma =+ suma + Character.getNumericValue(numero.charAt(contador))*multiplicador;
        multiplicador =+ 1;
      } catch(NumberFormatException ex) {
        throw new RuntimeException("Existen caracteres no numericos en el rut");
      }
    }
    try{
      if (suma % 11 == 10 && verificador == 'K'){
        return true;
      } else return suma % 11 == Character.getNumericValue(verificador);
    } catch(NumberFormatException ex){
      throw new RuntimeException("Existen caracteres no numericos en el rut");
    }
  }
}
