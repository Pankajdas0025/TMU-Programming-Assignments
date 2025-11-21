import java.applet.Applet;
import java.awt.Graphics;
public class AppletExample extends Applet
{
public void paint(Graphics g)
{
g.drawString("welcome",150,150);

}
public static void main(String args[])
{
AppletExample applet = new AppletExample();


}
}

