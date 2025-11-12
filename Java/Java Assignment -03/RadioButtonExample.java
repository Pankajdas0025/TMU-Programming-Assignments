import javax.swing.*;
import java.awt.event.*;

public class RadioButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Radio Button Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JRadioButton r1 = new JRadioButton("Male");
        r1.setBounds(50, 30, 100, 25);
        JRadioButton r2 = new JRadioButton("Female");
        r2.setBounds(150, 30, 100, 25);

        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);

        frame.add(r1);
        frame.add(r2);

        JButton btnShow = new JButton("Show");
        btnShow.setBounds(50, 70, 80, 30);
        frame.add(btnShow);

        btnShow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String message = "";
                if (r1.isSelected()) {
                    message = "You selected Male";
                } else if (r2.isSelected()) {
                    message = "You selected Female";
                } else {
                    message = "No selection made";
                }
                JOptionPane.showMessageDialog(frame, message);
            }
        });

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
