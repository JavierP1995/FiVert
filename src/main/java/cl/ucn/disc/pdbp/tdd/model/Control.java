package cl.ucn.disc.pdbp.tdd.model;

import java.time.ZonedDateTime;

public class Control {

  private final ZonedDateTime fechaControl;

  private final ZonedDateTime fechaSiguiente;

  private final float temperatura;

  private final float peso;

  private final float altura;

  private String diagnostico;

  private String veterinario;

  public Control(ZonedDateTime fechaControl, ZonedDateTime fechaSiguiente, float temperatura, float peso, float altura, String diagnostico, String veterinario) {
    this.fechaControl = fechaControl;
    this.fechaSiguiente = fechaSiguiente;
    this.temperatura = temperatura;
    this.peso = peso;
    this.altura = altura;
    this.diagnostico = diagnostico;
    this.veterinario = veterinario;
  }

  public ZonedDateTime getFechaControl() {
    return fechaControl;
  }

  public ZonedDateTime getFechaSiguiente() {
    return fechaSiguiente;
  }

  public float getTemperatura() {
    return temperatura;
  }

  public float getPeso() {
    return peso;
  }

  public float getAltura() {
    return altura;
  }

  public String getDiagnostico() {
    return diagnostico;
  }

  public String getVeterinario() {
    return veterinario;
  }
}
