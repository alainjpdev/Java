package cpjlaboratoriofinal;

import static cpjlaboratoriofinal.ManejoArchivos.*;
import mx.com.gm.peliculas.datos.*;
import java.util.Scanner;
import mx.com.gm.peliculas.domain.Pelicula;

public class CPJLaboratorioFinal {

    public static void main(String[] args) {
        var nombreArchivo = "peliculas.txt";
//        crearArchivo(nombreArchivo);
//          anexarInfoArchivo("peliculas.txt","Batman");
//        leerArchivo(nombreArchivo);
        Scanner scanner = new Scanner(System.in);
        var menu = "Elige opcion: \n"
                + "1.- Iniciar catalogo películas\n"
                + "2.- Agregar película\n"
                + "3.- Listar Películas\n"
                + "4.- Buscar Película\n"
                + "0.- Salir";
        System.out.println(menu);
        String opcion = scanner.nextLine();

        switch (opcion) {
            case "1":
                System.out.println("Seleccionaste la opcion " + opcion);
                break;

            case "2":
                System.out.println("Introduce el nombre de la pelicula a agregar");
                String peliNueva = scanner.nextLine();
                Pelicula p1 = new Pelicula(peliNueva);
                System.out.println("p1 = " + p1.toString());
//                p1.crear(nombreArchivo, peliNueva);
                anexarInfoArchivo(nombreArchivo, p1.getNombre());
                break;

            case "3":
                System.out.println("Seleccionaste la opcion " + opcion);
                leerArchivo(nombreArchivo);
                
                
                break;

            case "4":
                System.out.println("Cual pelicula estas buscando: ");
                String opcionBuscar = scanner.nextLine();
                
                buscarPeli(nombreArchivo, opcionBuscar);
                
                break;
            case "0":
                System.out.println("Gracias por estar con nosotros adios2!!");
                break;
            default:
                System.out.println("opcion invalida");

        }
        
