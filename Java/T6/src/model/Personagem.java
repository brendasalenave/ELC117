package model;

import view.View;

/**
 *
 * @author Brenda
 */
public class Personagem {
    
    private String jogador;
    private String personagem;
    private String raca;
    private String classe;
    private String profissao;
    private String especialidade;
    private String nivelProfissao;
    private String d;
    private String hora;
    

    public Personagem(String jogador, String personagem) {
        this.jogador = jogador;
        this.personagem = personagem;
    }

    public Personagem() {}

    public String getJogador() {
        return jogador;
    }

    public void setJogador(String jogador) {
        this.jogador = jogador;
    }

    public String getPersonagem() {
        return personagem;
    }

    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
    
    public String getClasse() {
        return classe;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    public String getProfissao() {
        return profissao;
    }
    
    public void setNivelProfissao(String nivelprofissao) {
        this.nivelProfissao = nivelprofissao;
    }
    
    public String getNivelProfissao() {
        return nivelProfissao;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    public String getEspecialidade() {
        return especialidade;
    }
    

    public static void main(String[] args) {
            /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new View().setVisible(true);
            }
        });
    }
    
}
