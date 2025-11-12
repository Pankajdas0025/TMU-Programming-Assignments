import javax.swing.*;
import java.awt.event.*;

public class ComboBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JComboBox Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        String[] items = {"Apple", "Banana", "Cherry"};
        JComboBox<String> comboBox = new JComboBox<>(items);
        comboBox.setBounds(50, 30, 150, 25);
        frame.add(comboBox);

        JLabel label = new JLabel("Selected Item: ");
        label.setBounds(50, 70, 200, 25);
        frame.add(label);

        JButton button = new JButton("Show");
        button.setBounds(50, 110, 80, 30);
        frame.add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selected = (String) comboBox.getSelectedItem();
                label.setText("Selected Item: " + selected);
            }
        });

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
