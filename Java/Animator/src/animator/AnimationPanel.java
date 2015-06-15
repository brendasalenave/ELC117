package animator;

import animator.ObjectSet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

class AnimationPanel extends JPanel
implements Runnable {
    private Dimension tam;
    private ObjectSet objs;
    private int millis;

    public AnimationPanel(ObjectSet objs, Dimension tam, int millis) {
        this.setBackground(Color.gray);
        this.objs = objs;
        this.tam = tam;
        this.millis = millis;
    }

    @Override
    public Dimension getPreferredSize() {
        return this.tam;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.objs.drawAll(g);
    }

    @Override
    public void run() {
        boolean executa = true;
        
        while (executa) {
            this.objs.moveAll();
            this.repaint();
            try {
                Thread.sleep(this.millis);
            }
            catch (InterruptedException e) {
                executa = false;
            }
        }
    }
}
