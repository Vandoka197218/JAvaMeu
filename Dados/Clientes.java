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
public class Clientes {
 

    private int CodCli;
    private String nome;
    private String cidade;
    private String Fone;
    private String Cel;
    private String email;

    // inicilizamos o contador inicial
    public static int posicaoAutoIncremental = 1;

    public Clientes(String nome, String cidade, String Fone, String Cel, String email) {

        this.CodCli = posicaoAutoIncremental;
        // atulizamos o contador para o proximo objeto recebe o novo valor.
        posicaoAutoIncremental++;

        this.nome = nome;
        this.cidade = cidade;
        this.Fone = Fone;
        this.Cel = Cel;
        this.email = email;
    }

    

    // mostra os dadaos do objeto na tela
    @Override
    public String toString() {
        String relatorio = "";
        relatorio += "Código Cli: " + CodCli;
        relatorio += "\nNome: " + nome;
        relatorio += "\nCidade: " + cidade;
        relatorio += "\nTelefone: " + Fone;
        relatorio += "\nCelular: " + Cel;
        relatorio += "\nE-Mail: " + email;

        return relatorio;

    }
    //OPERACÕES (conhecido como Métodos)

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getFone() {
        return Fone;
    }

    public void setFone(String Fone) {
        this.Fone = Fone;
    }

    public String getCel() {
        return Cel;
    }

    public void setCel(String Cel) {
        this.Cel = Cel;
    }
    
}
