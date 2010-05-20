package org.wintrisstech.projects.robotfactory;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

class Robot {

    int BODY_WIDTH = randomInt(20, 150);
    int ARM_LENGTH = randomInt(10, 100);

    void draw(Graphics2D g) {
        g.setColor(Color.BLACK);
        // Body
        g.fillRoundRect(21, 51, BODY_WIDTH - 2, 78, 3, 3);
        // Arms
        g.fillRoundRect(1, 51, 18, ARM_LENGTH - 2, 3, 3);
        g.fillRoundRect(BODY_WIDTH + 21, 51, 18, ARM_LENGTH - 2, 3, 3);
        // Legs
        g.fillRoundRect(BODY_WIDTH/2 + 20 - 20 + 1, 131, 8, 28, 3, 3);
        g.fillRoundRect(BODY_WIDTH/2 + 20 + 10 + 1, 131, 8, 28, 3, 3);
        // Head
        g.fillArc(21, 11, BODY_WIDTH - 2, 76, 0, 180);
        // Ears
        g.setStroke(new BasicStroke(4));
        g.drawLine(45, 30, 35, 5);
        g.drawLine(BODY_WIDTH - 5, 30, BODY_WIDTH + 5, 5);
        // Eyes
        g.fillOval(20, 20, 20, 20);
        g.fillOval(BODY_WIDTH, 20, 20, 20);
        g.setColor(Color.WHITE);
        g.fillOval(22, 22, 16, 16);
        g.fillOval(BODY_WIDTH + 2, 22, 16, 16);
        g.setColor(Color.BLACK);
    }

    private int randomInt(int low, int high) {
        return (int) (low + (Math.random() * (high - low)));
    }

}
