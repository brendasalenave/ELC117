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
public class Elipse {
    Color cor;
    private final int x;
    private final int y;
    private final int largura;
    private final int altura;
    private final String caminho;
    
    public Elipse(int x, int y, String caminho){
        this.x = x;
        this.y = y;
        this.caminho = caminho;
        cor = (Color.red);
        
        this.largura = 90;
        this.altura = 60;
    }
    
    public void draw(Graphics g){
        g.setColor(cor);
        g.fillOval(x, y, largura, altura);
    }
    
}
