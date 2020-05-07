package cl.ucn.disc.pdbp.tdd.model;

import cl.ucn.disc.pdbp.tdd.util.Validator;

/**
 * Cuidador de una mascota
 *
 * @author Javier Palacios Arce.
 */
public final class Persona {

  /**
   * nombre de cuidador
   */
  private String nombre;

  /**
   * apellido de cuidador
   */
  private String apellido;

  /**
   * rut de cuidador
   */
  private String rut;

  /**
   * numero fijo de cuidador
   */
  private int numeroFijo;

  /**
   * numero movil de cuidador
   */
  private int numeroMovil;

  /**
   * correo de cuidador
   */
  private String correo;

  /**
   * constructor
   * @param nombre    cuidador
   * @param apellido  cuidador
   * @param rut       cuidador
   */
  public Persona(String nombre, String apellido, String rut) {
    if (nombre == null || apellido == null || rut == null) {
      throw new NullPointerException("Parámetros nulos");
    }
    if (nombre.length() < 2) {
      throw new RuntimeException("El nombre debe tener al menos 2 letras");
    }
    if (apellido.length() < 3) {
      throw new RuntimeException("El apellido debe tener al menos 3 letras");
    }
    if (Validator.isRut_valid(rut)) {
      this.nombre = nombre;
      this.apellido = apellido;
      this.rut = rut;
    } else{
      throw new RuntimeException("El rut no es válido");
    }
  }

  /**
   * @return nombre
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * @return apellido
   */
  public String getApellido() {
    return apellido;
  }

  /**
   * @return rut
   */
  public String getRut() {
    return rut;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public void setRut(String rut) {
    this.rut = rut;
  }
}
