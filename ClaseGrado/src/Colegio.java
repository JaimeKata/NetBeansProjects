
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jaime-kata
 */
public class Colegio {

    private static Map<String, Profesor> profesores;
    private static Map<String, Alumno> alumnos;
    private static Map<String, Asignatura> asignaturas;
    private ArrayList<Matricula> matriculas;

    public Colegio() {
        this.alumnos = new HashMap<>();
        this.profesores = new HashMap<>();
        this.asignaturas = new HashMap<>();
        matriculas = new ArrayList(60);
    }

    //Comprueba en el Map si existe el alumno que se quiere registrar en la BBDD
    public static void altaAlumno(Alumno nuevoAlumno) throws ColegioException {
        if (alumnos.containsKey(nuevoAlumno.getDni()) == false) {
            alumnos.put(nuevoAlumno.getDni(), nuevoAlumno);
        } else {
            throw new ColegioException(ColegioException.DNI_REGISTRADO);
        }
    }

    //Comprueba en el Map si existe el profesor que se quiere registrar en la BBDD
    public static void altaProfesor(Profesor nuevoProfesor) throws ColegioException {
        if (profesores.containsKey(nuevoProfesor.getDni()) == false) {
            profesores.put(nuevoProfesor.getDni(), nuevoProfesor);
        } else {
            throw new ColegioException(ColegioException.DNI_REGISTRADO);
        }
    }

    //Pide los datos del nuevo profesor que se quiere registrar
    public static void registrarProfesor(String dni, String nombre, String apellido, int edad, String direccion, int telefonoContacto, String correoElectronico, String despacho, String tutoria) throws ColegioException {
        Profesor nuevoProfesor = new Profesor(dni, nombre, apellido, edad, direccion, telefonoContacto, correoElectronico, despacho, tutoria);
        altaProfesor(nuevoProfesor);
    }

    //Pide los datos del alumno nuevo que se quiere registrar
    public static void registrarAlumno(String dni, String nombre, String apellido, int edad, String direccion, int telefonoContacto, String correoElectronico, String tutor, String curso) throws ColegioException {
        Alumno nuevoAlumno = new Alumno(dni, nombre, apellido, edad, direccion, telefonoContacto, correoElectronico, tutor, curso);
        altaAlumno(nuevoAlumno);
    }

    //Comprueba en el Map si existe la asignatura que queremos registrar en la BBDD
    public static void altaAsignatura(Asignatura nuevaAsignatura) throws ColegioException {
        if (profesores.containsKey(nuevaAsignatura.getTutor()) == true) {
            if (asignaturas.containsKey(nuevaAsignatura.getCodigo()) == false) {
                asignaturas.put(nuevaAsignatura.getCodigo(), nuevaAsignatura);
            } else {
                throw new ColegioException(ColegioException.CODIGO_REGISTRADO);
            }
        } else {
            throw new ColegioException(ColegioException.TUTOR_NO_REGISTRADO);
        }

    }

    //Pide los datos de la nueva asignatura que queremos registrar
    public static void registrarAsignatura(String nombre, String codigo, String creditos, String clase, String tutor) throws ColegioException {
        Asignatura nuevaAsignatura = new Asignatura(nombre, codigo, creditos, clase, tutor);
        altaAsignatura(nuevaAsignatura);
    }

    //Borramos al profesor, para eso usamos la clave DNI
    public static void eliminarProfesor(String dni) throws ColegioException {
        if (profesores.containsKey(dni) == true) {
            profesores.remove(dni);
        } else {
            throw new ColegioException(ColegioException.TUTOR_NO_REGISTRADO);
        }
    }

    //Borramos al alumno, para ello usamos la clave que es DNI
    public static void eliminarAlumno(String dni) throws ColegioException {
        if (alumnos.containsKey(dni) == true) {
            alumnos.remove(dni);
        } else {
            throw new ColegioException(ColegioException.ALUMNO_NO_REGISTRADO);
        }
    }

    //Borramos una asignatura mediante el codigo de asignatura
    public static void eliminarAsignatura(String codigo) throws ColegioException {
        if (asignaturas.containsKey(codigo) == true) {
            asignaturas.remove(codigo);
        } else {
            throw new ColegioException(ColegioException.ASIGNATURA_NO_REGISTRADA);
        }
    }

    //Crear el registro de la asignatura
    public void registrarNotasAlumno(String dniAlumno, String codigoAsignatura, String nombreAsignatura, int notaAsignatura) throws ColegioException {
        if (alumnos.containsKey(dniAlumno) == true && asignaturas.containsKey(codigoAsignatura) == true) {
            Matricula nuevaMatricula = new Matricula(dniAlumno, codigoAsignatura, nombreAsignatura, notaAsignatura);
            insertarNotasAlumno(nuevaMatricula);
        } else {
            throw new ColegioException(ColegioException.DATOS_ERRONEOS);
        }

    }

    //Registro las notas de un alumno
    public void insertarNotasAlumno(Matricula nuevaMatricula) throws ColegioException {
        if (matriculas.contains(nuevaMatricula) == false) {
            matriculas.add(nuevaMatricula);
        } else {
            throw new ColegioException(ColegioException.NOTA_REGISTRADA);
        }
    }

