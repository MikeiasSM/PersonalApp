/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faedocaminhoes.gui.tablemodel;

import br.com.faedocaminhoes.model.Empresa;
import br.com.faedocaminhoes.model.Usuario;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Poison
 */
public class UsuarioTableModel extends AbstractTableModel{

    private final List<Usuario> dados = new ArrayList<>();
    private final String[] colunas = {"Código",
                                      "Nome",
                                      "Dta. Cadastro", 
                                      "Usr. Cadastro"};

    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    @Override
    public int getRowCount() {
       return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linhaIndex, int colunaIndex) {
        switch(colunaIndex){
            case 0:
                return dados.get(linhaIndex).getId();
            case 1:
                return dados.get(linhaIndex).getNome();
            case 2:
                LocalDate d = dados.get(linhaIndex).getDataCad();
                DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                return d.format(df);
            case 3:
                return dados.get(linhaIndex).getUsuario().getNome();
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object valor, int linhaIndex, int coluna) {
        switch(coluna){
            case 0:
                dados.get(linhaIndex).setId((Integer) valor);
            case 1:
                dados.get(linhaIndex).setNome((String) valor);
            case 2:
                dados.get(linhaIndex).setDataCad((LocalDate) valor);
            case 3:
                dados.get(linhaIndex).setUsuario((Usuario) valor);
            }
    }
    
    public void addRow(Usuario pUser){
        this.dados.add(pUser);
        this.fireTableDataChanged();
    }
    public void removeRow(int linha){
        this.fireTableRowsDeleted(linha, linha);
    }
    
    public void removeAll(){
        this.dados.clear();
        this.fireTableDataChanged();
    }
    
    public Usuario getObject(int linha){
        Usuario user = this.dados.get(linha);
        return user;
    }
    
    public List<Usuario> getDados(int linha){
        return this.dados;
    }
    
}
