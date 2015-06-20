package animator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

// Conjunto de objetos da animacao.
class ObjectSet {
    
    //private Image[] images;
    private ArrayList<Image> imagem = new ArrayList<Image>();
    private ArrayList<Circulo> circulo = new ArrayList<Circulo>();
    private ArrayList<Retangulo> retang = new ArrayList<Retangulo>();
    private ArrayList<Elipse> elipse = new ArrayList<Elipse>();

    private Movimento mov = new Movimento();
    double r = 0.0;
    int zoom = 2;
    
    // Adiciona objetos da classe Image ao ObjectSet.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
 
        
    void addImages(int n, Dimension dim, BufferedImage image, String path) {
        for(int i = 0; i < n; i++){
            Point p = new Point();
            Random a = new Random();
            int x = a.nextInt((dim.width - 150));
            int y = a.nextInt((dim.height - 150));

            p.setLocation(x, y);
            imagem.add(new Image(p, image, path));
        }
    }
    
    
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void addRectangles(int n, Dimension dim, String caminho) {
         for(int i = 0; i < n; i++){
            Point p = new Point();
            Random a = new Random();
            int x = a.nextInt((dim.width - 50));
            int y = a.nextInt((dim.height - 50));

            p.setLocation(x, y);
            retang.add(new Retangulo(p, 80, 60, caminho));
        }
    }
    
    void addCircles(int n, Dimension dim, String caminho) {
         for (int i = 0; i < n; i++){
            Point p = new Point();
            Random a = new Random();
            int x = a.nextInt((dim.width - 50));
            int y = a.nextInt((dim.height - 50));

            p.setLocation(x, y);
            circulo.add(new Circulo(p,60, caminho));
         }
    }
    
    void addElipses(int n, Dimension dim, String caminho) {
         for (int i = 0; i < n; i++){
            Point p = new Point();
            Random a = new Random();
            int x = a.nextInt((dim.width - 50));
            int y = a.nextInt((dim.height - 50));

            p.setLocation(x, y);
            elipse.add(new Elipse(p, caminho));
         }
    }
    
    
    // Desenha cada um dos objetos da animacao.
    void drawAll(Graphics g) {
       
        for (int i = 0; i < circulo.size(); i++){
            circulo.get(i).draw(g);
        }
        
        for (int i = 0; i <retang.size(); i++){
            retang.get(i).draw(g);
        }
        
        for (int i = 0; i < elipse.size(); i++){
            elipse.get(i).draw(g);
        }
               
        for (int i = 0; i < imagem.size(); i++){
            imagem.get(i).draw(g);
        }
    }

    // Move cada um dos objetos da animacao.
    void moveAll() {
        
        for (int i = 0; i < imagem.size(); i++){

            if(imagem.get(i).getCaminho().equals("Linear Horizontal")){
                imagem.get(i).setPos(mov.MovimentoLinearX(imagem.get(i).getOrigem()));
            }
            
            if(imagem.get(i).getCaminho().equals("Linear Vertical")){
                imagem.get(i).setPos(mov.MovimentoLinearY(imagem.get(i).getOrigem()));
            }
            
            if(imagem.get(i).getCaminho().equals("Linear Diagonal")){
                imagem.get(i).setPos(mov.MovimentoLinearD(imagem.get(i).getOrigem()));
            }
            
            if(imagem.get(i).getCaminho().equals("Circular")){
                imagem.get(i).setPos(mov.MovimentoCircular(imagem.get(i).getOrigem(),r));
            }   
        } 
        
        for (int i = 0; i < retang.size(); i++){
            if(retang.get(i).getCaminho().equals("Line")){
                retang.get(i).setPos(mov.MovimentoLinearX(retang.get(i).getOrigem()));
            }
            
            if(retang.get(i).getCaminho().equals("Circle")){
                retang.get(i).setPos(mov.MovimentoCircular(retang.get(i).getOrigem(),r));
            }
            
            if(retang.get(i).getCaminho().equals("Zoom")){
                retang.get(i).setAltura(mov.MovimentoZoom(retang.get(i).getAltura(),zoom));
            }
        }
   
        for (int i = 0; i < circulo.size(); i++){
            if(circulo.get(i).getCaminho().equals("Line")){
                circulo.get(i).setPos(mov.MovimentoLinearX(circulo.get(i).getOrigem()));
            }
            
            if(circulo.get(i).getCaminho().equals("Circle")){
                circulo.get(i).setPos(mov.MovimentoCircular(circulo.get(i).getOrigem(),r));
            }
            
            if(circulo.get(i).getCaminho().equals("Zoom")){
                circulo.get(i).setRaio(mov.MovimentoZoom(circulo.get(i).getRaio(),zoom));
            }
        }            
        
        for (int i = 0; i < elipse.size(); i++){
            if(elipse.get(i).getCaminho().equals("Line")){
                elipse.get(i).setPos(mov.MovimentoLinearX(elipse.get(i).getOrigem()));
            }
            if(elipse.get(i).getCaminho().equals("Circle")){
                elipse.get(i).setPos(mov.MovimentoCircular(elipse.get(i).getOrigem(),r));
            }
             if(elipse.get(i).getCaminho().equals("Zoom")){
                elipse.get(i).setAltura(mov.MovimentoZoom(elipse.get(i).getAltura(),zoom));
            }
        }
        r += 0.1;
        if(r > (2 * Math.PI))
            r = 0;
   }
}
