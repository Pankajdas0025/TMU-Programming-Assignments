// Write a Java Program to demonstrate Keyboard event
import java.awt.*;
import java.awt.event.*;

public class KeyEventDemo extends Frame implements KeyListener {
    TextArea ta;

    KeyEventDemo() {
        ta = new TextArea();
        ta.setBounds(30, 30, 300, 300);
        ta.addKeyListener(this);
        add(ta);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e)  { ta.append("\nKey Pressed"); }
    public void keyReleased(KeyEvent e) { ta.append("\nKey Released"); }
    public void keyTyped(KeyEvent e)    { ta.append("\nKey Typed"); }

    public static void main(String[] args) { new KeyEventDemo(); }
}
