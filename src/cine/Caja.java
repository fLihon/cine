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
public class Caja extends Servicios implements EmisorDeTicket{

    @Override
    public Ticket entregarTicket(Persona p) {
        return new Ticket();
    }
    
    


    @Override
    public boolean isActivo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente despachar() {
        Cliente c;//cola.desencolar();    
        return new Cliente();
        
    }
    
    
            
}
