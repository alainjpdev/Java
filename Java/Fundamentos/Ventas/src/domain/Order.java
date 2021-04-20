package domain;

public class Order {

    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private final static int MAX_PRODUCTOS = 10;

    public Order() {
        //super();
        this.idOrden = ++Order.contadorOrdenes;
        this.productos = new Producto[Order.MAX_PRODUCTOS];

    }

    public void agregarProductos(Producto producto) {
        if (this.contadorProductos < Order.MAX_PRODUCTOS) {
            this.productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado el maximo de productos  = " + Order.MAX_PRODUCTOS);

        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
//             Producto producto = this.productos[i];
//            total += producto.getPrecio();
            total += this.productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("Orden id :" + this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("Total orden: $ " + totalOrden);
        System.out.println("Productos de la orden ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);

        }

    }

}
