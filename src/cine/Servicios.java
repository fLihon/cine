/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;
import java.util.Vector;

/**
 *
 * @author hector
 */
public abstract class Servicios {
    
    protected ColaCliente cola;// todo servicio tiene una cola de clientes
    public Estadisticas estadistica;    
    public abstract boolean isActivo();    
    public abstract Cliente despachar();
    
    
    public void encolar(Cliente c){
        cola.encolar(c);
    }
    
    public Cliente desencolar(){                
        return (Cliente)cola.despachar();
    }
    
    public int getTamCola(){
        return cola.getFin();
    }

    public ColaCliente getCola() {
        return cola;
    }

    public void setCola(ColaCliente cola) {
        this.cola = cola;
    }

    public Estadisticas getEstadistica() {
        return estadistica;
    }

    public void setEstadistica(Estadisticas estadistica) {
        this.estadistica = estadistica;
    }

    public Cliente[] getVector() {
        return this.getVector();
    }

}
