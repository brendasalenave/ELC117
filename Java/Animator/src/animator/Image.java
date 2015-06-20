package animator;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;

// Uma imagem na animacao.
class Image {

    private Point origem;
    BufferedImage img;
    Point pos;
    private String caminho;

    public Image(Point pos, BufferedImage img, String caminho) {
        this.pos = pos;
        this.img = img;
        this.caminho = caminho;
        this.origem = new Point(pos.x, pos.y);
    }

    Image(Point p, BufferedImage image, String path, Dimension dim) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    public void draw(Graphics g) {
        g.drawImage(img, (int) pos.getX(), (int) pos.getY(), null);
    }
    

}
