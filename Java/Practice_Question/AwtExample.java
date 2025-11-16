import java.awt.*;

class AWTExample extends Frame

{

AWTExample()
{

    Button b = new Button("SUBMIT");
    Label l = new Label("Enter your name Here...");
    l.setBounds(50 , 40 , 100 , 30 );
    b.setBounds(50 , 50 , 100 , 30);
    add(b);
    add(l);
    setSize(400 , 200);
    setLayout(null);
    setVisible(true);
}

public static void main (String [] args )

{

AWTExample obj = new AWTExample();
}
}