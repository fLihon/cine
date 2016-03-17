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
    

    private Cliente[] vector;
    private int fin;
    
    public ColaCliente(Cliente[] vector, int fin) {
        this.vector = vector;        
        this.fin = 0;
        this.vector[0] = null;
        
    }
    
    public Cliente proximoCliente(){
        return this.vector[0];
    }
    
    public void encolar(Cliente a) {

            setFin(this.getFin()+1);
            this.vector[getFin()] = a;
            // try catch...
        }

    public Cliente despachar() { // recibe una cola
        Cliente a = this.vector[0]; // la primera persona de la cola
        Cliente aux = null;
        
        if (vacia()) {
            System.out.println("Cola Vacia! No se pudo eliminar.");
        } else { 
            
            for (int i= 0; i<= this.getFin() ; i++){ // rueda la cola
                
                aux= this.vector[i++];
                this.vector[i]= aux;                
            }
            
            setFin(getFin()+1);
        }
        return a;
    }
    
    
    public boolean vacia() {
        return (getFin()== 0);
    }

    public boolean llena() {
        return (!(getFin()== 0));
    }
    
    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }
  
    
}
