package cpjlaboratoriofinal;

import java.io.*;
import java.util.*;

public class ManejoArchivos {

    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void escribirArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha escrito al archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void anexarInfoArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha anexado " + contenido);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void leerArchivo(String nombreArchivo) {
        var archivo = new File(nombreArchivo);
        List<String> l = new ArrayList<>();

        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            var lectura = entrada.readLine();
            while (lectura != null) {
                l.add(lectura);
//                System.out.println("lectura = " + lectura);
                lectura = entrada.readLine();

            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        System.out.println("lista de peliculas:  " :);
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
    }

    public static void buscarPeli(String nombreArchivo, String peliBuscando) {
        var archivo = new File(nombreArchivo);
        List<String> l = new ArrayList<>();

        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            var lectura = entrada.readLine();
            while (lectura != null) {
                l.add(lectura);
//                System.out.println("lectura = " + lectura);
                lectura = entrada.readLine();

            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        
        for (int i = 0; i < l.size(); i++) {
            var peli = l.get(i);
            if (peli == peliBuscando) {
                System.out.println("Pelicula encontrada : " peliBuscando);
            } else {
                System.out.println("No encontramos esta pelicula");
            }
        }
    }
}
