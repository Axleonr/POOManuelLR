/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2comput;

/**
 *
 * @author Alumno 4
 */
public class Computadora {
    
   private String marca;
   private String procesador;
   private String sistemaOperativo;
   private int noDeVentiladores;
   private int cantidadDeRam;
   private String numeroDeSerie;
   private int elementosEntrada;
   private boolean portatil;

    public Computadora() {
    }

    public Computadora(String marca, String procesador, String sistemaOperativo, int noDeVentiladores, int cantidadDeRam, String numeroDeSerie, int elementosEntrada, boolean portatil) {
        this.marca = marca;
        this.procesador = procesador;
        this.sistemaOperativo = sistemaOperativo;
        this.noDeVentiladores = noDeVentiladores;
        this.cantidadDeRam = cantidadDeRam;
        this.numeroDeSerie = numeroDeSerie;
        this.elementosEntrada = elementosEntrada;
        this.portatil = portatil;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getNoDeVentiladores() {
        return noDeVentiladores;
    }

    public void setNoDeVentiladores(int noDeVentiladores) {
        this.noDeVentiladores = noDeVentiladores;
    }

    public int getCantidadDeRam() {
        return cantidadDeRam;
    }

    public void setCantidadDeRam(int cantidadDeRam) {
        this.cantidadDeRam = cantidadDeRam;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public int getElementosEntrada() {
        return elementosEntrada;
    }

    public void setElementosEntrada(int elementosEntrada) {
        this.elementosEntrada = elementosEntrada;
    }

    public boolean isPortatil() {
        return portatil;
    }

    public void setPortatil(boolean portatil) {
        this.portatil = portatil;
    }
   
    public void procesarInformacion(){
        //I have no idea what i'm doing.
    }
   
    public void actualizarSistema(){
        //I have a slight idea of what i'm doing.
    }
    
    public void mostrarResultados(){
        //Nevermind, lost again.
    }
   
    public void apagar(){
        //Okay, i think i got it. I still could use to learn the shortcuts though.
    }
    
    public void encenderPc(){
    //Wait, is this the right modifier? Guess we haven't learned about that yet.
    }
}
