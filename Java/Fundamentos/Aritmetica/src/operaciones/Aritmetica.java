package operaciones;

public class Aritmetica {
        //atributos de la clase
    int a;
    int b;
    
    public Aritmetica() {
            System.out.println("Ejecutando constructor");
    }
    
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con argumentos");
    }
    
    //metodo
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    } 
    public int sumarConRetorno(){
        int resultado = this.a + this.b;
        return resultado;
    }
    public int sumarConArgumentos(int a, int b){
        this.a = a;
        this.b = b;
        return this.sumarConRetorno();
    }
}
