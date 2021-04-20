
package mundopc;



import com.gm.mundopc.*;

public class MundoPc {
    public static void main(String[] args) {
        Raton r1 = new Raton("usb", "Chick");
        Teclado t1 = new Teclado("Infrarojo", "Delta");
        Monitor m1 = new Monitor("YOO", 20.0);
        
        Computadora compu1 = new Computadora("La buena", m1, t1, r1);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadoras(compu1);
        
        
        orden1.mostrarOrden();
    }
}
