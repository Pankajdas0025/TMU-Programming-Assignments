
import java.awt.*;

public class FrameButton extends Frame {

    FrameButton()

    {

Frame f =  new Frame("Button frame");
Button btn = new Button ("Test Button");

btn.setBounds(100 , 250 , 100 ,30 );
add(btn);
setSize(300 , 400);
setLayout(null);
setVisible(true);

    }
    public static void main (String [] args)
    {
FrameButton FB = new FrameButton();
    }
}
