import java.awt.*;
import java.awt.event.*;

class AwtDemo extends Frame {

    AwtDemo() {

        setTitle("AWT Components Demo");
        setSize(600, 600);
        setLayout(null);

        // Label
        Label lbl = new Label("Enter Your Name :-");
        lbl.setBounds(50, 50, 150, 30);
        add(lbl);

        // TextField
        TextField tf = new TextField();
        tf.setBounds(200, 50, 150, 30);
        add(tf);

        // Button
        Button btn = new Button("Submit");
        btn.setBounds(200, 100, 80, 30);
        add(btn);

        // CheckboxGroup (Radio Buttons)
        CheckboxGroup genderGroup = new CheckboxGroup();
        Checkbox male = new Checkbox("Male", genderGroup, false);
        Checkbox female = new Checkbox("Female", genderGroup, false);

        male.setBounds(50, 150, 80, 30);
        female.setBounds(150, 150, 80, 30);

        add(male);
        add(female);

        // Checkbox (Independent)
        Checkbox agree = new Checkbox("I Agree Terms");
        agree.setBounds(50, 190, 150, 30);
        add(agree);

        // Choice (Dropdown)
        Choice choice = new Choice();
        choice.add("Java");
        choice.add("Python");
        choice.add("C++");
        choice.setBounds(50, 230, 120, 30);
        add(choice);

        // List
        List lst = new List(3);
        lst.add("Red");
        lst.add("Green");
        lst.add("Blue");
        lst.setBounds(200, 230, 100, 80);
        add(lst);

        // Scrollbar
        Scrollbar sb = new Scrollbar(Scrollbar.HORIZONTAL, 20, 10, 0, 100);
        sb.setBounds(50, 320, 150, 20);
        add(sb);

        // Canvas
        Canvas cnv = new Canvas();
        cnv.setBackground(Color.LIGHT_GRAY);
        cnv.setBounds(350, 50, 150, 150);
        add(cnv);

        // Panel
        Panel panel = new Panel();
        panel.setBackground(Color.CYAN);
        panel.setBounds(50, 360, 200, 80);
        panel.add(new Label("Inside Panel"));
        add(panel);

        // Menu & MenuItem
        MenuBar mb = new MenuBar();
        Menu fileMenu = new Menu("File");
        MenuItem exitItem = new MenuItem("Exit");
        fileMenu.add(exitItem);
        mb.add(fileMenu);
        setMenuBar(mb);

        // PopupMenu
        PopupMenu popup = new PopupMenu();
        MenuItem cut = new MenuItem("Cut");
        MenuItem copy = new MenuItem("Copy");
        MenuItem paste = new MenuItem("Paste");
        popup.add(cut);
        popup.add(copy);
        popup.add(paste);
        add(popup);

        addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popup.show(AwtDemo.this, e.getX(), e.getY());
                }
            }
        });

        // Toolkit Example (Get screen size)
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("Screen Size: " + d.width + "x" + d.height);

        setVisible(true);
    }

    public static void main(String[] args) {
        new AwtDemo();
    }
}
