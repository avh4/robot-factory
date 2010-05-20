package org.wintrisstech.projects.robotfactory;

import java.awt.Dimension;
import javax.swing.JComponent;

class RobotCanvas extends JComponent {

    public RobotCanvas() {
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 600);
    }

}
