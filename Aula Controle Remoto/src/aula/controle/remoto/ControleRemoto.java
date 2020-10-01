/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.controle.remoto;

/**
 *
 * @author PORTOMASTER
 */
public class ControleRemoto implements Controlador {
    //ATRIBUTOS
    private int volume;
    private boolean ligado;
    private boolean tocando;
   
//MÉTODO CONSTRUTOR
    public void ControleRemoto(){
        volume = 50;
        ligado = true;
        tocando = false;
    }
    //MÉTODOS ESPECIAIS
    public int getVolume(){
        return this.volume;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    public boolean getLigado(){
        return this.ligado;
    }
    public void setLigado(boolean ligado){
        this.ligado = true;
    }
    public boolean getTocando(){
        return this.tocando;
    }
    public void setTocando(boolean tocando){
        this.tocando = false;
    }
    //MÉTODOS ABSTRATOS

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0; i<= this.getVolume(); i+=10){
            System.out.println("|");
        }
        
        
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu... ");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) 
            this.setVolume(this.getVolume()+ 5);
                
    }

    @Override
    public void menosVolume() {
        if (this.getLigado())
            this.setVolume(this.getVolume() -5);
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
            
        
    }

    @Override
    public void descligarMudo() {
        if (this.getLigado() && this.getVolume() ==0){
            this.setVolume(50);
            
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado()&& this.getTocando()){
            this.setTocando(false);
        }
    }
    
}


