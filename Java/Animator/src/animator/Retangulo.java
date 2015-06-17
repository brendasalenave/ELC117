/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animator;

/**
 *
 * @author Brenda
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

public class Retangulo {
    Color cor;
    private final int base;
    private final int altura;
    private final int x;
    private final int y;
    private final String caminho;
    
    public Retangulo(int x, int y, int b, int h, String caminho) {
        this.x = x;
        this.y = y;
        this.base = b;
        this.altura = h;
        this.caminho = caminho;
        cor = (Color.ORANGE);
    }
    
    public void draw(Graphics g){
        g.setColor(cor);
        g.fillRect(x, y, base, altura);
    }
}
