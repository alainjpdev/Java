
public class Caja {
    
    int a;
    int b;
    int c;
    
    public Caja(){
        System.out.println("Constructor vacio" );
    }
    
    public Caja(int a, int b,int c){
       
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("Ejecutando constructor con argumentos");
    }
    
  
    public void calculoDeVolumen(int a,int b,int c){
        var resultado = this.a * this.b * this.c;
        System.out.println("resultado = " + resultado);
        
    }
}
