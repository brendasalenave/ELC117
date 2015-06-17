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
import java.awt.Graphics;

public class Circulo {
    Color cor;
    private int x, y , raio;
    private String caminho;
    
    public Circulo(int x, int y, int raio, String caminho) {
        this.x = x;
        this.y = y;
        this.raio = raio;
        this.caminho = caminho;
        cor = (Color.green);
    }

    void draw(Graphics g) {
        g.setColor(cor);
        g.fillOval(x, y, raio, raio);
    }
    
}
