import javax.swing.*;
public class Jicon extends JFrame {

    Jicon() {
        setTitle("JIcon Practice!");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        ImageIcon icon = new ImageIcon("Logo.jpeg");
        JLabel label = new JLabel(icon);
        label.setBounds(50, 50, icon.getIconWidth(), icon.getIconHeight());
        add(label);
        setVisible(true);
    }

    public static void main(String[] args) {
    new Jicon();
    }
}
