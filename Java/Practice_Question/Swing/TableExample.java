import javax.swing.*;

public class TableExample extends JFrame {

    TableExample() {
        setTitle("JTable Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Table Data and Column Names
        String data[][] = {
            {"101", "Amit"},
            {"102", "Rahul"}
        };
        String col[] = {"ID", "Name"};

        JTable table = new JTable(data, col);

        // ScrollPane for proper UI
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(50, 50, 200, 80);

        add(sp);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TableExample();
    }
}
