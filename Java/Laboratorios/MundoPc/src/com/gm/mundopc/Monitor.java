
package com.gm.mundopc;


public class Monitor {
    private final int idMonitor;
    private String marca;
    private Double tamano;
    private static int contadorMonitores;
    
    private Monitor(){
        this.idMonitor = ++Monitor.contadorMonitores;
    }
    
    public Monitor(String marca, Double tamano){
        this();
        this.marca = marca;
        this.tamano = tamano ;      
    }

    public int getIdMonitor() {
        return this.idMonitor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getTamano() {
        return this.tamano;
    }

    public void setTamano(Double tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamano=" + tamano + '}';
    }
    
    
    
}
