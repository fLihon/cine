/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

/**
 * @author hector
 */
public class Estadisticas {

    private String idServicio;
    private int pagosEfectivo;
    private int pagosElectronico;
    private int totalClientes;
    private int colaMaxima;
    private int colaMinima;

        
    public Estadisticas() {
        this.idServicio = "";
        this.pagosEfectivo = 0;
        this.pagosElectronico = 0;
        this.totalClientes = 0;
        this.colaMaxima = 0;
        this.colaMinima = 0;
    }
    
    public Estadisticas(String idServicio, int pagosEfectivo, int pagosElectronico, int totalClientes, int colaMaxima, int colaMinima) {
        this.idServicio = idServicio;
        this.pagosEfectivo = pagosEfectivo;
        this.pagosElectronico = pagosElectronico;
        this.totalClientes = totalClientes;
        this.colaMaxima = colaMaxima;
        this.colaMinima = colaMinima;
    }
        
    
    /**
     * @return the pagosEfectivo
     */
    public int getPagosEfectivo() {
        return pagosEfectivo;
    }

    /**
     * @param pagosEfectivo the pagosEfectivo to set
     */
    public void setPagosEfectivo(int pagosEfectivo) {
        this.pagosEfectivo = pagosEfectivo;
    }

    /**
     * @return the pagosElectronico
     */
    public int getPagosElectronico() {
        return pagosElectronico;
    }

    /**
     * @param pagosElectronico the pagosElectronico to set
     */
    public void setPagosElectronico(int pagosElectronico) {
        this.pagosElectronico = pagosElectronico;
    }

    /**
     * @return the totalClientes
     */
    public int getTotalClientes() {
        return totalClientes;
    }

    /**
     * @param totalClientes the totalClientes to set
     */
    public void setTotalClientes(int totalClientes) {
        this.totalClientes = totalClientes;
    }

    /**
     * @return the colaMaxima
     */
    public int getColaMaxima() {
        return colaMaxima;
    }

    /**
     * @param colaMaxima the colaMaxima to set
     */
    public void setColaMaxima(int colaMaxima) {
        this.colaMaxima = colaMaxima;
    }

    /**
     * @return the colaMinima
     */
    public int getColaMinima() {
        return colaMinima;
    }

    /**
     * @param colaMinima the colaMinima to set
     */
    public void setColaMinima(int colaMinima) {
        this.colaMinima = colaMinima;
    }

    public String getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    public void setTotalClientes(int totalClientes) {
        this.totalClientes = totalClientes;
    }
    
   
}
