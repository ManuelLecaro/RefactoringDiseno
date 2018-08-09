/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.datac.rmovemethod;


/**
 * El siguiente c[odigo muestra el code smell de data class, la clase solo tiene
 * parametros y getters y setters para arreglar esto primero hay que realizar 
 * cambios como Move method y Extract method
 * @author MNLL
 */
public class Nodo<E> {
    private String evento;
    private double probabilidad;
    private Nodo der,izq;
    
    public Nodo(E data){
        this.evento=(String)data;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public double getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(double probabilidad) {
        this.probabilidad = probabilidad;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }
    
    /***
     * Metodo obtenido de extract method
     * @param cmp
     * @return 
     */
    public boolean esmayor(Nodo cmp){
        return this.probabilidad>cmp.probabilidad;
    }
    
}
