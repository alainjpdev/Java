
package clases;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona();
        persona1.nombre = "Alain";
        persona1.apellido = "Raimond";
        persona1.desplegarInformacion();
        
        Persona persona2 = new Persona();
        System.out.println(persona2);
        
    }
    
}
