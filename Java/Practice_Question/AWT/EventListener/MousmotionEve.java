import java.awt.*;
import java.awt.event.*;
class MousmotionEve extends Frame implements MouseMotionListener {
    Label lbl;
    MousmotionEve() {
        lbl = new Label("Move Mouse...");
        lbl.setBounds(50, 100, 200, 30);
        add(lbl);
        addMouseMotionListener(this);
        setLayout(null);
        setSize(300,200);
        setVisible(true);
    }
    public void mouseMoved(MouseEvent e) {
        lbl.setText("Move: " + e.getX() + ", " + e.getY());
    }
    public void mouseDragged(MouseEvent e) {
        lbl.setText("Drag: " + e.getX() + ", " + e.getY());
    }
    public static void main(String[] args) {
        new MousmotionEve();
    }
}