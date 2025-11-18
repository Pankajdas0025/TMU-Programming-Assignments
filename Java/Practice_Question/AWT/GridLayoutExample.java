import java.awt.*;

public class GridLayoutExample extends Frame

{

    GridLayoutExample()
    {
Frame f = new Frame();

//Grid layout
Button b1 = new Button("1");
Button b2 = new Button("2");
Button b3 = new Button("3");
Button b4 = new Button("4");
Button b5 = new Button("5");
Button b6 = new Button("6");
b1.setBackground(Color.red);
b2.setBackground(Color.blue);
b3.setBackground(Color.green);
b4.setBackground(Color.yellow);
b5.setBackground(Color.pink);
b6.setBackground(Color.orange);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);

setLayout(new GridLayout(2,3));
setSize(300 , 300);
setVisible(true);


    }


    public static void main (String [] args)

    {

        GridLayoutExample  ln = new GridLayoutExample();

    }

}