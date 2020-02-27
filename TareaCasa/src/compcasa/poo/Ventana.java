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
public class Ventana {
  private Boolean traslucida;
  private int altura;
  private int ancho;
  
  public Ventana(){
  }
  
  public Ventana(Boolean traslucida, int altura, int ancho){
    this.traslucida = traslucida;
    this.altura = altura;
    this.ancho = ancho;
  }
  
  public Boolean getTraslucida(){
    return traslucida;
  }
  
  public void setTraslucida(Boolean traslucida){
    this.traslucida = traslucida;
  }
    
  public int getAltura(){
    return altura;
  }
  
  public void setAltura(int altura){
    this.altura = altura;
  }
  
    public int getAncho(){
    return ancho;
  }
  
  public void setAncho(int ancho){
    this.ancho = ancho;
  }
  
  public void abrir(){
    System.out.println("Ventana abierta");
  }
  
  public void cerrar(){
    System.out.println("Ventana cerrada");
  }
  
}
