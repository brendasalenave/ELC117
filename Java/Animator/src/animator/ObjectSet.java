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
    private ArrayList<Estrela> estrela = new ArrayList<Estrela>();
    private ArrayList<Elipse> elipse = new ArrayList<Elipse>();

    private Movimento mov;
    
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
    
    
    void addStars(int n, Dimension dim, String path) {
        /*for (int i = 0; i < n; i++) {
            int x = rand.nextInt(dim.width) - 50;
            int y = rand.nextInt(dim.height) - 50;
            estrela.add(new Estrela(x,y,path));
        }*/
    }
    
    // Adiciona objetos da classe Estrela ao ObjectSet.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void addRectangles(int n, Dimension dim, String caminho) {
         for (int i = 0; i < n; i++){
            Random a = new Random();
            int x = a.nextInt((dim.width - 150));
            int y = a.nextInt((dim.height - 150));
            retang.add(new Retangulo(x,y,60,60,caminho));
         }
    }
    
    void addCircles(int n, Dimension dim, String caminho) {
         for (int i = 0; i < n; i++){
            Random a = new Random();
            int x = a.nextInt((dim.width - 150));
            int y = a.nextInt((dim.height - 150));
            circulo.add(new Circulo(x,y,80,caminho));
         }
    }
    
    void addElipses(int n, Dimension dim, String caminho) {
         for (int i = 0; i < n; i++){
            Random a = new Random();
            int x = a.nextInt((dim.width - 150));
            int y = a.nextInt((dim.height - 150));
            elipse.add(new Elipse(x,y,caminho));
         }
    }

    
    // Desenha cada um dos objetos da animacao.
    void drawAll(Graphics g) {
        for (Image imagem1 : imagem) {
            imagem1.draw(g);
        }
        
        for (Circulo circulo1 : circulo) {
            circulo1.draw(g);
        }
        
        for (Retangulo retang1 : retang) {
            retang1.draw(g);
        }
        /*
        for (int i = 0; i < estrela.size(); i++){
        estrela.get(i).draw(g);
        }
         */
        for (Elipse elipse1 : elipse) {
            elipse1.draw(g);
        }
    }

    // Move cada um dos objetos da animacao.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void moveAll() {
        for (Image imagem1 : imagem) {
            if(imagem1.getCaminho().equals("Linear")){
                System.out.println("Movimento Linear");
                imagem1.setPos(mov.MovimentoLinear(imagem1.getOrigem()));
            }
                
        }
   }

    private Point setLocation(Dimension dim) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
