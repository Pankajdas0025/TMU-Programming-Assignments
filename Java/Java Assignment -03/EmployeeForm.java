// File: EmployeeForm.java
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class EmployeeForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Employee Form");
        frame.setSize(400, 300);
        frame.setLayout(null);

        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(50, 50, 80, 25);
        JTextField txtName = new JTextField();
        txtName.setBounds(150, 50, 150, 25);

        JLabel lblAge = new JLabel("Age:");
        lblAge.setBounds(50, 100, 80, 25);
        JTextField txtAge = new JTextField();
        txtAge.setBounds(150, 100, 150, 25);

        JButton btnAdd = new JButton("Add Employee");
        btnAdd.setBounds(120, 180, 150, 30);

        frame.add(lblName);
        frame.add(txtName);
        frame.add(lblAge);
        frame.add(txtAge);
        frame.add(btnAdd);

        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = txtName.getText();
                int age = Integer.parseInt(txtAge.getText());

                try {
                    Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/testdb", "root", "password");
                    String sql = "INSERT INTO employee(name, age) VALUES(?, ?)";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, name);
                    pstmt.setInt(2, age);
                    int rows = pstmt.executeUpdate();

                    if(rows > 0) {
                        JOptionPane.showMessageDialog(frame, "Employee added successfully!");
                    }

                    pstmt.close();
                    conn.close();
                } catch(Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage());
                }
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
