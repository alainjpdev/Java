package com.gm.mundopc;

public class Computadora {

    protected String nombre;
    private int idComputadora;
    private static int contadorComputadoras;
    private Teclado teclado;
    private Raton raton;

    public Computadora() {

        this.idComputadora = ++Computadora.contadorComputadoras;
    }

    public Computadora(String nombre, Raton raton, Teclado teclado) {
        this();
        this.nombre = nombre;
        this.raton = raton;
        this.teclado = teclado;
        

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public void setIdComputadora(int idComputadora) {
        this.idComputadora = idComputadora;
    }

    public static int getContadorComputadoras() {
        return contadorComputadoras;
    }

    public static void setContadorComputadoras(int contadorComputadoras) {
        Computadora.contadorComputadoras = contadorComputadoras;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computadora{" + "nombre=" + nombre + ", idComputadora=" + idComputadora + ", teclado=" + teclado + ", raton=" + raton + '}';
    }



}
