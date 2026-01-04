
// Create Frame using Frame Class
import java.awt.*;
class FirstFrame extends Frame
{
 FirstFrame()
    {
Frame f = new Frame("my frame");
setSize(100 , 200);
setVisible(true);
setLayout(null);
    }
    public static void main (String [] args)
    {
        FirstFrame ob = new FirstFrame();
    }
}