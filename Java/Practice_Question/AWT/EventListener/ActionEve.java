
import java.awt.*;
import java.awt.event.*;
public class ActionEve extends Frame implements ActionListener
{

    TextField tf;
    Button b;
    ActionEve()
    {
        tf=new TextField();  tf.setBounds(60,50,170,20);
        b=new Button("Click Me"); b.setBounds(100,120,80,30);
        b.addActionListener(this);
        add(b);
        add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        tf.setText("Welcome to Action Event");
    }
    public static void main(String args[])
    {
        new ActionEve();
    }
}