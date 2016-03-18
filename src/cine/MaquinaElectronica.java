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
public class MaquinaElectronica extends  Servicios implements EmisorDeTicket{

    
        public MaquinaElectronica() {
    }
    
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        return super.getVector();
    }
  
    
}
