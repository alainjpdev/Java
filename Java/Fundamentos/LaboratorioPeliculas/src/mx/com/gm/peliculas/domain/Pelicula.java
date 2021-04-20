
package mx.com.gm.peliculas.domain;

public class Pelicula {
    String nombre;
    
    public Pelicula(){
    }
    
    public Pelicula(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + '}';
    }

    public void crear(String nombreArchivo, String peliNueva) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
