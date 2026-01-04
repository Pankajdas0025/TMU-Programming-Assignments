import java.awt.*;
public class FlowLayoutExamle extends Frame

{

    FlowLayoutExamle()

    {
Frame f = new Frame();
//Grid layout

Button b1 = new Button("1");
Button b2 = new Button("2");
Button b3 = new Button("3");
Button b4 = new Button("4");
Button b5 = new Button("5");
Button b6 = new Button("6");
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);

setLayout(new FlowLayout(FlowLayout.LEADING));
setSize(300 , 300);
setVisible(true);


    }
    public static void main (String [] args)

    {

        FlowLayoutExamle  ln = new FlowLayoutExamle();

    }

}



