/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

/**
 *
 * @author hector
 */
public class ColaCliente {
    
    
    private int MAXIMO = 1000;
    private Persona[] vector;
    private int inicio;
    private int fin;

    public ColaCliente(Persona[] vector, int inicio, int fin) {
        this.vector = vector;
        this.inicio = inicio;
        this.fin = fin;
    }
 
    
    public boolean vacia() {
        return getInicio() == getFin();
    }

    public boolean llena() {
        return tamanio() == getMAXIMO() - 1;
    }

    public void encolar(Persona a) {
        if (llena()) {
            System.out.println("Cola Llena");
        } else {
            setFin((getFin() + 1) % getMAXIMO());
            getVector()[getFin()] = a;
            // try catch...
        }
    }

    public Persona desencolar() { // despachar
        Persona a = null;
        if (vacia()) {
            System.out.println("Cola Vacia! No se pudo eliminar.");
        } else {
            setInicio((getInicio() + 1) % getMAXIMO());
            a = getVector()[getInicio()];
        }
        return a;
    }

    public int tamanio() {
        return (getFin() - getInicio() + getMAXIMO()) % getMAXIMO();
    }

    /**
     * @return the MAXIMO
     */
    public int getMAXIMO() {
        return MAXIMO;
    }

    /**
     * @param MAXIMO the MAXIMO to set
     */
    public void setMAXIMO(int MAXIMO) {
        this.MAXIMO = MAXIMO;
    }

    /**
     * @return the vector
     */
    public Persona[] getVector() {
        return vector;
    }

    /**
     * @param vector the vector to set
     */
    public void setVector(Persona[] vector) {
        this.vector = vector;
    }

    /**
     * @return the inicio
     */
    public int getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the fin
     */
    public int getFin() {
        return fin;
    }

    /**
     * @param fin the fin to set
     */
    public void setFin(int fin) {
        this.fin = fin;
    }
  
    
}
