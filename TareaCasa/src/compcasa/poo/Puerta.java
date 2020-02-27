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
public class Puerta {
    private Boolean abierta;
    private Boolean conLlave;
    private int altura;

    public Puerta() {
    }

    public Puerta(Boolean abierta, Boolean conLlave, int altura) {
        this.abierta = abierta;
        this.conLlave = conLlave;
        this.altura = altura;
    }

    public Boolean getAbierta() {
        return abierta;
    }

    public void setAbierta(Boolean abierta) {
        this.abierta = abierta;
    }

    public Boolean getConLlave() {
        return conLlave;
    }

    public void setConLlave(Boolean conLlave) {
        this.conLlave = conLlave;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void abrir(){
        setAbierta(true);
    }
    
    public void cerrar(){
        setAbierta(false);
    }
            
}
