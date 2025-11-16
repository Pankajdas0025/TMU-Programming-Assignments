
import java.awt.*;

public class SetColor extends Frame {

SetColor()

    {

Frame f =  new Frame("Label Frame");
Label lbl = new Label("Enter Your Name : - ");
TextField tf = new TextField();

Button btn = new Button("Submit");
lbl.setBounds(50 , 50 , 100 , 30);
tf.setBounds(50 , 100 , 200 ,30 );
btn.setBounds(50 , 150 , 100 , 30);
btn.setBackground(Color.green);

add(lbl);
add(tf);
add(btn);
setSize(300 , 400);
setLayout(null);
setVisible(true);

    }
    public static void main (String [] args)
    {
SetColor tf = new SetColor();
    }
}
