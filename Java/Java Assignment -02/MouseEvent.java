// Write a Java Program to demonstrate Mouse event.

import java.awt.*;
import java.awt.event.*;

public class MouseEvent extends Frame implements MouseListener {
    TextArea ta;

    MouseEvent() {
        ta = new TextArea();
        ta.setBounds(20, 50, 350, 300);
        add(ta);

        addMouseListener(this);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    // When mouse is clicked
    public void mouseClicked(MouseEvent e) {
        ta.append("Hello\n");
    }

    // Other MouseListener methods (required, but can be empty)
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new MouseEvent();
    }
}
