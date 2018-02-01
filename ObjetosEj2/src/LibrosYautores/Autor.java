
package LibrosYautores;

/**
 *
 * @author JaimeKata
 */
public class Autor {
    private String nombre;
    private String email;
    private char genero;
    
    public Autor(){
        this.nombre = null;
        this.email = null; 
        this.genero = ' ';
    }
    public Autor(String nombre, String email, char genero){
        this.nombre = nombre;
        this.email = email;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public char getGenero() {
        return genero;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String cadenaAutor(){
        return "Autor[ Nombre: "+nombre+" ,email: "+email+" ,genero: "+genero+"]";
    }
    
}
