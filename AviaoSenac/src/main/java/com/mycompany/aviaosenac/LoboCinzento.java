package com.mycompany.aviaosenac;

public class LoboCinzento {
    
    //Atributos
    static String tamanho = "A101";
    private String cor;
    int velocidade;
    static String alimentacao;
    
    //Construtores
    public LoboCinzento() {
        //Construtor Vazio 
    }
    
    public LoboCinzento(String cor, int velocidade) {
        this.cor = cor;
        this.velocidade = velocidade;
    }       
    
    //Métodos Acessores e Modificadores
    public static String getTamanho() {
        return tamanho;
    }

    public static void setTamanho(String tamanho) {
        LoboCinzento.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public static String getAlimentacao() {
        return alimentacao;
    }

    public static void setAlimentacao(String alimentacao) {
        LoboCinzento.alimentacao = alimentacao;
    }
    
    
    
}
