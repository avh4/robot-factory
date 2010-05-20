package org.wintrisstech.projects.robotfactory;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

class Robot {

    int BODY_WIDTH = randomInt(20, 150);
    int BODY_HEIGHT = randomInt(20, 150);
    int ARM_LENGTH = randomInt(10, BODY_HEIGHT + 30);
    int ARM_WIDTH = randomInt(5, 20);
    int HEAD_WIDTH = randomInt(20, 150);
    Color COLOR = randomColor();

    void draw(Graphics2D g) {
        g.setColor(COLOR);
        // Body
        g.fillRoundRect(21, 51, BODY_WIDTH - 2, BODY_HEIGHT - 2, 3, 3);
        // Arms
        g.fillRoundRect(21 - ARM_WIDTH, 51, ARM_WIDTH - 2, ARM_LENGTH - 2, 5, 5);
        g.fillRoundRect(BODY_WIDTH + 21, 51, ARM_WIDTH - 2, ARM_LENGTH - 2, 5, 5);
        // Legs
        g.fillRoundRect(BODY_WIDTH/2 + 20 - 20 + 1, BODY_HEIGHT + 51, 8, 28, 3, 3);
        g.fillRoundRect(BODY_WIDTH/2 + 20 + 10 + 1, BODY_HEIGHT + 51, 8, 28, 3, 3);
        // Head
        g.fillArc(21 + BODY_WIDTH/2 - HEAD_WIDTH/2, 11, HEAD_WIDTH - 2, 76, 0, 180);
        // Ears
        g.setStroke(new BasicStroke(4));
        g.drawLine(45 + BODY_WIDTH/2 - HEAD_WIDTH/2, 30, 35 + BODY_WIDTH/2 - HEAD_WIDTH/2, 5);
        g.drawLine(HEAD_WIDTH - 5 + BODY_WIDTH/2 - HEAD_WIDTH/2, 30, HEAD_WIDTH + 5 + BODY_WIDTH/2 - HEAD_WIDTH/2, 5);
        // Eyes
        g.fillOval(20 + BODY_WIDTH/2 - HEAD_WIDTH/2, 20, 20, 20);
        g.fillOval(HEAD_WIDTH + BODY_WIDTH/2 - HEAD_WIDTH/2, 20, 20, 20);
        g.setColor(Color.WHITE);
        g.fillOval(22 + BODY_WIDTH/2 - HEAD_WIDTH/2, 22, 16, 16);
        g.fillOval(HEAD_WIDTH + 2 + BODY_WIDTH/2 - HEAD_WIDTH/2, 22, 16, 16);
        g.setColor(COLOR);
    }

    private int randomInt(int low, int high) {
        return (int) (low + (Math.random() * (high - low)));
    }

    private Color randomColor() {
        return new Color(randomInt(0, 255), randomInt(0, 255), randomInt(0, 255));
    }

}
