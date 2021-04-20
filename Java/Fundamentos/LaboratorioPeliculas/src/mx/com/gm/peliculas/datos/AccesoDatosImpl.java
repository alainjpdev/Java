package mx.com.gm.peliculas.datos;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

public class AccesoDatosImpl implements IAccesoDatos {

    @Override
    public boolean existe(String nombreRecurso) throws AccesoDatosEx {
        File archivo = new File(nombreRecurso);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx {
        var archivo = new File(nombreRecurso);
        List<Pelicula>peliculas = new ArrayList();
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            while (linea != null){
                Pelicula pelicula = new Pelicula(linea);
                peliculas.add(pelicula);
                linea = entrada.readLine();
            }
            entrada.close();
            
        } catch (FileNotFoundException ex) {
           ex.printStackTrace();
           throw new LecturaDatosEx("Excepcion al listar peliculas: "+ ex.getMessage());
           
        } catch (IOException ex) {
           throw new LecturaDatosEx("Excepcion al listar peliculas: "+ ex.getMessage());
        }
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx {
    var archivo = new File(nombreRecurso);
    
    }

    @Override
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx {
    }

    @Override
    public void crear(String nombreRecurso) throws AccesoDatosEx {
    }

    @Override
    public void borrar(String nombreRecurso) throws AccesoDatosEx {
    }

}