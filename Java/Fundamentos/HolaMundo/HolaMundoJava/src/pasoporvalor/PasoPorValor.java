package pasoporvalor;



public class PasoPorValor {
    public static void main(String[] args) {
        var x =10;
        System.out.println("x = " + x);
        
        x = cambioValor(x);
        System.out.println("x = " + x);
    }

    public static int cambioValor(int arg1) {
        return arg1 = 15;
    }
}
