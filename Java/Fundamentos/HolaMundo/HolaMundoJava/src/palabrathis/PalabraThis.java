
package palabrathis;


public class PalabraThis {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", "Perez");
        System.out.println("persona1 = " + persona1);
        System.out.println("persona1 nombre : " + persona1.nombre);
        System.out.println("persona1 apellido : " + persona1.apellido);
    
    }
    
}

class Persona{
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        new Imprimir().imprimir(this);
    }
}
class Imprimir{
    public void imprimir(Persona persona){
        System.out.println("persona desde imprimir = " + persona);
        System.out.println("impresion de objeto actual  = " + this );
    }
}
