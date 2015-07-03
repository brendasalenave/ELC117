/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Personagem;
import mmorpg.Tabela;
import view.View;

/**
 *
 * @author Brenda
 */
public class Controller {
    private View view;
    private Tabela model;

    public Controller(View view, Tabela model) {
        this.view = view;
        this.model = model;
    }
    
    private Personagem novosDados(){
        Personagem personagem = new Personagem();   
        personagem.setJogador(view.getJogador().getText());
        personagem.setPersonagem((String)view.getPersonagem().getSelectedItem());
        personagem.setRaca((String)view.getRaca().getSelectedItem());
        personagem.setClasse((String)view.getClasse().getSelectedItem());
        personagem.setProfissao((String)view.getProfissao().getSelectedItem());
        personagem.setNivelProfissao((String)view.getNivelProfissao().getSelectedItem());
        personagem.setEspecialidade((String)view.getEspecialidade().getSelectedItem());
        return personagem;
    }
    
    public void inserir(){
        Personagem contato = novosDados();
        model.add(contato);
    }
    
    public void atualizar() {
        int indice = view.getTable().getSelectedRow();
        //model.refresh(indice);
    }

    public void remover() {
        int indice = view.getTable().getSelectedRow();
        if(indice == -1){
            return;
        }
        model.remove(indice);
    }
  
}
