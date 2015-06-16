/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animator;

import java.awt.Point;

/**
 *
 * @author Brenda
 */
public class Star {
    private final double interno;
    private final double externo;
    private final int ponta;
    private final Point centro;
    private final double scale;
    
     public Star(int ponta, Point centro, double externo, double interno)  {
        scale = 1.0D;
        this.centro = centro;
        this.ponta = ponta;
        this.externo = externo;
        this.interno = interno;
    }

    
}
