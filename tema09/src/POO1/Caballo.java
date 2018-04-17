package POO1;
public class Caballo {

  String nombre;
  double peso;
  String sexo;
  double velocidad;

  public Caballo(String nombre) {
    this.nombre = nombre;
  }

  public Caballo(String nombre, double peso) {
    this.nombre = nombre;
    this.peso = peso;
  }

  public Caballo(String nombre, double peso, String sexo) {
    this.nombre = nombre;
    this.peso = peso;
    this.sexo = sexo;
  }

  String getNombre() {
    return nombre;
  }

  double getPeso() {
    return peso;
  }

  String getSexo() {
    return sexo;
  }

  void setNombre(String nombre) {
    this.nombre = nombre;
  }

  void setPeso(double peso) {
    this.peso = peso;
  }

  void setSexo(String sexo) {
    this.sexo = sexo;
  }

  void relincha() {
    System.out.println("HIN HIN HIN HIN");
  }

  void acelera() {
    this.velocidad += Math.random() * 5;
  }

  void acelera(double velocidad) {
    this.velocidad += velocidad;
  }

  double getVelocidad() {
    return this.velocidad;
  }

  String printVelocidad() {
    return "Tu caballo corre a " + getVelocidad() + " km/h.";
  }

}
