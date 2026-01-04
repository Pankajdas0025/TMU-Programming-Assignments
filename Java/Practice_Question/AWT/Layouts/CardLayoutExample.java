import java.awt.*;
public class CardLayoutExample extends Frame

{

    CardLayoutExample()

    {

Frame f = new Frame();
CardLayout card = new CardLayout();

// Creating buttons
Button b1 = new Button("Button 1");
Button b2 = new Button("Button 2");
Button b3 = new Button("Button 3");
Button b4 = new Button("Button 4");

b1.setBackground(Color.red);
b2.setBackground(Color.blue);
b3.setBackground(Color.green);
b4.setBackground(Color.yellow);
add(b1);
add(b2);
add(b3);
add(b4);
setLayout(card);
setSize(300 , 300);
setVisible(true);
    }

    public static void main (String [] args)

    {

        CardLayoutExample  ln = new CardLayoutExample();

    }

}