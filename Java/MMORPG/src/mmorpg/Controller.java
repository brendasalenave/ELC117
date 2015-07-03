/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmorpg;

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
        //personagem.setJogador(view.getJogador().getText());
        //personagem.setPersonagem((String)view.getPersonagem().getSelectedItem());
        return personagem;
    }
    
    public void inserir(){
        Personagem personagem = novosDados();
        model.add(personagem);
    }

    public void remover() {
        int indice = view.getTable().getSelectedRow();
        if(indice == -1){
            return;
        }
        model.remove(indice);
    }
    
}
