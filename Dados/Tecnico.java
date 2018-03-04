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
public class Tecnico {
    int codTec;
    private String NomeTec;
    private String Cel;
    private String Setor;
    private double Comissao;
    private double Salario;
    private boolean ativo;

    public Tecnico(String NomeTec, String Cel, String Setor, double Comissao, double Salario, boolean ativo) {
        this.NomeTec = NomeTec;
        this.Cel = Cel;
        this.Setor = Setor;
        this.Comissao = Comissao;
        this.Salario = Salario;
        this.ativo = ativo;
    }
    
    // mostra os dadaos do objeto na tela
    
    @Override
    public String toString(){        
        String relatorio = "";
        
        relatorio+="Código CodTec: "+codTec;
        relatorio+="\nNome Tecnico: "+NomeTec;
        relatorio+="\nCOdigo Setor: "+Setor;
        relatorio+="\nValor Comissão: "+Comissao;
        relatorio+="\nValor Salario: "+Salario;
        relatorio+="\nTecnico em Sereviço: "+ativo;
        
       return relatorio;
       
    }
    

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getNomeTec() {
        return NomeTec;
    }

    public void setNomeTec(String NomeTec) {
        this.NomeTec = NomeTec;
    }

    public String getCel() {
        return Cel;
    }

    public void setCel(String Cel) {
        this.Cel = Cel;
    }

    public String getSetor() {
        return Setor;
    }

    public void setSetor(String Setor) {
        this.Setor = Setor;
    }

    public double getComissao() {
        return Comissao;
    }

    public void setComissao(double Comissao) {
        this.Comissao = Comissao;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
    
    
    
    
}
