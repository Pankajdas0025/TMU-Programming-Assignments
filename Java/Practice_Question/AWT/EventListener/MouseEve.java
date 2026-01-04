import java.awt.*;
import java.awt.event.*;
class MouseEve extends Frame implements MouseListener {
    Label lbl;
    MouseEve() {
        lbl = new Label("Mouse Events Here");
        lbl.setBounds(50, 100, 200, 30);
        add(lbl);
        addMouseListener(this);
        setLayout(null);
        setSize(300,200);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e) {
        lbl.setText("Clicked");
    }
    public void mousePressed(MouseEvent e) {
        lbl.setText("Pressed");
    }
    public void mouseReleased(MouseEvent e) {
        lbl.setText("Released");
    }
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new MouseEve();
    }
}
