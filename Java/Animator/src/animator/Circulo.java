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
import java.util.Random;

public class Circulo {
    Color cor;
    private int x, y , r;
    private String caminho;
    private int largura;
    private int altura;
    private final int raio;
    
    public Circulo(int x, int y, int raio, String caminho) {
        this.x = x;
        this.y = y;
        this.raio = r;
        this.caminho = caminho;
        cor = (Color.cyan);
    }

    void draw(Graphics g) {
        g.setColor(cor);
        g.fillOval(x, y, raio, raio);
    }
    
    
}