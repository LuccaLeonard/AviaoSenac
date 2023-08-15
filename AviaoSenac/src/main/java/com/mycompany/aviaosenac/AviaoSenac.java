package com.mycompany.aviaosenac;

public class AviaoSenac {
    
    //Atributos
    static String marca = "A101";
    private String cor;
    int velocidade;
    double altitude;
    boolean ligado = false;
    
    //Construtores
    public AviaoSenac() {
        this.cor = "Branca";
    }
            
    //Ações = Métodos
    public boolean ligar(){
        this.ligado = true;
        
        return ligado;
    }
    
    public int acelerar() {
        this.velocidade+=50;
        
        return velocidade;
    }
    
    public int acelerar (int novaVelocidade){
        this.velocidade += novaVelocidade;
        
        return velocidade;
    }
    
    //Métodos Acessores e Modificadores
    public void setCor(String novaCor) {
        this.cor = novaCor.toUpperCase();
    }
    
    public String getCor() {
        return this.cor.toUpperCase();
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    
}
