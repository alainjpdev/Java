
public class Caja {

    int ancho;
    int profundo;
    int alto;

    public Caja() {
        System.out.println("Ejecutando constructor vacio");
    }

    public Caja(int ancho, int profundo, int alto) {
        this.ancho = ancho;
        this.profundo = profundo;
        this.alto = alto;

        System.out.println("Ejecutando constructor con argumentos");
    }

    public void calcularVolumen() {
        int resultado = this.ancho * this.alto * this.profundo;
        System.out.println("El volumen de la caja es = " + resultado);
    }

}
