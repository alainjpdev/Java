package test;

import com.gm.mundopc.Computadora;
import com.gm.mundopc.Raton;
import com.gm.mundopc.Teclado;

public class TestComputadora {

    public static void main(String[] args) {
        Raton r1 = new Raton("usb", "samsung");
        System.out.println( r1);

        Teclado t1 = new Teclado("blutooth", "lg");
        System.out.println(t1);
        
        Computadora c1 = new Computadora("HP", r1, t1);
        System.out.println("c1 = " + c1);
        
    }

}
