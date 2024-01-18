package ed_tarea04;

import cuentas.CCuenta;

public class Main {

  public static void main(String[] args) {
    CCuenta cuenta1;
    double saldoActual;

    cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
    saldoActual = cuenta1.estado();
    System.out.println("El saldo actual es " + saldoActual);

    operativaCuenta(cuenta1, 2300, "retirar");
    operativaCuenta(cuenta1, 695, "ingresar");
  }

  public static void operativaCuenta(
    CCuenta cuenta,
    double cantidad,
    String operacion
  ) {
    try {
      if (operacion.equals("retirar")) {
        cuenta.retirar(cantidad);
        System.out.println("Retirada completada");
      } else if (operacion.equals("ingresar")) {
        cuenta.ingresar(cantidad);
        System.out.println("Ingreso completado");
      } else {
        System.out.println("Operación no válida");
      }
    } catch (Exception e) {
      System.out.println("Fallo al " + operacion);
    }
  }
}
