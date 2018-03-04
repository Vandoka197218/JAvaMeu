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
public class DadosEmail {
    private String Email;
    private String senha;
    private String Destinatario;
    private String Remetente;
    private String Assunto;
    private String Mensagem;
    public String Caminho;
    private Object anexo;

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the Destinatario
     */
    public String getDestinatario() {
        return Destinatario;
    }

    /**
     * @param Destinatario the Destinatario to set
     */
    public void setDestinatario(String Destinatario) {
        this.Destinatario = Destinatario;
    }

    /**
     * @return the Remetente
     */
    public String getRemetente() {
        return Remetente;
    }

    /**
     * @param Remetente the Remetente to set
     */
    public void setRemetente(String Remetente) {
        this.Remetente = Remetente;
    }

    /**
     * @return the Assunto
     */
    public String getAssunto() {
        return Assunto;
    }

    /**
     * @param Assunto the Assunto to set
     */
    public void setAssunto(String Assunto) {
        this.Assunto = Assunto;
    }

    /**
     * @return the Mensagem
     */
    public String getMensagem() {
        return Mensagem;
    }

    /**
     * @param Mensagem the Mensagem to set
     */
    public void setMensagem(String Mensagem) {
        this.Mensagem = Mensagem;
    }

    /**
     * @return the Caminho
     */
    public String getCaminho() {
        return Caminho;
    }

    /**
     * @param Caminho the Caminho to set
     */
    public void setCaminho(String Caminho) {
        this.Caminho = Caminho;
    }

    /**
     * @return the anexo
     */
    public Object getAnexo() {
        return anexo;
    }

    /**
     * @param anexo the anexo to set
     */
    public void setAnexo(Object anexo) {
        this.anexo = anexo;
    }
    
    
}
