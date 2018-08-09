/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.dataclass;

/**
 * El siguiente c[odigo muestra el code smell de data class, la clase solo tiene
 * parametros y getters y setters para arreglar esto primero hay que realizar 
 * cambios como Move method y Extract method, ademas si los atributos son publicos
 * usar encapsulate fields
 * @author MNLL
 */
public class Nodo<E> {
    public String evento;
    public double probabilidad;
    public Nodo der,izq;
    
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
    
    
    
}
