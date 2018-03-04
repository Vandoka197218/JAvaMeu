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
public class OrdemServiço extends AbstractTableModel {

    private List<Servic> dados = new ArrayList<>();// lista
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
                return dados.get(linha).getDesc();
            case 1:
                return dados.get(linha).getQuantS();
            case 2:
                return dados.get(linha).getValor();

        }
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {

        switch (coluna) {
            case 0:
                dados.get(linha).setDesc((String) valor);
            case 1:
                dados.get(linha).setQuantS(Integer.parseInt((String) valor));
            case 2:
                dados.get(linha).setValor(Double.parseDouble((String) valor));

        }

        this.fireTableRowsUpdated(linha, linha);
    }

    // cria entrada na tabela
    public void addRow(Servic se) {
        this.dados.add(se);
        this.fireTableDataChanged();// atuliza dados da tabela

    }

    // deletar Dados por Linha
    public void removeRow(int linha) {

        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);// especifico para remover e atulizar linhas

    }
  

    
    
}
