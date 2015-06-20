/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Brenda
 */
public class Elipse {
    Color cor;
    private int largura;
    private int altura;
    private final String caminho;
    Point pos;
    private final Point origem;
    
    public Elipse(Point pos, String caminho){
        this.pos = pos;
        this.caminho = caminho;
        cor = (Color.red);
        
        this.largura = 60;
        this.altura = 100;
        
        this.origem = new Point(pos.x, pos.y);
    }
    
    public Point getOrigem() {
        return origem;
    }
    
    public Point getPos() {
        return pos;
    }
    
    public int getAltura(){
        return altura;
    }
    
    public void setAltura(int altura){
        this.altura = altura;
    }
    
        public int getLargura(){
        return largura;
    }
    
    public void setLargura(int largura){
        this.largura = largura;
    }
    
    public void setPos(Point pos) {
        this.pos = pos;
    }
    
    public String getCaminho() {
        return caminho;
    }
    
    public void draw(Graphics g){
        g.setColor(cor);
        g.fillOval(pos.x, pos.y, largura, altura);
    }
    
}
