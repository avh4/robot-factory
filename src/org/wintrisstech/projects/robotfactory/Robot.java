package org.wintrisstech.projects.robotfactory;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

class Robot {

    void draw(Graphics2D g) {
        g.setColor(Color.BLACK);
        // Body
        g.fillRoundRect(21, 51, 78, 78, 3, 3);
        // Arms
        g.fillRoundRect(1, 51, 18, 68, 3, 3);
        g.fillRoundRect(101, 51, 18, 68, 3, 3);
        // Legs
        g.fillRoundRect(46, 131, 8, 28, 3, 3);
        g.fillRoundRect(66, 131, 8, 28, 3, 3);
        // Head
        g.fillArc(21, 11, 78, 76, 0, 180);
        // Ears
        g.setStroke(new BasicStroke(4));
        g.drawLine(45, 30, 35, 5);
        g.drawLine(75, 30, 85, 5);
        // Eyes
        g.fillOval(20, 20, 20, 20);
        g.fillOval(80, 20, 20, 20);
        g.setColor(Color.WHITE);
        g.fillOval(22, 22, 16, 16);
        g.fillOval(82, 22, 16, 16);
        g.setColor(Color.BLACK);
    }

}
