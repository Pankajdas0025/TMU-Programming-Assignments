import javax.swing.*;
public class JframeExample extends JFrame {

JframeExample()

{
    ImageIcon icon = new ImageIcon("logo.png");
JLabel label = new JLabel(icon);

JFrame frame = new JFrame();
setTitle("JFrame Practice!");
setSize(400 , 500);
setVisible(true);
setLayout(null);
}
public static void main (String [] args)
{
new JframeExample();
}


}
