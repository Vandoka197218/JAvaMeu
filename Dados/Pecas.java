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
public class Pecas {
    int codPeca;
    private String descricao;
    private String codFab;
    private int quant;
    private double valorFab;
    private double valorVendFab;
    private double Venda;
    
     // inicilizamos o contador inicial
    public static  int posicaoAutoIncremental = 1;

    public Pecas(String descricao, String codFab, int quant, double valorFab, double valorVendFab, double Venda) {
        
        this.descricao = descricao;
        this.codFab = codFab;
        this.quant = quant;
        this.valorFab = valorFab;
        this.valorVendFab = valorVendFab;
        this.Venda = Venda;
        
    }
        // this.codPeca = posicaoAutoIncremental;
        // atulizamos o contador para o proximo objeto recebe o novo valor.
      //  posicaoAutoIncremental++;

    public Pecas(String Desc, int codFab, int qtd, double pvV, double pvV0, double pvV1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Pecas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
    // mostra os dadaos do objeto na tela
    
    @Override
    public String toString(){        
        String relatorio = "";
        relatorio+="Código Peça: "+codPeca;
        relatorio+="\nDescrição: "+descricao;
        relatorio+="\nQuantidade: "+quant;
        relatorio+="\nCodFabrica: "+codFab;
        relatorio+="\nValor de FabicaTelefone: "+valorFab;
        relatorio+="\nValor Venda: "+Venda;
        
       
        
       return relatorio;
       
    }

    public double getVenda() {
        return Venda;
    }

    public void setVenda(double Venda) {
        this.Venda = Venda;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodFab() {
        return codFab;
    }

    public void setCodFab(String codFab) {
        this.codFab = codFab;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public double getValorFab() {
        return valorFab;
    }

    public void setValorFab(double valorFab) {
        this.valorFab = valorFab;
    }

    public double getValorVendFab() {
        return valorVendFab;
    }

    public void setValorVendFab(double valorVendFab) {
        this.valorVendFab = valorVendFab;
    }
    
    
}
