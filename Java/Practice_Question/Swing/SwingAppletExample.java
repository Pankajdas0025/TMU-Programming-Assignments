import javax.swing.*;
import java.awt.*;


public class SwingAppletExample extends JApplet
 {

    public void paint(Graphics g) {
        g.drawString("Swing Applet Example", 20, 20);
    }

    public static void main(String[] args) {
        new SwingAppletExample();
    }
}


