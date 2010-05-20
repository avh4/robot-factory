package org.wintrisstech.projects.robotfactory;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import javax.swing.JComponent;

/**
 * This class is a JComponent that draws a lot of Robots.
 */
class RobotCanvas extends JComponent {

    private static final int GRID_SIZE = 200;

    private Robot[] r = new Robot[12];

    public RobotCanvas() {
        for (int i = 0; i < r.length; i++) {
            r[i] = new Robot();
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 600);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, 800, 600);

        for (int row = 0; row < 3; row++) {
            g2.setTransform(AffineTransform.getTranslateInstance(0*GRID_SIZE, row*GRID_SIZE));
            r[0+row*4].draw(g2);
            g2.setTransform(AffineTransform.getTranslateInstance(1*GRID_SIZE, row*GRID_SIZE));
            r[1+row*4].draw(g2);
            g2.setTransform(AffineTransform.getTranslateInstance(2*GRID_SIZE, row*GRID_SIZE));
            r[2+row*4].draw(g2);
            g2.setTransform(AffineTransform.getTranslateInstance(3*GRID_SIZE, row*GRID_SIZE));
            r[3+row*4].draw(g2);
        }
    }

}
