import java.awt.*;
import java.awt.event.*;

class AwtEventsDemo extends Frame implements ActionListener, TextListener,
                                             ItemListener, MouseListener,
                                             MouseMotionListener, KeyListener,
                                             WindowListener {

    Button btn;
    TextField tf;
    Label lbl;
    Checkbox cb;
    Choice ch;

    AwtEventsDemo() {

        setTitle("Simple AWT Event Handling");
        setSize(500, 400);
        setLayout(null);

        // Label
        lbl = new Label("Events Output:");
        lbl.setBounds(50, 50, 300, 30);
        add(lbl);

        // Button
        btn = new Button("Click Me");
        btn.setBounds(50, 100, 100, 30);
        add(btn);
        btn.addActionListener(this);

        // TextField
        tf = new TextField();
        tf.setBounds(50, 150, 150, 30);
        add(tf);
        tf.addTextListener(this);

        // Checkbox
        cb = new Checkbox("Check Me");
        cb.setBounds(50, 200, 100, 30);
        add(cb);
        cb.addItemListener(this);

        // Choice
        ch = new Choice();
        ch.setBounds(50, 250, 120, 30);
        ch.add("Java");
        ch.add("Python");
        ch.add("C++");
        add(ch);
        ch.addItemListener(this);

        // Add Listeners
        addMouseListener(this);
        addMouseMotionListener(this);
        addKeyListener(this);
        addWindowListener(this);

        setVisible(true);
    }

    // ----- Action Event -----
    public void actionPerformed(ActionEvent e) {
        lbl.setText("Button Clicked!");
    }

    // ----- Text Event -----
    public void textValueChanged(TextEvent e) {
        lbl.setText("Typing: " + tf.getText());
    }

    // ----- Item Event -----
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == cb) {
            lbl.setText("Checkbox: " + (cb.getState() ? "Checked" : "Unchecked"));
        } else if (e.getSource() == ch) {
            lbl.setText("Choice Selected: " + ch.getSelectedItem());
        }
    }

    // ----- Mouse Events -----
    public void mouseClicked(MouseEvent e) {
        lbl.setText("Mouse Clicked at: " + e.getX() + ", " + e.getY());
    }
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    // ----- Mouse Motion Events -----
    public void mouseMoved(MouseEvent e) {
        lbl.setText("Mouse Moved: " + e.getX() + ", " + e.getY());
    }
    public void mouseDragged(MouseEvent e) {}

    // ----- Key Events -----
    public void keyPressed(KeyEvent e) {
        lbl.setText("Key Pressed: " + e.getKeyChar());
    }
    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    // ----- Window Events -----
    public void windowClosing(WindowEvent e) {
        dispose();
    }
    public void windowOpened(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}

    public static void main(String[] args) {
        new AwtEventsDemo();
    }
}
