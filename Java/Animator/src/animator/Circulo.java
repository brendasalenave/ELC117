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
import java.util.Random;

public class Circulo {
    Color cor;
    private int raio;
    private String caminho;
    private Point origem;
    Point pos;
    
    public Circulo(Point pos, int raio, String caminho) {
        this.pos = pos;
        this.raio = raio;
        this.caminho = caminho;
        cor = (Color.green);
        this.origem = new Point(pos.x, pos.y);
    }
    
    /*public Circulo(int x, int y, int raio, String caminho) {
        this.x = x;
        this.y = y;
        this.raio = raio;
        this.caminho = caminho;
        cor = (Color.green);
    }*/
    
    public Point getOrigem() {
        return origem;
    }
    
    public Point getPos() {
        return pos;
    }
    
    public void setRaio(int raio){
        this.raio = raio;
    }
    
    public int getRaio(){
        return raio;
    }
    
    public void setPos(Point pos) {
        this.pos = pos;
    }
    
    public String getCaminho() {
        return caminho;
    }

    void draw(Graphics g) {
        g.setColor(cor);
        g.fillOval(pos.x, pos.y, raio, raio);
    }
    
}
