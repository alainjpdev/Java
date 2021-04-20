
package com.gm.mundopc;


public class Orden {
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private final static int MAX_COMPUTADORAS= 10;
    
    
    public Orden (){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[MAX_COMPUTADORAS];
    }
    
    public void agregarComputadoras(Computadora computadora){
        if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS){
            this.computadoras[this.contadorComputadoras++]= computadora;         
        }
        else{
            System.out.println("Se han agregado el max de computadoras permitido = " + MAX_COMPUTADORAS);
        }
    }
    public void mostrarOrden(){
        System.out.println("Orden id  = " + this.idOrden );
        System.out.println("Computadoras de la orden #:"+this.idOrden );
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
    }

  
}
