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
    protected ColaCliente cola;
    public Estadisticas estadistica;    
    public abstract boolean isActivo();    
    public abstract Cliente despachar();
    
    public void encolar(Cliente c){                
        cola.encolar(c);
    }
    
    public Cliente desencolar(){                
        return (Cliente)cola.desencolar();
    }
    
    public int getTamCola(){
        return cola.tamanio();
    }
}
