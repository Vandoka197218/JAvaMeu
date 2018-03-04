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
public class Pec {
    private String descricao;
    private String codFab;
    private int quant;
    private double valorFab;
    private double valorVendFab;
    private double Venda;
    private int codCli;
    private String Tecnico;
    private int codTec;
    private String Cliente;

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the codFab
     */
    public String getCodFab() {
        return codFab;
    }

    /**
     * @param codFab the codFab to set
     */
    public void setCodFab(String codFab) {
        this.codFab = codFab;
    }

    /**
     * @return the quant
     */
    public int getQuant() {
        return quant;
    }

    /**
     * @param quant the quant to set
     */
    public void setQuant(int quant) {
        this.quant = quant;
    }

    /**
     * @return the valorFab
     */
    public double getValorFab() {
        return valorFab;
    }

    /**
     * @param valorFab the valorFab to set
     */
    public void setValorFab(double valorFab) {
        this.valorFab = valorFab;
    }

    /**
     * @return the valorVendFab
     */
    public double getValorVendFab() {
        return valorVendFab;
    }

    /**
     * @param valorVendFab the valorVendFab to set
     */
    public void setValorVendFab(double valorVendFab) {
        this.valorVendFab = valorVendFab;
    }

    /**
     * @return the Venda
     */
    public double getVenda() {
        return Venda;
    }

    /**
     * @param Venda the Venda to set
     */
    public void setVenda(double Venda) {
        this.Venda = Venda;
    }

    /**
     * @return the codCli
     */
    public int getCodCli() {
        //System.out.println("Codigo Cliente: "+codCli);
        return codCli;
    }

    /**
     * @param codCli the codCli to set
     */
    public void setCodCli(int codCli) {
        this.codCli = codCli;
        
    }

    /**
     * @return the Tecnico
     */
    public String getTecnico() {
         return Tecnico;
    }

    /**
     * @param Tecnico the Tecnico to set
     */
    public void setTecnico(String Tecnico) {
        this.Tecnico = Tecnico;
    }

    /**
     * @return the codTec
     */
    public int getCodTec() {
        //System.out.println("Codigo Cliente: "+codTec);
        return codTec;
    }

    /**
     * @param codTec the codTec to set
     */
    public void setCodTec(int codTec) {
        this.codTec = codTec;
    }

    /**
     * @return the Cliente
     */
    public String getCliente() {
        return Cliente;
    }

    /**
     * @param Cliente the Cliente to set
     */
    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }
    
    
}
