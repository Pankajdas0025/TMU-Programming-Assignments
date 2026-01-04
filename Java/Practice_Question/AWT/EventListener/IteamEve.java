import java.awt.*;
import java.awt.event.*;
public class IteamEve extends Frame implements ItemListener
{
    TextField tf;
    List l;
   IteamEve()
    {
        tf=new TextField();  tf.setBounds(60,50,170,20);
        l=new List(4);  l.setBounds(100,120,80,80);
        l.add("Java");
        l.add("Python");
        l.add("C++");
        l.add("JavaScript");
        l.addItemListener(this);
        add(l);
        add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void itemStateChanged(ItemEvent e)
    {
        String data="";
        data+=l.getSelectedItem();
        tf.setText(data);
    }
    public static void main(String args[])
    {
        new IteamEve();
    }
}