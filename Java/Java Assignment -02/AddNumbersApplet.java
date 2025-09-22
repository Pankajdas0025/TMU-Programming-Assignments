// WAP to enter two numbers in two different text
// boxes. Add a button on the Applet. The program
// should print the sum of the two numbers of the
// Applet window.

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code="AddNumbersApplet.class" width=400 height=200></applet> */

public class AddNumbersApplet extends Applet implements ActionListener {
    TextField num1 = new TextField(5), num2 = new TextField(5);
    Button add = new Button("Add");
    Label result = new Label("Result: ");

    public void init() {
        add(new Label("Num1:")); add(num1);
        add(new Label("Num2:")); add(num2);
        add(add); add(result);
        add.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int sum = Integer.parseInt(num1.getText()) + Integer.parseInt(num2.getText());
            result.setText("Result: " + sum);
        } catch (Exception ex) {
            result.setText("Enter valid numbers!");
        }
    }
}
