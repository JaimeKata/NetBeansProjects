package EmpresaFerroviaria;

import java.io.IOException;

/**
 *
 * @author JaimeKata
 */
public class GestionEmpresa {

    private static int empleadosRegistrados = 0;

    public static void main(String[] args) throws IOException {
        Empleado[] empleados;
        empleados = new Empleado[30];
        int opcion;
        do {
            menu();

            opcion = Leer.pedirEntero("Seleccione una opcion: ");

            switch (opcion) {
                case 1://registrar empleado
                    int nEmpleados = 0;
                    nEmpleados = Leer.pedirEntero("¿Cuantos empleados quieres regsitrar? ");
                    do {
                        int opcionRegistro = 0;
                        Leer.mostrarEnPantalla("1. Empleado, 2. Administrativo, 3. Maquinista");
                        switch (opcionRegistro) {
                            case 1:
                                registrarEmpleado(empleados);
                                nEmpleados--;
                                break;
                            case 2:
                                registrarAdministrativo(empleados);
                                nEmpleados--;
                                break;
                            case 3:
                                registrarMaquinista(empleados);
                                nEmpleados--;
                                break;
                        }

                    } while (nEmpleados != 0);
                    break;
                case 2:
                    int opcionModificar = 0;
                        Leer.mostrarEnPantalla("1. Empleado, 2. Administrativo, 3. Maquinista");
                        switch (opcionModificar) {
                            case 1:
                                modificarEmpleado(empleados);
                                
                                break;
                            case 2:
                                modificarAdministrativo(empleados);
                                
                                break;
                            case 3:
                                modificarMaquinista(empleados);
                                
                                break;
                        }
                    break;
                case 3:
                    break;
            }
        } while (opcion != 0);
    }//main

    public static void menu() {
        Leer.mostrarEnPantalla("BIENVENIDO A CARRILES S.A");
        Leer.mostrarEnPantalla(" 1.- Registrar empleado");
        Leer.mostrarEnPantalla(" 2.- Modificar empleado");
        Leer.mostrarEnPantalla(" 3.- Visualizar todos los empleados");
        Leer.mostrarEnPantalla(" 0.- Fin");
    }//menu 

    public static void registrarEmpleado(Empleado empleados[]) {
        String nombre = null;
        double sueldo = 0.0;
        int edad = 0;
        Empleado nuevoEmpleado = null;
        Leer.mostrarEnPantalla("REGISTRO DE EMPLEADO");
        Leer.mostrarEnPantalla("--------------------");
        nombre = Leer.pedirCadena("Nombre: ");
        sueldo = Leer.pedirDouble("Sueldo: ");
        edad = Leer.pedirEntero("Edad: ");
        nuevoEmpleado = new Empleado(nombre, sueldo, edad);
        altaEmpleado(nuevoEmpleado, empleados);
    }//registro empleado

    public static void registrarAdministrativo(Empleado empleados[]) {
        String nombre = null;
        double sueldo = 0.0;
        int edad = 0;
        String estudios = null;
        int nOrdenador = 0;
        Empleado nuevoAdmin = null;
        Leer.mostrarEnPantalla("REGISTRO DE ADMINISTRATIVO");
        Leer.mostrarEnPantalla("--------------------");
        nombre = Leer.pedirCadena("Nombre: ");
        sueldo = Leer.pedirDouble("Sueldo: ");
        edad = Leer.pedirEntero("Edad: ");
        estudios = Leer.pedirCadena("Estudios academicos: ");
        nOrdenador = Leer.pedirEntero("Numero de ordneador: ");
        nuevoAdmin = new Administrativo(nombre, sueldo, edad, estudios, nOrdenador);
        altaEmpleado(nuevoAdmin, empleados);
    }//registro admin 

    public static void registrarMaquinista(Empleado empleados[]) {
        String nombre = null;
        double sueldo = 0.0;
        int edad = 0;
        int nMaquina = 0;
        int tiempoEnMaquina = 0;
        Empleado nuevoMaquinista = null;
        Leer.mostrarEnPantalla("REGISTRO DE MAQUINISTA");
        Leer.mostrarEnPantalla("--------------------");
        nombre = Leer.pedirCadena("Nombre: ");
        sueldo = Leer.pedirDouble("Sueldo: ");
        edad = Leer.pedirEntero("Edad: ");
        nMaquina = Leer.pedirEntero("Numero de maquina: ");
        tiempoEnMaquina = Leer.pedirEntero("Años en esa maquina: ");
        nuevoMaquinista = new Maquinista(nombre, sueldo, edad, nMaquina, tiempoEnMaquina);
        altaEmpleado(nuevoMaquinista, empleados);
    }//Registro de maquinista

    public static void altaEmpleado(Empleado nuevoEmpleado, Empleado empleados[]) {
        for (int i = 0; i < 30; i++) {
            if (empleados[i] == null) {
                empleados[i] = nuevoEmpleado;
                System.out.println("-Empleado registrado con exito-");
                empleadosRegistrados++;
                break;//hago break para que no guarde el mismo empleado en todas las posiciones vacias 
            }
        }
    }//alta empleado, es un metodo generico
    public static void modificarEmpleado(Empleado empleados[]){
        
    }
    public static void modificarAdministrativo(Empleado empleados[]){
        
    }
    public static void modificarMaquinista(Empleado empleados[]){
        
    }
}
