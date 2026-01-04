import javax.swing.*;

public class JCombobox extends JFrame {

    JCombobox() {
        setTitle("JComboBox Practice!");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String languages[] = {"Java", "C", "Python"};
        JComboBox combo = new JComboBox(languages);
        combo.setBounds(50, 50, 200, 30);

        add(combo);
        setVisible(true);
    }
    public static void main(String[] args) {
        new JCombobox();
    }
}
