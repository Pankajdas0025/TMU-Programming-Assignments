// 4 .  Write a program to draw different shapes in an applet
// using graphic class.

import javax.swing.*;
import java.awt.*;

public class Shapes extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Rectangle
        g.setColor(Color.RED);
        g.drawRect(50, 50, 150, 100);

        // Oval
        g.setColor(Color.BLUE);
        g.drawOval(250, 50, 150, 100);

        // Line
        g.setColor(Color.GREEN);
        g.drawLine(50, 200, 200, 300);

        // Triangle (Polygon)
        g.setColor(Color.MAGENTA);
        int[] x = {250, 350, 450};
        int[] y = {200, 300, 200};
        g.drawPolygon(x, y, 3);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shapes Example");
        Shapes panel = new Shapes();

        frame.add(panel);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
