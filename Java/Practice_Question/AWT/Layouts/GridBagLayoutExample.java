import java.awt.*;
import javax.swing.*;
public class GridBagLayoutExample extends JFrame {
    public static void main(String[] args) {
        new GridBagLayoutExample();
    }
    public GridBagLayoutExample() {

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(layout);
        setTitle("GridBag Layout Example");

        // Button One
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new Button("Button One"), gbc);

        // Button Two
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(new Button("Button Two"), gbc);

        // Button Three
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.ipady = 20; // increases height
        add(new Button("Button Three"), gbc);

        // Button Four
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(new Button("Button Four"), gbc);

        // Button Five (span across 2 columns)
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(new Button("Button Five"), gbc);

        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
