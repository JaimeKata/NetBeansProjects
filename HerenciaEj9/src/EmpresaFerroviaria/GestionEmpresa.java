package EmpresaFerroviaria;

import java.io.IOException;

/**
 *
 * @author JaimeKata
 */
public class GestionEmpresa {

    public static void main(String[] args) throws IOException, EmpresaException {
        Empleado[] empleados;
        empleados = new Empleado[30];
        inicioPrograma(empleados);
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
                        opcionRegistro = Leer.pedirEntero("1. Empleado, 2. Administrativo, 3. Maquinista");
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
                    opcionModificar = Leer.pedirEntero("1. Empleado, 2. Administrativo, 3. Maquinista");
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
                    //visualizarEmpleados(empleados);
                    verPlantilla(empleados);
                    break;
            }
        } while (opcion != 0);
    }//main
    public static void inicioPrograma(Empleado empleados[]){
        Empleado empleado1 = new Empleado("Jaime", 1000, 22);
        Administrativo admin1 = new Administrativo("Ines", 2000, 19, "Fisio", 1);
        Maquinista maquinista1 = new Maquinista("Josean", 3000, 49, 1, 15);
        empleados[0] = empleado1;
        empleados[1] = admin1;
        empleados[2] = maquinista1;
    }
    public static void menu() {
        Leer.mostrarEnPantalla("BIENVENIDO A CARRILES S.A");
        Leer.mostrarEnPantalla(" 1.- Registrar empleado");
        Leer.mostrarEnPantalla(" 2.- Modificar empleado");
        Leer.mostrarEnPantalla(" 3.- Visualizar todos los empleados");
        Leer.mostrarEnPantalla(" 0.- Fin");
    }//menu 

    public static void registrarEmpleado(Empleado empleados[]) throws EmpresaException {
        String nombre = null;
        double sueldo = 0.0;
        int edad = 0;
        Empleado nuevoEmpleado = null;
        Leer.mostrarEnPantalla("REGISTRO DE EMPLEADO");
        Leer.mostrarEnPantalla("--------------------");
        nombre = Leer.pedirCadena("Nombre: ");
        /*/for (int i = 0; i < empleados.length && empleados[i] != null; i++) {
            nuevoEmpleado = empleados[i];
            if (nuevoEmpleado.getNombre().equalsIgnoreCase(nombre) == true) {
                throw new EmpresaException(EmpresaException.EMPLEADO_REGISTRADO);
            }
            nombre = Leer.pedirCadena("Nombre: ");
        }/*/
        sueldo = Leer.pedirDouble("Sueldo: ");
        edad = Leer.pedirEntero("Edad: ");
        nuevoEmpleado = new Empleado(nombre, sueldo, edad);
        altaEmpleado(nuevoEmpleado, empleados);
    }//registro empleado

    public static void registrarAdministrativo(Empleado empleados[]) throws EmpresaException {
        String nombre = null;
        double sueldo = 0.0;
        int edad = 0;
        String estudios = null;
        int nOrdenador = 0;
        Administrativo nuevoAdmin = null;
        Leer.mostrarEnPantalla("REGISTRO DE ADMINISTRATIVO");
        Leer.mostrarEnPantalla("--------------------");
        nombre = Leer.pedirCadena("Nombre: ");
        /*/for (int i = 0; i < empleados.length && empleados[i] != null; i++) {
            nuevoAdmin = (Administrativo) empleados[i];
            if (nuevoAdmin.getNombre().equalsIgnoreCase(nombre) == true) {
                throw new EmpresaException(EmpresaException.ADMIN_REGISTRADO);
            }
            nombre = Leer.pedirCadena("Nombre: ");
        }/*/
        sueldo = Leer.pedirDouble("Sueldo: ");
        edad = Leer.pedirEntero("Edad: ");
        estudios = Leer.pedirCadena("Estudios academicos: ");
        nOrdenador = Leer.pedirEntero("Numero de ordneador: ");
        nuevoAdmin = new Administrativo(nombre, sueldo, edad, estudios, nOrdenador);
        altaEmpleado(nuevoAdmin, empleados);
    }//registro admin 

    public static void registrarMaquinista(Empleado empleados[]) throws EmpresaException {
        String nombre = null;
        double sueldo = 0.0;
        int edad = 0;
        int nMaquina = 0;
        int tiempoEnMaquina = 0;
        Maquinista nuevoMaquinista = null;
        Leer.mostrarEnPantalla("REGISTRO DE MAQUINISTA");
        Leer.mostrarEnPantalla("--------------------");
        nombre = Leer.pedirCadena("Nombre: ");
        /*/for (int i = 0; i < empleados.length && empleados[i] != null; i++) {
            nuevoMaquinista = (Maquinista) empleados[i];
            if (nuevoMaquinista.getNombre().equalsIgnoreCase(nombre) == true) {
                throw new EmpresaException(EmpresaException.MAQUINISTA_REGISTRADO);
            }
            nombre = Leer.pedirCadena("Nombre: ");
        }/*/
        sueldo = Leer.pedirDouble("Sueldo: ");
        edad = Leer.pedirEntero("Edad: ");
        nMaquina = Leer.pedirEntero("Numero de maquina: ");
        tiempoEnMaquina = Leer.pedirEntero("Años en esa maquina: ");
        nuevoMaquinista = new Maquinista(nombre, sueldo, edad, nMaquina, tiempoEnMaquina);
        altaEmpleado(nuevoMaquinista, empleados);
    }//Registro de maquinista

    public static void altaEmpleado(Empleado nuevoEmpleado, Empleado empleados[]) {
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] == null) {
                empleados[i] = nuevoEmpleado;
                System.out.println("-Empleado registrado con exito-");
                Leer.mostrarEnPantalla("");
                break;//hago break para que no guarde el mismo empleado en todas las posiciones vacias 
            }
        }
    }//alta empleado, es un metodo generico

    public static void modificarEmpleado(Empleado empleados[]) throws EmpresaException {
        String nombre = null;
        double sueldo = 0.0;
        int edad = 0;
        Empleado empleadoMod = null;
        int opcionModificar = 0;
        boolean encontrado = false;
        Leer.mostrarEnPantalla("MODIFICACION DE EMPLEADO");
        Leer.mostrarEnPantalla("1. Nombre, 2. Sueldo, 3. Edad ");
        opcionModificar = Leer.pedirEntero("¿Que desea modificar? ");
        switch (opcionModificar) {
            case 1:
                Leer.mostrarEnPantalla("MODIFICACION DE NOMBRE");
                nombre = Leer.pedirCadena("Digame el nombre del empleado: ");
                for (int i = 0; i < empleados.length && !encontrado && empleados[i] != null; i++) {
                    empleadoMod = empleados[i];
                    if (empleadoMod.getNombre().equalsIgnoreCase(nombre) == true) {
                        nombre = Leer.pedirCadena("Digame el nuevo nombre: ");
                        empleadoMod.setNombre(nombre);
                        Leer.mostrarEnPantalla("NOMBRE MODIFICADO");
                        encontrado = true;
                        Leer.mostrarEnPantalla("");
                    } else {
                        throw new EmpresaException(EmpresaException.EMPLEADO_NO_ENCONTRADO);
                        //hay que tratar la exception 
                    }
                }
                break;
            case 2:
                Leer.mostrarEnPantalla("MODIFICACION DE SUELDO");
                nombre = Leer.pedirCadena("Digame el nombre del empleado: ");
                for (int i = 0; i < empleados.length && !encontrado && empleados[i] != null; i++) {
                    empleadoMod = empleados[i];
                    if (empleadoMod.getNombre().equalsIgnoreCase(nombre) == true) {
                        sueldo = Leer.pedirDouble("Digame el nuevo sueldo: ");
                        empleadoMod.setSueldo(sueldo);
                        Leer.mostrarEnPantalla("SUELDO MODIFICADO");
                        encontrado = true;
                        Leer.mostrarEnPantalla("");
                    } else if (empleadoMod.getNombre().equalsIgnoreCase(nombre) == false) {
                        throw new EmpresaException(EmpresaException.EMPLEADO_NO_ENCONTRADO);
                        
                    }
                }
                break;
            case 3:
                Leer.mostrarEnPantalla("MODIFICACION DE EDAD");
                nombre = Leer.pedirCadena("Digame el nombre del empleado: ");
                for (int i = 0; i < empleados.length && !encontrado && empleados[i] != null; i++) {
                    empleadoMod = empleados[i];
                    if (empleadoMod.getNombre().equalsIgnoreCase(nombre) == true) {
                        edad = Leer.pedirEntero("Digame la edad: ");
                        empleadoMod.setSueldo(sueldo);
                        Leer.mostrarEnPantalla("EDAD MODIFICADA");
                        encontrado = true;
                        Leer.mostrarEnPantalla("");
                    } else if (empleadoMod.getNombre().equalsIgnoreCase(nombre) == false){
                        throw new EmpresaException(EmpresaException.EMPLEADO_NO_ENCONTRADO);
                    }
                }
                break;
        }
    }

    public static void modificarAdministrativo(Empleado empleados[]) throws EmpresaException {
        String nombre = null;
        double sueldo = 0.0;
        int edad = 0;
        Administrativo empleadoMod = null;
        int opcionModificar = 0;
        String estudios = null;
        int numeroOrdena = 0;
        boolean encontrado = false;
        Leer.mostrarEnPantalla("MODIFICACION DE ADMINISTRATIVO");
        Leer.mostrarEnPantalla("1. Nombre, 2. Sueldo, 3. Edad, 4. Estudios, 5. Numero ordenador ");
        opcionModificar = Leer.pedirEntero("¿Que desea modificar? ");
        switch (opcionModificar) {
            case 1:
                Leer.mostrarEnPantalla("MODIFICACION DE NOMBRE");
                nombre = Leer.pedirCadena("Digame el nombre del administrativo: ");
                for (int i = 0; i < empleados.length && !encontrado && empleados[i] != null; i++) {
                    empleadoMod = (Administrativo) empleados[i];
                    if (empleadoMod.getNombre().equalsIgnoreCase(nombre) == true) {
                        nombre = Leer.pedirCadena("Digame el nuevo nombre: ");
                        empleadoMod.setNombre(nombre);
                        Leer.mostrarEnPantalla("NOMBRE MODIFICADO");
                        encontrado = true; 
                        Leer.mostrarEnPantalla("");
                    } else if (empleadoMod.getNombre().equalsIgnoreCase(nombre) == false){
                        throw new EmpresaException(EmpresaException.ADMIN_NO_ENCONTRADO);
                    }
                }
                break;
            case 2:
                Leer.mostrarEnPantalla("MODIFICACION DE SUELDO");
                nombre = Leer.pedirCadena("Digame el nombre del administrativo: ");
                for (int i = 0; i < empleados.length && !encontrado && empleados[i] != null; i++) {
                    empleadoMod = (Administrativo) empleados[i];
                    if (empleadoMod.getNombre().equalsIgnoreCase(nombre) == true) {
                        sueldo = Leer.pedirDouble("Digame el nuevo sueldo: ");
                        empleadoMod.setSueldo(sueldo);
                        Leer.mostrarEnPantalla("SUELDO MODIFICADO");
                        encontrado = true;
                        Leer.mostrarEnPantalla("");
                    } else {
                        throw new EmpresaException(EmpresaException.ADMIN_NO_ENCONTRADO);
                    }
                }
                break;
            case 3:
                Leer.mostrarEnPantalla("MODIFICACION DE EDAD");
                nombre = Leer.pedirCadena("Digame el nombre del administrativo: ");
                for (int i = 0; i < empleados.length && !encontrado && empleados[i] != null; i++) {
                    empleadoMod = (Administrativo) empleados[i];
                    if (empleadoMod.getNombre().equalsIgnoreCase(nombre) == true) {
                        edad = Leer.pedirEntero("Digame la edad: ");
                        empleadoMod.setSueldo(sueldo);
                        Leer.mostrarEnPantalla("EDAD MODIFICADA");
                        encontrado = true; 
                        Leer.mostrarEnPantalla("");
                    } else {
                        throw new EmpresaException(EmpresaException.ADMIN_NO_ENCONTRADO);
                    }
                }
                break;
            case 4:
                Leer.mostrarEnPantalla("MODIFICACION DE ESTUDIOS");
                nombre = Leer.pedirCadena("Digame el nombre del administrativo: ");
                for (int i = 0; i < empleados.length && !encontrado && empleados[i] != null; i++) {
                    empleadoMod = (Administrativo) empleados[i];
                    if (empleadoMod.getNombre().equalsIgnoreCase(nombre) == true) {
                        estudios = Leer.pedirCadena("Estudios: ");
                        empleadoMod.setEstudios(estudios);
                        Leer.mostrarEnPantalla("ESTUDIOS MODIFICADOS");
                        encontrado = true;
                        Leer.mostrarEnPantalla("");
                    } else {
                        throw new EmpresaException(EmpresaException.ADMIN_NO_ENCONTRADO);
                    }
                }
                break;
            case 5:
                Leer.mostrarEnPantalla("MODIFICACION DE NUMERO ORDENADOR");
                nombre = Leer.pedirCadena("Digame el nombre del administrativo: ");
                for (int i = 0; i < empleados.length && !encontrado && empleados[i] != null; i++) {
                    empleadoMod = (Administrativo) empleados[i];
                    if (empleadoMod.getNombre().equalsIgnoreCase(nombre) == true) {
                        numeroOrdena = Leer.pedirEntero("Digame el numero de ordenador: ");
                        empleadoMod.setNumeroOrdenador(numeroOrdena);
                        Leer.mostrarEnPantalla("NUMERO ORDENADOR MODIFICADO");
                        encontrado = true; 
                        Leer.mostrarEnPantalla("");
                    } else {
                        throw new EmpresaException(EmpresaException.ADMIN_NO_ENCONTRADO);
                    }
                }
                break;
        }
    }

    public static void modificarMaquinista(Empleado empleados[]) throws EmpresaException {
        String nombre = null;
        double sueldo = 0.0;
        int edad = 0;
        Maquinista empleadoMod = null;
        int opcionModificar = 0;
        int tiempoEnMaquina = 0;
        int numeroMaquina = 0;
        boolean encontrado = false;
        Leer.mostrarEnPantalla("MODIFICACION DE ADMINISTRATIVO");
        Leer.mostrarEnPantalla("1. Nombre, 2. Sueldo, 3. Edad, 4. Estudios, 5. Numero ordenador ");
        opcionModificar = Leer.pedirEntero("¿Que desea modificar? ");
        switch (opcionModificar) {
            case 1:
                Leer.mostrarEnPantalla("MODIFICACION DE NOMBRE");
                nombre = Leer.pedirCadena("Digame el nombre del administrativo: ");
                for (int i = 0; i < empleados.length && !encontrado && empleados[i] != null; i++) {
                    empleadoMod = (Maquinista) empleados[i];
                    if (empleadoMod.getNombre().equalsIgnoreCase(nombre) == true) {
                        nombre = Leer.pedirCadena("Digame el nuevo nombre: ");
                        empleadoMod.setNombre(nombre);
                        Leer.mostrarEnPantalla("NOMBRE MODIFICADO");
                        encontrado = true; 
                        Leer.mostrarEnPantalla("");
                    } else {
                        throw new EmpresaException(EmpresaException.MAQUINISTA_NO_ENCONTRADO);
                    }
                }
                break;
            case 2:
                Leer.mostrarEnPantalla("MODIFICACION DE SUELDO");
                nombre = Leer.pedirCadena("Digame el nombre del administrativo: ");
                for (int i = 0; i < empleados.length && !encontrado && empleados[i] != null; i++) {
                    empleadoMod = (Maquinista) empleados[i];
                    if (empleadoMod.getNombre().equalsIgnoreCase(nombre) == true) {
                        sueldo = Leer.pedirDouble("Digame el nuevo sueldo: ");
                        empleadoMod.setSueldo(sueldo);
                        Leer.mostrarEnPantalla("SUELDO MODIFICADO");
                        encontrado = true;
                        Leer.mostrarEnPantalla("");
                    } else {
                        throw new EmpresaException(EmpresaException.MAQUINISTA_NO_ENCONTRADO);
                    }
                }
                break;
            case 3:
                Leer.mostrarEnPantalla("MODIFICACION DE EDAD");
                nombre = Leer.pedirCadena("Digame el nombre del administrativo: ");
                for (int i = 0; i < empleados.length && !encontrado && empleados[i] != null; i++) {
                    empleadoMod = (Maquinista) empleados[i];
                    if (empleadoMod.getNombre().equalsIgnoreCase(nombre) == true) {
                        edad = Leer.pedirEntero("Digame la edad: ");
                        empleadoMod.setSueldo(sueldo);
                        Leer.mostrarEnPantalla("EDAD MODIFICADA");
                        encontrado = true; 
                        Leer.mostrarEnPantalla("");
                    } else {
                        throw new EmpresaException(EmpresaException.MAQUINISTA_NO_ENCONTRADO);
                    }
                }
                break;
            case 4:
                Leer.mostrarEnPantalla("MODIFICACION DE ESTUDIOS");
                nombre = Leer.pedirCadena("Digame el nombre del administrativo: ");
                for (int i = 0; i < empleados.length && !encontrado && empleados[i] != null; i++) {
                    empleadoMod = (Maquinista) empleados[i];
                    if (empleadoMod.getNombre().equalsIgnoreCase(nombre) == true) {
                        numeroMaquina = Leer.pedirEntero("Digame el numero de maquina: ");
                        empleadoMod.setNumeroMaquina(numeroMaquina);
                        Leer.mostrarEnPantalla("NUMERO MAQUINA MODIFICADO");
                        encontrado = true;
                        Leer.mostrarEnPantalla("");
                    } else {
                        throw new EmpresaException(EmpresaException.MAQUINISTA_NO_ENCONTRADO);
                    }
                }
                break;
            case 5:
                Leer.mostrarEnPantalla("MODIFICACION DE NUMERO ORDENADOR");
                nombre = Leer.pedirCadena("Digame el nombre del administrativo: ");
                for (int i = 0; i < empleados.length && !encontrado && empleados[i] != null; i++) {
                    empleadoMod = (Maquinista) empleados[i];
                    if (empleadoMod.getNombre().equalsIgnoreCase(nombre) == true) {
                        tiempoEnMaquina = Leer.pedirEntero("Digame el tiempo que pasa en la maquina: ");
                        empleadoMod.setTiempoEnMaquina(tiempoEnMaquina);
                        Leer.mostrarEnPantalla("TIEMPO EN MAQUINA MODIFICADO");
                        encontrado = true;
                        Leer.mostrarEnPantalla("");
                    } else {
                        throw new EmpresaException(EmpresaException.MAQUINISTA_NO_ENCONTRADO);
                    }
                }
                break;
        }
    }

    /*/public static void visualizarEmpleados(Empleado empleados[]) {
        Administrativo admin = null;
        Maquinista maquinista = null;
        Empleado empleado = null;
        for (int i = 0; i < empleados.length && empleados[i] != null; i++) {
            empleado = empleados[i];
            if (empleado instanceof Administrativo) {
                admin = (Administrativo) empleados[i];
                Leer.mostrarEnPantalla(empleado.cadenaEmpleado()+admin.cadenaAdministrativo());
            } else if (empleado instanceof Maquinista) {
                maquinista = (Maquinista) empleados[i];
                Leer.mostrarEnPantalla(empleado.cadenaEmpleado()+maquinista.cadenaMaquinista());
            } else {
                Leer.mostrarEnPantalla(empleado.cadenaEmpleado());
            }
        }
        Leer.mostrarEnPantalla("");
    }/*/
    
    public static void verPlantilla(Empleado empleados[]){
        for (int i = 0; i < empleados.length && empleados[i] != null; i++) {
            Leer.mostrarEnPantalla(empleados[i].toString());
        }
        Leer.mostrarEnPantalla("");
    }
}
