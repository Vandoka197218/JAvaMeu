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
public class Aparelhos {
    int codAp;
    private String Marca;
    private String Aparelho;
    private String ModFab;
    private String Modelo;
    private String Serie;
    private String Acessorios;
    private String Aparencia;
    private String Defeito;
    
    // inicilizamos o contador inicial
    public static  int posicaoAutoIncremental = 1;
    

    public Aparelhos(String Marca, String Aparelho, String ModFab, String Modelo, String Serie,String Acessorios, String Aparencia, String Defeito) {
        
        this.codAp = posicaoAutoIncremental;
        // atulizamos o contador para o proximo objeto recebe o novo valor.
        posicaoAutoIncremental++;
        
        this.Marca = Marca;
        this.Aparelho = Aparelho;
        this.ModFab = ModFab;
        this.Modelo = Modelo;
        this.Serie = Serie;
        this.Acessorios = Acessorios;
        this.Aparencia = Aparencia;
        this.Defeito = Defeito;
    }
    
    // mostra os dadaos do objeto na tela
    
    @Override
    public String toString(){        
        String relatorio = "";
        relatorio+="Código Ap: "+codAp;
        relatorio+="\nE-Mail: "+Marca;
        relatorio+="\nNome: "+Aparelho;
        relatorio+="\nCidade: "+ModFab;
        relatorio+="\nTelefone: "+Modelo;
        relatorio+="\nCelular: "+Aparencia;
        relatorio+="\nE-Mail: "+Acessorios;
        relatorio+="\nE-Mail: "+Defeito;
        
       
        
       return relatorio;
       
    }

    public String getDefeito() {
        return Defeito;
    }

    public void setDefeito(String Defeito) {
        this.Defeito = Defeito;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getAparelho() {
        return Aparelho;
    }

    public void setAparelho(String Aparelho) {
        this.Aparelho = Aparelho;
    }

    public String getModFab() {
        return ModFab;
    }

    public void setModFab(String ModFab) {
        this.ModFab = ModFab;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getAcessorios() {
        return Acessorios;
    }

    public void setAcessorios(String Acessorios) {
        this.Acessorios = Acessorios;
    }

    public String getAparencia() {
        return Aparencia;
    }

    public void setAparencia(String Aparencia) {
        this.Aparencia = Aparencia;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String Serie) {
        this.Serie = Serie;
    }
    
    
    
    
    
    
}
