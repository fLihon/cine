/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.util.Random;

/**
 *
 * @author hector
 */
public class Cliente extends Persona{
    
    private String tipoDePago;    // WEB o EFECTIVO
    
    private boolean VaAl_ATM;
    private boolean VaAl_Alimentos;    
    private boolean VaAl_Operador=true;
    private boolean haEntrado;
    
    
    
    public Cliente(){
        
        // RANDOM del ATM
        if (new Random().nextInt()%2==0){
            VaAl_ATM= true;            
        }else{
            VaAl_ATM= false;
        }
        
        // RAMDO del Alimento
        if (new Random().nextInt()%2==0){
            VaAl_Alimentos= true;            
        }else{
            VaAl_Alimentos= false;
        }
        
        // RAMDO del tipo de pago
        if (new Random().nextInt()%2==0){
            tipoDePago = "WEB";            
        }else{
            tipoDePago = "EFECTIVO";
        }
        
        haEntrado = false;
    }

    /**
     * @return the tipoDePago
     */
    public String getTipoDePago() {
        return tipoDePago;
    }

    /**
     * @param tipoDePago the tipoDePago to set
     */
    public void setTipoDePago(String tipoDePago) {
        this.tipoDePago = tipoDePago;
    }

    /**
     * @return the VaAl_ATM
     */
    public boolean isVaAl_ATM() {
        return VaAl_ATM;
    }

    /**
     * @param VaAl_ATM the VaAl_ATM to set
     */
    public void setVaAl_ATM(boolean VaAl_ATM) {
        this.VaAl_ATM = VaAl_ATM;
    }

    /**
     * @return the VaAl_Alimentos
     */
    public boolean isVaAl_Alimentos() {
        return VaAl_Alimentos;
    }

    /**
     * @param VaAl_Alimentos the VaAl_Alimentos to set
     */
    public void setVaAl_Alimentos(boolean VaAl_Alimentos) {
        this.VaAl_Alimentos = VaAl_Alimentos;
    }

    /**
     * @return the VaAl_Operador
     */
    public boolean isVaAl_Operador() {
        return VaAl_Operador;
    }

    /**
     * @param VaAl_Operador the VaAl_Operador to set
     */
    public void setVaAl_Operador(boolean VaAl_Operador) {
        this.VaAl_Operador = VaAl_Operador;
    }

    public boolean isHaEntrado() {
        return haEntrado;
    }

    public void setHaEntrado(boolean haEntrado) {
        this.haEntrado = haEntrado;
    }
    
    
}
