import java.awt.*;
import java.awt.event.*;
class KeyList extends Frame implements KeyListener {
    Label lbl;
    KeyList() {
        lbl = new Label("Press any key");
        lbl.setBounds(50, 100, 200, 30);
        add(lbl);
        addKeyListener(this);
        setLayout(null);
        setSize(300,200);
        setVisible(true);
    }
    public void keyPressed(KeyEvent e) {
        lbl.setText("Key Pressed: " + e.getKeyChar());
    }
    public void keyReleased(KeyEvent e) {
        lbl.setText("Key Released: " + e.getKeyChar());
    }
    public void keyTyped(KeyEvent e) {
        lbl.setText("Key Typed: " + e.getKeyChar());
    }
    public static void main(String[] args) {
        new KeyList();
    }
}