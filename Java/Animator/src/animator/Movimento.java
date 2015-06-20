/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animator;

import java.awt.Dimension;
import java.awt.Point;
import static java.lang.Math.cos;
import static java.lang.Math.sin;

/**
 *
 * @author Brenda
 */
public class Movimento {
    private Dimension dim;

    public Point MovimentoLinearX(Point p) {
        p.x += 4;
        return p;
    }
    
    public Point MovimentoLinearY(Point p) {
        p.y += 4;
        return p;
    }
    
    public Point MovimentoLinearD(Point p) {
        p.x += 4;
        p.y += 4;
        return p;
    }
    
    public Point MovimentoCircular(Point p, double raio){
        int x = (int) (p.x + 50 * cos(raio));
        int y = (int) (p.y + 50 * sin(raio));
        Point pCentral = new Point(x, y);
        return pCentral;
    }
 
    public int MovimentoZoom(int t, int zoom){
        if(t < 150)
            return (t += zoom);
     
        //System.out.println("Diminuindo");
        return (t -= 150);
    }
}
