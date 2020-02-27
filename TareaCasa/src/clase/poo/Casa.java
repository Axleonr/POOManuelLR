/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.poo;

import compcasa.poo.Calentador;
import compcasa.poo.Puerta;
import compcasa.poo.Ventana;

/**
 *
 * @author SPV-AUX-ADRIAN
 */
public class Casa {
    private Calentador calent=new Calentador();
    private Ventana vent1;
    private Ventana vent2;
    private Puerta puerta;
    private int pisos;

    public Casa() {
    }

    public Casa(Ventana vent1, Ventana vent2, Puerta puerta, int pisos) {
        this.vent1 = vent1;
        this.vent2 = vent2;
        this.puerta = puerta;
        this.pisos = pisos;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public Calentador getCalent() {
        return calent;
    }

    public void setCalent(Calentador calent) {
        this.calent = calent;
    }

    public Ventana getVent1() {
        return vent1;
    }

    public void setVent1(Ventana vent1) {
        this.vent1 = vent1;
    }

    public Ventana getVent2() {
        return vent2;
    }

    public void setVent2(Ventana vent2) {
        this.vent2 = vent2;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }
    
    public void derrumbar(){
        System.out.println("Casa destruida");
    }
    
    public void construirPiso(){
        System.out.println("Piso extra");
    }
    
}
