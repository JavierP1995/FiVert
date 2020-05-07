package cl.ucn.disc.pdbp.tdd.model;

import java.time.ZonedDateTime;

/**
 * Ficha veterinaria de una mascota
 *
 * @author Javier Palacios Arce.
 */
public final class Ficha {

  /**
   * numero de ficha
   */
  private final Integer numero;

  /**
   * nombre de mascota paciente
   */
  private final String nombre;

  /**
   * especie animal: felina, canina, etc.
   */
  private final String especie;

  /**
   * fecha de nacimiento
   */
  private final ZonedDateTime fechaNacimiento;

  /**
   * raza
   */
  private final String raza;

  /**
   * Sexo f/m (femenino/masculino)
   */
  private final char sexo;

  /**
   * Color
   */
  private final String color;

  /**
   * Tipo: i/n (interno/externo)
   */
  private final char tipo;

  /**
   * constructor
   * @param numero          identificador mascota.
   * @param nombre          nombre mascota.
   * @param especie         taxonomía mascota.
   * @param fechaNacimiento fecha de nacimiento mascota.
   * @param raza            raza mascota.
   * @param sexo            sexo mascota.
   * @param color           color mascota.
   * @param tipo            tipo mascota.
   */
  public Ficha(Integer numero, String nombre, String especie, ZonedDateTime fechaNacimiento, String raza, char sexo, String color, char tipo) {
    this.numero = numero;
    this.nombre = nombre;
    this.especie = especie;
    this.fechaNacimiento = fechaNacimiento;
    this.raza = raza;
    this.sexo = sexo;
    this.color = color;
    this.tipo = tipo;
  }

  /**
   * @return numero
   */
  public Integer getNumero() {
    return numero;
  }

  /**
   * @return nombre
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * @return especie
   */
  public String getEspecie() {
    return especie;
  }

  /**
   * @return fechaNacimiento
   */
  public ZonedDateTime getFechaNacimiento() {
    return fechaNacimiento;
  }

  /**
   * @return raza
   */
  public String getRaza() {
    return raza;
  }

  /**
   * @return sexo
   */
  public char getSexo() {
    return sexo;
  }

  /**
   * @return color
   */
  public String getColor() {
    return color;
  }

  /**
   * @return tipo
   */
  public char getTipo() {
    return tipo;
  }
}
