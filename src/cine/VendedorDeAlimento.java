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

    int counter; // para decidir inactividad
    boolean activo;

    public VendedorDeAlimento(int counter) {
        this.counter = 10;  //a tiende 10 clientes y despues se cierra
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
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
    
    @Override
    public void encolar(Cliente c){
        super.encolar(c);
    }
    
    @Override
    public boolean isActivo() {
        return this.activo;        
    }
    

}