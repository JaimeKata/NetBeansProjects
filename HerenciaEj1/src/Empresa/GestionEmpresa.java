package Empresa;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author JaimeKata
 */
public class GestionEmpresa {

    public static int empleadosRegistrados = 0;
    public static int jefesRegistrados = 0;

    public static void main(String[] args) {
        Empleado[] empleados;
        empleados = new Empleado[10];
        Jefe[] jefes;
        jefes = new Jefe[10];
        int opcion;
        do {
            menu();

            opcion = Leer.pedirEntero("Seleccione una opcion: ");

            switch (opcion) {
                case 1:
                    registrarEmpleado(empleados);
                    break;
                case 2:
                    registrarJefe(jefes);
                    break;
                case 3:
                    visualizarEmpleados(empleados);
                    break;
                case 4:
                    visualizarJefes(jefes);
                    break;
            }
        } while (opcion != 0);
    }//main

    public static void menu() {
        Leer.mostrarEnPantalla("BIENVENIDO A CARTONAJES SANTORROMAN");
        Leer.mostrarEnPantalla(" 1.- Registrar empleado");
        Leer.mostrarEnPantalla(" 2.- Registrar jefe");
        Leer.mostrarEnPantalla(" 3.- Mostrar todos los empleados");
        Leer.mostrarEnPantalla(" 4.- Mostrar todos los jefes");
        Leer.mostrarEnPantalla(" 0.- Cerrar sesión");
    }//menu 

    public static void registrarEmpleado(Empleado empleados[]) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String nombre = null;
        double sueldo = 0.0;
        Empleado nuevoEmpleado = null;
        System.out.println("REGISTRO DE EMPLEADO");
        System.out.println("-------------------");
        nombre = Leer.pedirCadena("Nombre del empleado: ");
        sueldo = Leer.pedirDouble("Sueldo: ");
        nuevoEmpleado = new Empleado(nombre, sueldo);
        altaEmpleado(nuevoEmpleado, empleados);
    }// registro empleado

    public static void altaEmpleado(Empleado nuevoEmpleado, Empleado empleados[]) {
        for (int i = 0; i < 10; i++) {
            if (empleados[i] == null) {
                empleados[i] = nuevoEmpleado;
                System.out.println("-Empleado registrado con exito-");
                empleadosRegistrados++;
                break;//hago break para que no guarde el mismo empleados en todas las posiciones vacias 
            }
        }
    }//alta empleado y jefe 

    public static void registrarJefe(Jefe jefes[]) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String nombre = null;
        double sueldo = 0.0;
        String titulo = null;
        String nombreDepartamento = null;
        Jefe nuevoJefe = null;
        System.out.println("REGISTRO DE JEFE");
        System.out.println("-------------------");
        nombre = Leer.pedirCadena("Nombre del empleado: ");
        sueldo = Leer.pedirDouble("Sueldo: ");
        titulo = Leer.pedirCadena("Titlo academico: ");
        nombreDepartamento = Leer.pedirCadena("Nombre del departamento: ");
        nuevoJefe = new Jefe(nombre, sueldo, titulo, nombreDepartamento);
        altaJefe(nuevoJefe, jefes);
    }// registro empleado

    public static void altaJefe(Jefe nuevoJefe, Jefe jefes[]) {
        for (int i = 0; i < 10; i++) {
            if (jefes[i] == null) {
                jefes[i] = nuevoJefe;
                System.out.println("-Empleado registrado con exito-");
                jefesRegistrados++;
                break;//hago break para que no guarde el mismo empleados en todas las posiciones vacias 
            }
        }
    }//alta empleado y jefe 

    public static void visualizarEmpleados(Empleado empleados[]) {
        Empleado empleado = null;
        for (int i = 0; i < empleadosRegistrados; i++) {
            empleado = empleados[i];
            System.out.println(empleado.cadenaEmpleado());
        }
    }//visualizar empleados

    public static void visualizarJefes(Jefe jefes[]) {
        Jefe jefe = null;
        for (int i = 0; i < empleadosRegistrados; i++) {
            jefe = jefes[i];
            System.out.println(jefe.cadenaJefe());
        }
    }//visualizar empleados
}
