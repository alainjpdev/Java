
//Mi clase en Java
public class HolaMundo {

    public static void main(String args[]) {
        var mes = 1;
        var estacion = "Estacion desconocida";

        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        } 
        else if(mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
        }
        System.out.println(estacion);

    }
}
