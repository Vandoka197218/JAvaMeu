/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

/**
 *
 * @author Administrador
 */
public class Servicos {
    private int codServ;
    private String Desc;
    private int QuantS;
    private String Setor;
    private double Valor;
    
    // inicilizamos o contador inicial
    public static int posicaoAutoIncremental = 1;

    public Servicos(String Desc, int Quants, String Setor, double Valor) {
        
        this.codServ = posicaoAutoIncremental;
        // atulizamos o contador para o proximo objeto recebe o novo valor.
        posicaoAutoIncremental++;
        
        this.Desc = Desc;
        this.QuantS = Quants;
        this.Setor = Setor;
        this.Valor = Valor;
    }
    // mostra os dadaos do objeto na tela
    
     @Override
    public String toString(){
        String relatorio = "";
        relatorio += "Código Serviço: " +codServ;
        relatorio+="\nQuantidade: "+Desc;
        relatorio+="\nSetor: "+Setor;
        relatorio+="\nValor Serviço: "+Valor;
        
        
       return relatorio;
       
    }
    //OPERACÕES (conhecido como Métodos)

    public int getQuantS() {
        return QuantS;
    }

    public void setQuantS(int QuantS) {
        this.QuantS = QuantS;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public String getSetor() {
        return Setor;
    }

    public void setSetor(String Setor) {
        this.Setor = Setor;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }
    
    
    
}
