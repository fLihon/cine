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

    @Override
    public boolean isActivo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente despachar() {
       if (cola.tamanio()==0){
            return null;
        }
        
        Cliente c=desencolar();
        c.setVaAl_Alimentos(false);
        return c;
    }
    
}
