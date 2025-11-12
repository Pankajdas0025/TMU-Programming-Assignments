// 5 . Write a program using Applet to display a message in
// the Applet.

import javax.swing.*;
import java.awt.*;


public class MsgApplet extends JPanel {


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Hello, welcome to Java Applet!", 20, 50);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Applet Simulation");
        MsgApplet panel = new MsgApplet();

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
