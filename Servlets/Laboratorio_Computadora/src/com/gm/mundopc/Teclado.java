package com.gm.mundopc;

public class Teclado extends DispositivoEntrada {

 private int idTeclado;
 private static int contadorTeclado;

    public Teclado() {
        
    }

    public Teclado(String tipoEntrada, String marca){
        super(marca,tipoEntrada);
        this.idTeclado = ++Teclado.contadorTeclado;
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
        
    }
    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + " " +super.toString()'}';
    }

 
}
