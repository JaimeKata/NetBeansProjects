package LibrosYautores;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author JaimeKata
 */
public class GestionLibros {

    private static int autoresRegistrados = 0;
    private static int librosRegistrados = 0;

    public static void main(String[] args) throws IOException {
        Libro[] libros;
        libros = new Libro[10];
        Autor[] autores;
        autores = new Autor[10];
        int opcion;
        do {
            menu();

            opcion = Leer.pedirEntero("Seleccione una opcion: ");

            switch (opcion) {
                case 1://Registrar autor
                    registroAutor(autores);
                    break;
                case 2://Registrar libro
                    registroLibro(libros, autores);
                    break;
                case 3://Modificar autor
                    modificarAutor(autores);
                    break;
                case 4://Modificar libro
                    modificarLibro(libros);
                    break;
                case 5://Ver libros registrados
                    visualizarLibros(libros);
                    break;
                case 6://Ver autores registrados
                    visualizarAutores(autores);
                    break;
            }
        } while (opcion != 0);
    }//main

    public static void menu() {
        Leer.mostrarEnPantalla("BIENVENIDO A LA LIBRERIA VIRTUAL");
        Leer.mostrarEnPantalla(" 1.- Registrar autor");
        Leer.mostrarEnPantalla(" 2.- Registrar libro");
        Leer.mostrarEnPantalla(" 3.- Modificar autor");
        Leer.mostrarEnPantalla(" 4.- Modificar libro");
        Leer.mostrarEnPantalla(" 5.- Ver libros registrados");
        Leer.mostrarEnPantalla(" 6.- Ver autores registrados");
        Leer.mostrarEnPantalla(" 0.- Fin");
    }//menu 

    public static void registroAutor(Autor autores[]) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String nombre = null;
        String email = null;
        String generoAux = null;
        char genero = ' ';
        Autor nuevoAutor = null;
        System.out.println("REGISTRO DE AUTOR");
        System.out.println("-------------------");
        nombre = Leer.pedirCadena("Nombre del autor: ");
        email = Leer.pedirCadena("Email del autor: ");
        System.out.println("Genero: ");
        generoAux = entrada.readLine();
        genero = generoAux.charAt(0);
        nuevoAutor = new Autor(nombre, email, genero);
        altaAutor(nuevoAutor, autores);
    }//registro autor

    public static void altaAutor(Autor nuevoAutor, Autor autores[]) {
        for (int i = 0; i < 10; i++) {
            if (autores[i] == null) {
                autores[i] = nuevoAutor;
                System.out.println("-Autor registrado con exito-");
                autoresRegistrados++;
                break;//hago break para que no guarde el mismo autor en todas las posiciones vacias 
            }
        }
    }//alta autor

    public static void registroLibro(Libro libros[], Autor autores[]) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String titulo = null;
        String nombreAutor = null;
        int cantidad = 0;
        double precio = 0.0;
        Autor autorLibro = null;
        Libro libroNuevo = null;
        System.out.println("REGISTRO DE LIBRO");
        System.out.println("-------------------");
        titulo = Leer.pedirCadena("Titulo del libro: ");
        nombreAutor = Leer.pedirCadena("Nombre del autor del libro: ");
        autorLibro = buscaAutor(nombreAutor, autores);
        precio = Leer.pedirDouble("Precio del libro");
        cantidad = Leer.pedirEntero("Cantidad del producto");
        libroNuevo = new Libro(titulo, autorLibro, precio, cantidad);
        altaLibro(libroNuevo, libros);
    }//registro libro

    public static void altaLibro(Libro libroNuevo, Libro libros[]) {
        for (int i = 0; i < 10; i++) {
            if (libros[i] == null) {
                libros[i] = libroNuevo;
                System.out.println("-Libro registrado con exito-");
                librosRegistrados++;
                break;//hago break para que no guarde el mismo autor en todas las posiciones vacias 
            }
        }
    }//alta libro

    public static Autor buscaAutor(String nombreAutor, Autor autores[]) {//me aseguro de que el autor existe
        Autor autorLibro = null;
        for (int i = 0; i < autoresRegistrados; i++) {
            if (autores[i].getNombre().equalsIgnoreCase(nombreAutor) == true) {
                autorLibro = autores[i];
            }
        }
        if (autorLibro == null) {
            System.out.println("El autor no existe, vuelve a introducir el nombre");
            modificarAutor(autores);
        }
        return autorLibro;
    }//busqueda Autor

    public static void modificarAutor(Autor autores[]) {
        String nombreAutor = null;
        String email = null;
        Autor autorMod = null;
        System.out.println("MODIFICAR AUTOR");
        System.out.println("-------------------");
        nombreAutor = Leer.pedirCadena("Nombre del autor: ");
        System.out.println("Comprobando si existe...");
        autorMod = buscaAutor(nombreAutor, autores);
        email = Leer.pedirCadena("Nuevo email del autor: ");
        autorMod.setEmail(email);
        System.out.println("AUTOR MODIFICADO");
    }//modificar autor 

    public static void visualizarAutores(Autor autores[]) {
        Autor autor = null;
        for (int i = 0; i < autoresRegistrados; i++) {
            autor = autores[i];
            System.out.println(autor.cadenaAutor());
        }
    }//visualizar autores

    public static void visualizarLibros(Libro libros[]) {
        Libro libro = null;
        for (int i = 0; i < librosRegistrados; i++) {
            libro = libros[i];
            System.out.println(libro.cadenaLibro());
        }
    }//visualizar libros

    public static void modificarLibro(Libro libros[]) {
        String titulo = null;
        int cantidad = 0;
        double precio = 0.0;
        Libro libroMod = null;
        int opcion = 0;
        System.out.println("MODIFICAR LIBRO");
        System.out.println("-------------------");
        titulo = Leer.pedirCadena("Titulo del libro: ");
        System.out.println("Comprobando si existe...");
        libroMod = buscaLibro(titulo, libros);
        System.out.println("Que desea modificar? 1. Cantidad, 2. Precio");
        opcion = Leer.pedirEntero("Elija una opcion: ");
        switch (opcion) {
            case 1:
                cantidad = Leer.pedirEntero("Cantidad del producto: ");
                libroMod.setCantidad(cantidad);
                break;
            case 2:
                precio = Leer.pedirDouble("Nuevo precio del libro");
                libroMod.setPrecio(precio);
                break;
        }
        System.out.println("LIBRO MODIFICADO");
    }//modificar libro1

    public static Libro buscaLibro(String titulo, Libro libros[]) {//me aseguro de que el libro existe
        Libro libroMod = null;;
        for (int i = 0; i < librosRegistrados; i++) {
            if (libros[i].getTitulo().equalsIgnoreCase(titulo) == true) {
                libroMod = libros[i];
            }
        }
        if (libroMod == null) {
            System.out.println("El autor no existe, vuelve a introducir el nombre");
            modificarLibro(libros);
        }
        return libroMod;
    }//busqueda libro
}
