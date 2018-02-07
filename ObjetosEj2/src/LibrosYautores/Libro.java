
package LibrosYautores;

/**
 *
 * @author JaimeKata
 */
public class Libro {
    private String titulo;
    private Autor autor;
    private double precio;
    private int cantidad; 
    
    public Libro(){
        this.titulo = null; 
        this.autor = null; 
        this.precio = 0.0;
        this.cantidad = 0;
    }
    public Libro(String titulo, Autor autor, double precio, int cantidad){
        this.titulo = titulo; 
        this.autor = autor;
        this.precio = precio; 
        this.cantidad = cantidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public String cadenaAutor(){
        return  "Libro[ Titulo: "+titulo+" ,autor "+autor.cadenaAutor()+", precio: "+precio+" ,cantidad"+cantidad+"]";
    }
    
}
