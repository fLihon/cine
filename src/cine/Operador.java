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
public class Operador extends Servicios {
    
    public boolean autoriza(Ticket ticket){
        return true;        
    }

    @Override
    public boolean isActivo() {
        return true;
    }

    @Override
    public Cliente despachar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
