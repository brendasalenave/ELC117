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
import java.awt.Point;

public class Retangulo {
    Color cor;
    private final int base;
    private final int altura;
    private final String caminho;
    private final Point origem;
    Point pos;
    
    public Retangulo(Point pos, int b, int h, String caminho) {
        this.pos = pos;
        this.base = b;
        this.altura = h;
        this.caminho = caminho;
        cor = (Color.ORANGE);
        this.origem = new Point(pos.x, pos.y);
    }

  public Point getOrigem() {
        return origem;
    }
    
    public Point getPos() {
        return pos;
    }
    
    public void setPos(Point pos) {
        this.pos = pos;
    }
    
    public String getCaminho() {
        return caminho;
    }
    
    public void draw(Graphics g){
        g.setColor(cor);
        g.fillRect(pos.x, pos.y, base, altura);
    }
}
