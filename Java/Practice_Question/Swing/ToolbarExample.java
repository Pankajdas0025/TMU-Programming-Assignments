import javax.swing.*;

public class ToolbarExample extends JFrame {

    ToolbarExample() {
        setTitle("JToolBar Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Creating Toolbar
        JToolBar toolbar = new JToolBar();
        toolbar.setBounds(0, 0, 400, 40);

        // Adding Buttons to Toolbar
        toolbar.add(new JButton("Home"));
        toolbar.add(new JButton("Edit"));
        toolbar.add(new JButton("View"));

        add(toolbar);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ToolbarExample();
    }
}