    //Calcular la media de notas de un alumno
    public void notaMedia(String dni) {

    }

    //Metodo principal de llamda al programa
    public static void main(String[] args) throws IOException, ColegioException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int opcion;
        int edad;
        int telefonoContacto;
        int nota;
        String dni;
        String nombre;
        String apellido;
        String direccion;
        String correoElectronico;
        String tutor;
        String curso;
        String despacho;
        String tutoria;
        String codigo;
        String creditos;
        String clase;

        System.out.println("Bienvenido al colegio Santiago Hernandez");
        System.out.println("");
        System.out.println("MENU PRINCIPAL");
        System.out.println("1. Registrar nuevo profesor");
        System.out.println("2. Registrar nuevo alumno");
        System.out.println("3. Registrar nueva asignatura");
        System.out.println("4. Eliminar profesor");
        System.out.println("5. Eliminar alumno");
        System.out.println("6. Eliminar asignatura");
        System.out.println("7. Insertar notas de un alumno");
        System.out.println("8. Calcular la media de notas de un alumno");
        System.out.println("9. Salir");
        System.out.println("Elige una opcion:");
        opcion = entrada.read();
        while (opcion != 9) {
            switch (opcion) {
                case '1':
                    System.out.println("REGISTRO DE PROFESOR");
                    System.out.println("DNI: "); entrada.readLine();
                    dni = entrada.readLine();
                    System.out.println("Nombre: ");
                    nombre = entrada.readLine();
                    System.out.println("Apellido: ");
                    apellido = entrada.readLine();
                    System.out.println("Edad: ");
                    edad = entrada.read();
                    System.out.println("Direccion: ");entrada.readLine();
                    direccion = entrada.readLine();
                    System.out.println("Telefono contacto: ");
                    telefonoContacto = entrada.read();
                    System.out.println("Correo electronico: ");entrada.readLine();
                    correoElectronico = entrada.readLine();
                    System.out.println("Despacho: ");
                    despacho = entrada.readLine();
                    System.out.println("Tutorias: ");
                    tutoria = entrada.readLine();
                    registrarProfesor(dni, nombre, apellido, edad, direccion, telefonoContacto, correoElectronico, despacho, tutoria);
                    break;
                case '2':
                    System.out.println("REGISTRO DE ALUMNO");
                    System.out.println("DNI: ");entrada.readLine();
                    dni = entrada.readLine();
                    System.out.println("Nombre: ");
                    nombre = entrada.readLine();
                    System.out.println("Apellido: ");
                    apellido = entrada.readLine();
                    System.out.println("Edad: ");
                    edad = entrada.read();
                    System.out.println("Direccion: ");
                    direccion = entrada.readLine();
                    System.out.println("Telefono contacto: ");
                    telefonoContacto = entrada.read();
                    System.out.println("Correo electronico: ");
                    correoElectronico = entrada.readLine();
                    System.out.println("Tutor: ");
                    tutor = entrada.readLine();
                    System.out.println("Curso: ");
                    curso = entrada.readLine();
                    registrarAlumno(dni, nombre, apellido, edad, direccion, telefonoContacto, correoElectronico, tutor, curso);
                    break;
                case '3':
                    System.out.println("REGISTRO DE ASIGNATURA");
                    System.out.println("Nombre: ");
                    nombre = entrada.readLine();
                    System.out.println("Codigo: ");
                    codigo = entrada.readLine();
                    System.out.println("Creditos: ");
                    creditos = entrada.readLine();
                    System.out.println("Clase: ");
                    clase = entrada.readLine();
                    System.out.println("Tutor");
                    tutor = entrada.readLine();
                    registrarAsignatura(nombre, codigo, creditos, clase, tutor);
                    break;
                case '4':
                    System.out.println("ELIMINAR PROFESOR DEL SISTEMA");
                    System.out.println("Digame el DNI del profesor");
                    dni = entrada.readLine();
                    eliminarProfesor(dni);
                    break;
                case '5':
                    System.out.println("ELIMINAR ALUMNO DEL SISTEMA");
                    System.out.println("Digame el DNI del alumno");
                    dni = entrada.readLine();
                    eliminarAlumno(dni);
                    break;
                case '6': 
                    System.out.println("ELIMINAR ASIGNATURA DEL SISTEMA");
                    System.out.println("Digame el codigo de la asignatura");
                    codigo = entrada.readLine();
                    eliminarAsignatura(codigo);
                    break;
                case '7':
                    System.out.println("REGISTRO DE NOTAS DEL ALUMNO");
                    System.out.println("DNI del alumno: ");
                    dni = entrada.readLine();
                    System.out.println("Codigo de la asignatura: ");
                    codigo = entrada.readLine();
                    System.out.println("Nombre de la asignatura: ");
                    nombre = entrada.readLine();
                    System.out.println("Nota del alumno: ");
                    nota = entrada.read();
                    break;
                case '9':
                    System.out.println("QUE TENGA UN BUEN DIA, ADIOS");
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Por favor eliga una opcion de 1 a 9");
            }
            System.out.println("Elige una opcion:");
            opcion = entrada.read();
        }
    }

}
