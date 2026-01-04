import javax.swing.*;

public class MyJList extends JFrame {

    MyJList() {
        setTitle("JList Practice");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String fruits[] = {"Apple", "Banana", "Mango"};
        JList<String> list = new JList<>(fruits);

        list.setBounds(50, 50, 100, 80);
        add(list);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MyJList();
    }
}
