package Banco;

import java.util.Scanner;

/**
 *
 * @author JaimeKata
 */
public class Sucursal {

    private static CuentaCorriente bbdd[];

    private static final int Max = 10;

    public Sucursal() {
        this.bbdd = new CuentaCorriente[10];
    }

    public static void crearCuentaCorriente(String nombreCliente, double saldo) {
        CuentaCorriente nuevaCuenta = new CuentaCorriente(nombreCliente, saldo);
        altaCuenta(nuevaCuenta);
    }

    public static void altaCuenta(CuentaCorriente nuevaCuenta) {
        for (int i = 0; i < Max; i++) {
            if (bbdd.length == 0) {
                bbdd[0] = nuevaCuenta;
                System.out.println("Cuenta creada con exito");
            } else {
                bbdd[i + 1] = nuevaCuenta;
                System.out.println("Cuenta creada con exito");
            }
        }
    }

    public static void ingresarDinero(String numeroCuenta, double cantidad) {
        double saldoAux = 0;
        CuentaCorriente cuenta = null;
        System.out.println("Tramitando operación...");
        for (int i = 0; i < bbdd.length; i++) {
            if (cuenta.getNumeroCuenta().equalsIgnoreCase(numeroCuenta) == true) {//Comprobamos que el numero de cuenta existe con el numero de alguna cuenta 
                saldoAux = cuenta.getSaldo();
                saldoAux = saldoAux + cantidad;
                cuenta.setSaldo(saldoAux);
                System.out.println("Operación realizada con exito");

            } else {
                System.out.println("ERROR, numero de cuenta erroneo");
            }
        }

    }

    public static void retirarDinero(String numeroCuenta, double cantidad) {
        double saldoAux = 0;
        CuentaCorriente cuenta = null;
        System.out.println("Tramitando operación...");
        for (int i = 0; i < bbdd.length; i++) {
            if (cuenta.getNumeroCuenta().equalsIgnoreCase(numeroCuenta) == true) {//Comprobamos que el numero de cuenta existe con el numero de alguna cuenta
                System.out.println("Comprobando saldo...");
                if (cantidad > 0) {
                    saldoAux = cuenta.getSaldo();
                    if (saldoAux >= cantidad) {
                        saldoAux = saldoAux - cantidad;
                        cuenta.setSaldo(saldoAux);
                        System.out.println("Operación realizada con exito");
                    } else {
                        System.out.println("ERROR, saldo insuficiente");
                    }
                } else {
                    System.out.println("ERROR, no hay saldo");
                }
            } else {
                System.out.println("ERROR, numero de cuenta erroneo");
            }
        }
    }

    public static void fusionarCuentas(String nombreCliente, String numeroCuenta1, String numeroCuenta2) {
        double saldo = 0;
        CuentaCorriente cuenta = null;
        System.out.println("Comprobando la existencia de las cuentas...");
        for (int i = 0; i < bbdd.length; i++) {
            if (cuenta.getNumeroCuenta().equalsIgnoreCase(numeroCuenta1) == true) {
                saldo = cuenta.getSaldo();
            } else {
                System.out.println("ERROR, numero de cuenta erroneo");
            }
        }
        for (int i = 0; i < bbdd.length; i++) {
            if (cuenta.getNumeroCuenta().equalsIgnoreCase(numeroCuenta2) == true) {
                saldo = saldo + cuenta.getSaldo();
            } else {
                System.out.println("ERROR, numero de cuenta erroneo");
            }
        }
        System.out.println("Fusionando cuentas...");
        crearCuentaCorriente(nombreCliente, saldo);
        eliminarCuenta(numeroCuenta1);
        eliminarCuenta(numeroCuenta2);
    }

    public static void eliminarCuenta(String numeroCuenta) {
        CuentaCorriente cuenta = null;
        System.out.println("Comprobando la existencia de las cuentas...");
        for (int i = 0; i < bbdd.length; i++) {
            if (cuenta.getNumeroCuenta().equalsIgnoreCase(numeroCuenta) == true) {
                bbdd[i] = null;
            } else {
                System.out.println("ERROR, numero de cuenta erroneo");
            }
        }
        System.out.println("Eliminando cuentas...");
    }
    
    public static void mostrarCuentasAbiertas(){
        CuentaCorriente cuenta = null; 
        for (int i = 0; i < bbdd.length; i++) {
            System.out.println(cuenta.toString());
        }
    }
    public static void mostrarCuenta(String numeroCuenta){
        CuentaCorriente cuenta = null; 
         for (int i = 0; i < bbdd.length; i++) {
            if (cuenta.getNumeroCuenta().equalsIgnoreCase(numeroCuenta) == true) {
                System.out.println(cuenta.toString());
            }
         }
    }
    
    public static void menu() {
        System.out.println("Bienvenido al banco BBVA");
        System.out.println("------------------------");
        System.out.println("MENU PRINCIPAL");
        System.out.println("0. Salir");
        System.out.println("1. Crear una cuenta");
        System.out.println("2. Ingresar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Fusionar cuenta");
        System.out.println("5. Eliminar cuenta cuenta");
        System.out.println("6. Ver cuentas abiertas");
        System.out.println("7. Ver una cuenta");
    }

    public static void main(String[] args) {
        int opcion;
        String nombre;
        double cantidad;
        String numeroCuenta;
        String numeroCuenta2;

        Scanner entrada = new Scanner(System.in);
        menu();
        System.out.println("Selccione una opción: ");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("CREAR NUEVO USUARIO");
                System.out.println("Nombre: ");entrada.nextLine();
                nombre = entrada.nextLine();
                System.out.println("Cuanto dinero desea depositar: ");
                cantidad = entrada.nextDouble();
                crearCuentaCorriente(nombre, cantidad);
                break;
            case 2:
                System.out.println("INGRESAR DINERO");
                System.out.println("Digame su numero de cuenta: ");
                numeroCuenta = entrada.nextLine();
                System.out.println("¿Cuanto saldo desea depositar? ");
                cantidad = entrada.nextDouble();
                ingresarDinero(numeroCuenta, cantidad);
                break;
            case 3:
                System.out.println("RETIRAR DINERO");
                System.out.println("Digame su numero de cuenta: ");
                numeroCuenta = entrada.nextLine();
                System.out.println("¿Cuanto saldo desea retirar? ");
                cantidad = entrada.nextDouble();
                retirarDinero(numeroCuenta, cantidad);
                break;
            case 4:
                System.out.println("FUSIONAR CUENTA");
                System.out.println("Digame un nombre para la nueva cuenta: ");
                nombre = entrada.nextLine();
                System.out.println("Digame el numero de cuenta de la primera cuenta: ");
                numeroCuenta = entrada.nextLine();
                System.out.println("Digame el numero de cuenta de la segunda cuenta: ");
                numeroCuenta2 = entrada.nextLine();
                fusionarCuentas(nombre, numeroCuenta, numeroCuenta2);
                break;
            case 5:
                System.out.println("ELIMINAR CUENTA");
                System.out.println("Digame su numero de cuenta: ");
                numeroCuenta = entrada.nextLine();
                eliminarCuenta(numeroCuenta);
                break;
            case 6:
                System.out.println("VER CUENTAS ABIERTAS");
                mostrarCuentasAbiertas();
                break;
            case 7:
                System.out.println("VER UNA CUENTA");
                System.out.println("Digame su numero de cuenta: ");
                numeroCuenta = entrada.nextLine();
                mostrarCuenta(numeroCuenta);
                break;
            case 0: 
                System.out.println("GRACIAS POR SU VISITA");
                System.exit(1);
        }
    }
}
