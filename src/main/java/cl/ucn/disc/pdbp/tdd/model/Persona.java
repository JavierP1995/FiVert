package cl.ucn.disc.pdbp.tdd.model;

import java.security.InvalidKeyException;

public class Persona {
  private String nombre;
  private String apellido;
  private String nombreApellido;
  private String rut;
  private Validator check;

  public Persona(String nombre, String apellido, String rut) {
    this.check = new Validator();
    this.check.nonEmpty_values(nombre, apellido, rut);
    if (this.check.isRut_valid(rut) && this.check.isNombre_valid(nombre) && this.check.isApellido_valid(apellido)) {
      this.nombre = nombre;
      this.apellido = apellido;
      this.nombreApellido = nombre + " " + apellido;
      this.rut = rut;
    }
  }

  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public String getNombreApellido() {
    return nombreApellido;
  }

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
