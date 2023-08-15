
package com.mycompany.aviaosenac;

public class Fabrica {
    
    public static void main(String[] args) {
        
        //Construir os avioes
        AviaoSenac meuAviao1 = new AviaoSenac();
        System.out.println("Cor: " + meuAviao1.getCor() );
        
        AviaoSenac outroAviao = new AviaoSenac();
        outroAviao.setCor("vermelho");
        
        System.out.println(outroAviao.getCor());
        
        outroAviao.acelerar();
        System.out.println("Velocidade - outroaviao: " + outroAviao.getVelocidade());
    }
}
