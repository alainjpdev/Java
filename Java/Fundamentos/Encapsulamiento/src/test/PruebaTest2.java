
package test;

import dominio.Persona;
public class PruebaTest2 {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Alain", 1000000, true);
        System.out.println("persona1 = " + persona1.getNombre());
        persona1.setNombre("Chucho");
        System.out.println("persona1 = " + persona1.getNombre());
        persona1.setEliminado(false);
        System.out.println("persona1 = " + persona1.isEliminado());
        System.out.println("persona1 = " + persona1.getSueldo());
        persona1.setSueldo(30000000);
        System.out.println("persona1 = " + persona1.getSueldo());
    }
    
}
