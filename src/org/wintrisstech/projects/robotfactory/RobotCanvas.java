package org.wintrisstech.projects.robotfactory;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

class RobotCanvas extends JComponent {
    private Robot r;

    public RobotCanvas() {
        r = new Robot();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 600);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 800, 600);

        r.draw((Graphics2D)g);
    }

}
