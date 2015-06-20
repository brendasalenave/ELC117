/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animator;

import java.awt.Dimension;
import java.awt.Point;

/**
 *
 * @author Brenda
 */
public class Movimento {
    private Dimension dim;

    public Point MovimentoLinear(Point p) {
        p.x += 4;
        return p;
    }
    
}
