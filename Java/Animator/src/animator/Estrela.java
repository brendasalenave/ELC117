/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animator;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Brenda
 */
public class Estrela {
    Color cor;
    private final int x;
    private final int y;
    private final int largura;
    private final int altura;
    private final String caminho;


      public Estrela(int x, int y, String caminho){
        this.x = x;
        this.y = y;
        this.caminho = caminho;
        cor = (Color.cyan);
        this.largura = 60;
        this.altura = 25;
    }

    
    
}
