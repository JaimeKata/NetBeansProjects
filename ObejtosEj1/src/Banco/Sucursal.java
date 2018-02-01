package Banco;

/**
 *
 * @author JaimeKata
 */
public class Sucursal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CuentaCorriente cuenta1 = null, cuenta2 = null, nuevaCuenta = null;
        CuentaCorriente[] cuentas;
        cuentas = new CuentaCorriente[10];
        String cliente;
        Double saldo = 0.0;

        /*/
        for (int i = 0; i < 2; i++) {
            cliente = Leer.pedirCadena("Nombre del cliente: ");
            saldo = Leer.pedirDouble("Saldo inicial: ");
            cuentas[i] = new CuentaCorriente(saldo, cliente);
        }
        Leer.mostrarEnPantalla(cuentas.toString());
        for (int i = 0; i < cuentas.length; i++) {
            Leer.mostrarEnPantalla("" + cuentas[i]);
            if (i < CuentaCorriente.getSiguiente() - 1) {
                System.out.println((cuentas[i]));
            }
        }
        /*/
        //Menu
        int opcion;
        do {
            menu();

            opcion = Leer.pedirEntero("Seleccione una opcion: ");
            Double importe = -1.0;
            String numCuenta;
            Boolean existe = false, saldosuf;
            switch (opcion) {
                case 1://Crear cuenta
                    registrarCliente(cuentas);
                    break;
                case 2://visualizar cuentas
                    mostrarCuentas(cuentas);
                    break;
                case 3://ingresar en cuenta
                    ingresarEnCuenta(cuentas);
                    break;
                case 4://retirar efectivo
                    retirarEfectivo(cuentas);
                    break;
                case 5://fusion de cuentas 
                    fusionarCuentas(cuentas, cuenta1, cuenta2, nuevaCuenta);
                    break;
                case 6://borrado de cuentas
                    borrarCuenta(cuentas);
                    break;
            }
        } while (opcion != 0);
    }//main

    public static void menu() {
        Leer.mostrarEnPantalla("BIENVENIDO AL BANCO BBVA");
        Leer.mostrarEnPantalla(" 1.- Crear cuenta");
        Leer.mostrarEnPantalla(" 2.- Visualizar las cuentas");
        Leer.mostrarEnPantalla(" 3.- Ingresar en una cuenta");
        Leer.mostrarEnPantalla(" 4.- Sacar de una cuenta");
        Leer.mostrarEnPantalla(" 5.- Fusionar cuentas");
        Leer.mostrarEnPantalla(" 6.- Borrar cuenta");
        Leer.mostrarEnPantalla(" 0.- Fin");
    }//menu

    public static void ingresarEnCuenta(CuentaCorriente cuentas[]) {
        Double importe = 0.0;
        String numCuenta;
        Boolean existe = false;
        System.out.println("INGRESAR DINERO EN CUENTA");
        System.out.println("-------------------------");
        do {
            importe = Leer.pedirDouble("Teclee importe a ingresar: ");
        } while (importe < 0);
        numCuenta = Leer.pedirCadena("Código de cuenta en la que ingresar: ");
        for (int i = 0; i < CuentaCorriente.getSiguiente() - 1; i++) {
            if (cuentas[i].getCliente().contains("CERRADA") == false) {
                if (cuentas[i].getNumero().equalsIgnoreCase(numCuenta)) {
                    cuentas[i].ingresarEfectivo(importe);
                    existe = true;
                    System.out.println("Operación realizada con exito");
                    importe = cuentas[i].getSaldo();
                    System.out.println("Saldo actual: " + importe);

                }
            } else {
               existe = false;
            }
        }
        if (!existe) {
            Leer.mostrarEnPantalla("Cuenta no existente " + numCuenta+" o está cerrada");
        }
    }//Ingresar

    public static void registrarCliente(CuentaCorriente cuentas[]) {
        String cliente;
        double saldo;
        System.out.println("REGISTRO DE USUARIO");
        System.out.println("-------------------");
        if (CuentaCorriente.getSiguiente() == 11) {
            Leer.mostrarEnPantalla("Límite de cuentas alcanzado");
        } else {
            cliente = Leer.pedirCadena("Nombre del cliente: ");
            saldo = Leer.pedirDouble("Saldo inicial: ");
            cuentas[CuentaCorriente.getSiguiente() - 1] = new CuentaCorriente(saldo, cliente);
        }
    }//registro

    public static void mostrarCuentas(CuentaCorriente cuentas[]) {
        System.out.println("CUENTAS ABIERTAS");
        System.out.println("----------------");
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i] != null) {
                Leer.mostrarEnPantalla(cuentas[i].visualiza());
            }
        }
    }//mostrar cuentas

    public static void retirarEfectivo(CuentaCorriente cuentas[]) {
        String numCuenta;
        double importe = 0.0;
        boolean existe = false, saldoSuf = false;
        double saldo = 0;
        System.out.println("RETIRAR DINERO DE UNA CUENTA");
        System.out.println("----------------------------");
        do {
            importe = Leer.pedirDouble("Teclee importe a retirar: ");
        } while (importe < 0);
        numCuenta = Leer.pedirCadena("Código de cuenta en la que retirar dinero: ");
        for (int i = 0; i < CuentaCorriente.getSiguiente() - 1; i++) {
            if (cuentas[i].getNumero().equalsIgnoreCase(numCuenta)) {
                saldoSuf = cuentas[i].retirarEfectivo(importe);
                if (!saldoSuf) {
                    Leer.mostrarEnPantalla("No hay saldo suficiente");
                }
                existe = true;
                System.out.println("Operación realizada con exito");
                saldo = cuentas[i].getSaldo();
                System.out.println("El saldo actual es: " + saldo);
            }
        }
        if (!existe) {
            Leer.mostrarEnPantalla("Cuenta no existente " + numCuenta);
        }
    }//retirar pasta

    public static void fusionarCuentas(CuentaCorriente cuentas[], CuentaCorriente cuenta1, CuentaCorriente cuenta2, CuentaCorriente nuevaCuenta) {
        String numCuenta;
        boolean correcto1 = false;
        boolean correcto2 = false;
        System.out.println("FUSION DE CUENTAS");
        System.out.println("-----------------");
        do {
            numCuenta = Leer.pedirCadena("Código de cuenta 1 que desea fusionar");
            for (int i = 0; i < CuentaCorriente.getSiguiente() - 1; i++) {
                if (cuentas[i].getNumero().equalsIgnoreCase(numCuenta) == true) {
                    cuenta1 = cuentas[i];
                    correcto1 = true;
                }
            }
            numCuenta = Leer.pedirCadena("Código de cuenta 2 que desea fusionar");
            for (int i = 0; i < CuentaCorriente.getSiguiente() - 1; i++) {
                if (cuentas[i].getNumero().equalsIgnoreCase(numCuenta) == true) {
                    cuenta2 = cuentas[i];
                    correcto2 = true;
                }
            }
        } while (correcto1 == false || correcto2 == false);
       
        nuevaCuenta = CuentaCorriente.fusion(cuenta1, cuenta2);
        
        cuentas[CuentaCorriente.getSiguiente() - 2] = nuevaCuenta;

    }// fusionar cuentas

    public static void borrarCuenta(CuentaCorriente cuentas[]) {
        String numCuenta;
        System.out.println("BORRAR CUENTA");
        System.out.println("-------------");
        numCuenta = Leer.pedirCadena("Código de cuenta que desea borrar");
        for (int i = 0; i < CuentaCorriente.getSiguiente() - 1; i++) {
            if (cuentas[i].getNumero().equalsIgnoreCase(numCuenta) == true) {
                cuentas[i].borrarCuenta();
                System.out.println("Cuenta borrada");
            }
        }
    }//borrar cuenta

}//class
