/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compcasa.poo;

/**
 *
 * @author SPV-AUX-ADRIAN
 */
public class Calentador {
    
   private int litrosDeAgua;
   private float temperaturaDelAgua;
   private float eficienciaEnergetica;
   private Boolean suministroDeGas;

    public Calentador() {
    }

    public Calentador(int litrosDeAgua, float temperaturaDelAgua, float eficienciaEnergetica, Boolean suministroDeGas) {
        this.litrosDeAgua = litrosDeAgua;
        this.temperaturaDelAgua = temperaturaDelAgua;
        this.eficienciaEnergetica = eficienciaEnergetica;
        this.suministroDeGas = suministroDeGas;
    }

    public int getLitrosDeAgua() {
        return litrosDeAgua;
    }

    public void setLitrosDeAgua(int litrosDeAgua) {
        this.litrosDeAgua = litrosDeAgua;
    }

    public float getTemperaturaDelAgua() {
        return temperaturaDelAgua;
    }

    public void setTemperaturaDelAgua(float temperaturaDelAgua) {
        this.temperaturaDelAgua = temperaturaDelAgua;
    }

    public float getEficienciaEnergetica() {
        return eficienciaEnergetica;
    }

    public void setEficienciaEnergetica(float eficienciaEnergetica) {
        this.eficienciaEnergetica = eficienciaEnergetica;
    }

    public Boolean getSuministroDeGas() {
        return suministroDeGas;
    }

    public void setSuministroDeGas(Boolean suministroDeGas) {
        this.suministroDeGas = suministroDeGas;
    }
   
   public void calentarAgua(){
       System.out.println("Calentando agua");
   }
   
   public void abrirPaso(){
       System.out.println("Abriendo el paso");
   }
    
}
