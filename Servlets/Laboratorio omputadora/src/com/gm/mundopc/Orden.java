package com.gm.mundopc;

public class Orden {

    private final int idOrden;
    private Computadora computadoras[];
    public static int contadorComputadoras;
    public static int contadorOrdenes;
    public static final int MAXCOMPUTADORAS ;
    private int contadorComputadoras;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras[ ]= new Computadora[Orden.MAXCOMPUTADORAS];
    }


    public void agregarComputadora(Computadora computadora) {

    }

    public void mostrarOrden() {

    }
}
