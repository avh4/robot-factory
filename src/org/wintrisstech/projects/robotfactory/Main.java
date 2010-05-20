
package org.wintrisstech.projects.robotfactory;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {

        JFrame window = new JFrame("Robot Factory");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(new RobotCanvas());
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

}
