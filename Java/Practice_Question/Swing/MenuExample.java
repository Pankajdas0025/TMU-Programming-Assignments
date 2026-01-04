import javax.swing.*;
public class MenuExample extends JFrame {
    MenuExample() {
        setTitle("JMenuBar Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        //Creating Menu========================================
        JMenu home = new JMenu("Home");
        JMenu about  = new JMenu("About");
        JMenu contact  = new JMenu("Contcat");
        //Adding Menus into Menu Bar ==========================
        menuBar.add(home);
        menuBar.add(about);
        menuBar.add(contact);
        //Adding Menu Bar to Frame ============================
        setJMenuBar(menuBar);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MenuExample();
    }
}
