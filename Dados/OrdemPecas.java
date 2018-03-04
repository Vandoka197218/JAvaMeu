/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Administrador
 */
public class OrdemPecas extends AbstractTableModel{
    
    private List<Pec> dados = new ArrayList<>();// lista
    private String[] colunas = {"Descrição ", "QTD", "Valor"};// colunas

    // pecas
    @Override// da o nome as colunas
    public String getColumnName(int column) {
        return colunas[column]; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getRowCount() {

        return dados.size();// quantidade de dadaos

    }

    @Override
    public int getColumnCount() {

        return colunas.length;// quantidade de colunas

    }

    @Override
    public Object getValueAt(int linha, int coluna) {// logica para pegar dados das colunas

        switch (coluna) {
            case 0:
                return dados.get(linha).getDescricao();
            case 1:
                return dados.get(linha).getQuant();
            case 2:
                return dados.get(linha).getVenda();

        }
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {

        switch (coluna) {
            case 0:
                dados.get(linha).setDescricao((String) valor);
                break;
            case 1:
                dados.get(linha).setQuant(Integer.parseInt((String) valor));
                break;
            case 2:
                dados.get(linha).setVenda(Double.parseDouble((String) valor));
                break;

        }

        this.fireTableRowsUpdated(linha, linha);
    }

    // cria entrada na tabela
    public void addRow(Pec p) {
        this.dados.add(p);
        this.fireTableDataChanged();// atuliza dados da tabela

    }

    // deletar Dados por Linha
    public void removeRow(int linha) {

        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);// especifico para remover e atulizar linhas

    }
    
}
