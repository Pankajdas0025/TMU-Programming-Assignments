import java.awt.*;
import java.awt.event.*;
class WindEve extends Frame implements WindowListener {
    WindEve() {
        addWindowListener(this);
        setSize(300,200);
        setVisible(true);
    }
    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing...");
        dispose();
    }
    public void windowOpened(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public static void main(String[] args) {
        new WindEve();
    }
}



