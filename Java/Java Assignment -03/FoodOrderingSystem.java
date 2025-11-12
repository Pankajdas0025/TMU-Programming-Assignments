import javax.swing.*;
import java.awt.event.*;

public class FoodOrderingSystem {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Food Ordering System");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JCheckBox pizza = new JCheckBox("Pizza 100");
        pizza.setBounds(50, 30, 120, 25);
        JCheckBox burger = new JCheckBox("Burger 80");
        burger.setBounds(50, 60, 120, 25);
        JCheckBox tea = new JCheckBox("Tea 40");
        tea.setBounds(50, 90, 120, 25);

        JButton order = new JButton("Order");
        order.setBounds(50, 130, 80, 30);

        frame.add(pizza);
        frame.add(burger);
        frame.add(tea);
        frame.add(order);

        order.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int total = 0;
                String items = "";
                if (pizza.isSelected()) {
                    total += 100;
                    items += "Pizza ";
                }
                if (burger.isSelected()) {
                    total += 80;
                    items += "Burger ";
                }
                if (tea.isSelected()) {
                    total += 40;
                    items += "Tea ";
                }
                JOptionPane.showMessageDialog(frame, "Ordered: " + items + "\nTotal: " + total);
            }
        });

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
