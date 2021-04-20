
public class TestMatrices {

    public static void main(String[] args) {
        String frutas[][] = {{"naranja", "limon"}, {"fresa", "zarzamora"}, {"melon", "sandia"}};
        for (int ren = 0; ren < frutas.length; ren++) {
            for (int col = 0; col < frutas[ren].length; col++) {
//                System.out.println("frutas" + ren + "-" + col + ":" + frutas[ren][col]);
            }
        }
     imprimir(frutas);    

    }

    public static void imprimir(Object matriz[][]) {
        for (int ren = 0; ren < matriz.length; ren++) {
            for (int col = 0; col < matriz[ren].length; col++) {
                System.out.println("frutas" + ren + "-" + col + ":" + matriz[ren][col]);
            }
        }

    }
}
