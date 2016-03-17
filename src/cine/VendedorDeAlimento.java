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
public class VendedorDeAlimento extends Servicios{

    int counterCliente; // para decidir inactividad
    Cliente[] vectorAlimentos;
    int fin = 0;

    
    @Override
    public void encolar(Cliente c){
        
        setFin(this.getFin()+1); //incrementa el final en +1
        this.vectorAlimentos[getFin()] = a; //agrega al cliente al final de la cola
        
        estadistica.setColaMaxima(getFin()); // guardando estadisticas
        estadistica.setTotalClientes(counterCliente);
        // try catch...
    }
    
    @Override
    public boolean isActivo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Cliente despachar() {
       
        }

    public int getCounterCliente() {
        return counterCliente;
    }

    public void setCounterCliente(int counterCliente) {
        this.counterCliente = counterCliente;
    }

    public Cliente[] getVectorAlimentos() {
        return vectorAlimentos;
    }

    public void setVectorAlimentos(Cliente[] vectorAlimentos) {
        this.vectorAlimentos = vectorAlimentos;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
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
        
    

    
}
