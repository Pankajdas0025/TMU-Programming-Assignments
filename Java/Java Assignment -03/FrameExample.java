import javax.swing.*;

public class FrameExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Create this frame Using JFrame");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Using absolute positioning

        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(20, 20, 80, 25);
        frame.add(lblName);

        JTextField txtName = new JTextField();
        txtName.setBounds(100, 20, 150, 25);
        frame.add(txtName);

        JLabel lblAge = new JLabel("Age:");
        lblAge.setBounds(20, 60, 80, 25);
        frame.add(lblAge);

        JTextField txtAge = new JTextField();
        txtAge.setBounds(100, 60, 150, 25);
        frame.add(txtAge);

        JButton btnOk = new JButton("OK");
        btnOk.setBounds(50, 120, 80, 30);
        frame.add(btnOk);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.setBounds(150, 120, 80, 30);
        frame.add(btnCancel);

        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }
}
