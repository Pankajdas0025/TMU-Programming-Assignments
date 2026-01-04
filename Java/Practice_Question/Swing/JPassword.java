import javax.swing.*;
public class JPassword extends JFrame {
    JPassword() {
        setTitle("JPassword Practice!");
        setSize(40, 500);
        setLayout(null);
        JLabel label = new JLabel("Enter Your Password -");
        JPasswordField pass = new JPasswordField(20);
        label.setBounds(50,50,150,30);
        pass.setBounds(200 , 50 , 80 , 30 );
        add(label);
        add(pass);
        setVisible(true);
    }
    public static void main(String[] args) {
    new JPassword();
    }
}
