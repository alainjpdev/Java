
package com.gm.mundopc;



public class Raton extends DispositivoEntrada {
    private final int idRaton;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    @Override
    
    //Agrego con el ide to String pero con el super.toString ya que no lo generaba en automatico
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + super.toString()+ '}';
    }


  
    
  
    
}
