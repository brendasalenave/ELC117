/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmorpg;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Personagem;
/**
 *
 * @author Brenda
 */
public class Tabela extends AbstractTableModel{
        private static final String[] columnNames = {"Jogador","Personagem","Raça","Classe","Profissão","Especialidade"};
        private ArrayList<Personagem> personagem; //arraylist que guarda os elementos que vao aparecer na tabela

    public Tabela() {
        personagem = new ArrayList<Personagem>();
    }  
        
    @Override
    public int getRowCount() {
        return personagem.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
     switch(columnIndex){
         case 0: return personagem.get(rowIndex).getJogador();
         case 1: return personagem.get(rowIndex).getPersonagem();
         case 2: return personagem.get(rowIndex).getRaca();
         case 3: return personagem.get(rowIndex).getClasse();
         case 4: return personagem.get(rowIndex).getProfissao();
         case 5: return personagem.get(rowIndex).getEspecialidade();
     }
     return null;
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return columnNames[columnIndex];
    }
    
    public void add(Personagem p) {
        personagem.add(p);
        fireTableRowsInserted(personagem.size()-1,personagem.size()-1);
    }

    public void remove(int indice) {
        personagem.remove(indice);
        fireTableRowsDeleted(indice,indice);
    }
}
