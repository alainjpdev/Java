
public class PruebaCaja {
    public static void main(String[] args) {
         Caja caja1 = new Caja();
         System.out.println("caja ancho: " + caja1.ancho);
         System.out.println("caja profundo: " + caja1.profundo);
         System.out.println("caja alto: " + caja1.alto);
         
         Caja caja2 = new Caja(5, 3, 2);
         caja2.calcularVolumen();
    }

   

}
