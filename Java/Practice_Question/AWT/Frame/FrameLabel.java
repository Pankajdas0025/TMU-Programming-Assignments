
import java.awt.*;

public class FrameLabel extends Frame {

FrameLabel()

    {

Frame f =  new Frame("Label Frame");

setTitle("Frame Practice!");
Label lbl = new Label("Label For Button");
Font fo = new Font("Arial", Font.BOLD, 20);
lbl.setFont(fo);
Button btn = new Button ("Click Me");
lbl.setBounds(50 , 150 , 100 , 30);
btn.setBounds(100 , 150 , 300 ,30 );
add(lbl);
add(btn);
setSize(800 , 400);
setLayout(null);
setVisible(true);

    }
    public static void main (String [] args)
    {
FrameLabel FB = new FrameLabel();
    }
}
