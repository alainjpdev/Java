
package test;

import domain.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("camisa", 50.00);
        Producto producto2 = new Producto("pantalon", 100.00);
        Producto producto3 = new Producto("pantalon", 100.00);
        
        
        Order order1 = new Order();
        order1.agregarProductos(producto1);
        order1.agregarProductos(producto2);
        order1.agregarProductos(producto3);

        order1.mostrarOrden();
        

    }
    
    
}
