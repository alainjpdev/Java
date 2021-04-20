
package com.gm.mundopc;

public class DispositivoEntrada {
    
   protected String tipoEntrada;
   protected String marca;
   
   public DispositivoEntrada(){
       
   }

    public DispositivoEntrada(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DispositivoEntrada{" + "tipoEntrada=" + tipoEntrada + ", marca=" + marca + '}';
    }


    
    
    
}
