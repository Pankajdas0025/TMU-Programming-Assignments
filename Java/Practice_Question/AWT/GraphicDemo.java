import java.awt.*;
import java.awt.event.*;

class GraphicDemo extends Frame {

    Image img;

    GraphicDemo() {

        setTitle("AWT Graphics Demo");
        setSize(600, 600);

        // Load image

        Toolkit tk = Toolkit.getDefaultToolkit();
        img = tk.getImage("sample.jpg");   // ← put your image here

        // Add canvas
        add(new MyCanvas());

        setVisible(true);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    // ----- Canvas Class -----
    class MyCanvas extends Canvas {
        public void paint(Graphics g) {

            setBackground(Color.WHITE);

            // Font
            Font f = new Font("Arial", Font.BOLD, 20);
            g.setFont(f);
            g.setColor(Color.BLACK);
            g.drawString("AWT Graphics Demo", 180, 50);

            // Line
            g.setColor(Color.RED);
            g.drawLine(50, 80, 300, 80);

            // Rectangle
            g.setColor(Color.BLUE);
            g.drawRect(50, 100, 150, 80);

            // Filled Rectangle
            g.setColor(Color.GREEN);
            g.fillRect(220, 100, 150, 80);

            // Oval
            g.setColor(Color.ORANGE);
            g.drawOval(50, 200, 120, 80);

            // Filled Oval
            g.setColor(Color.MAGENTA);
            g.fillOval(200, 200, 120, 80);

            // Rounded Rect
            g.setColor(Color.CYAN);
            g.fillRoundRect(50, 300, 150, 80, 30, 30);

            // Image
            g.drawImage(img, 350, 250, 150, 150, this);
        }
    }

    public static void main(String[] args) {
        new GraphicDemo();
    }
}
