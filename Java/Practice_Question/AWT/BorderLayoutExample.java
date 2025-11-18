import java.awt.*;
public class BorderLayoutExample extends Frame

{

BorderLayoutExample()

{
    Frame F = new Frame();

    // Border Layout ........................................................................
     Button b1 = new Button("NORTH");
     Button b2 = new Button("SOUTH");
     Button b3 = new Button("EAST");
     Button b4 = new Button("WEST");
     Button b5 = new Button("CENTER");
b1.setBackground(Color.red);
b2.setBackground(Color.blue);
b3.setBackground(Color.green);
b4.setBackground(Color.yellow);
b5.setBackground(Color.pink);


     add(b1, BorderLayout.NORTH);
     add(b2, BorderLayout.SOUTH);
     add(b3, BorderLayout.EAST);
     add(b4, BorderLayout.WEST);
     add(b5, BorderLayout.CENTER);

     setSize(300 , 300);
     setVisible(true);

}

public static void main (String [] args)

{

    BorderLayoutExample  ln = new BorderLayoutExample();

}
}