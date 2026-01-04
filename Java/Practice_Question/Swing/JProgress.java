import javax.swing.*;

public class JProgress extends JFrame {

    JProgress() {
        setTitle("JList Practice");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JProgressBar bar = new JProgressBar();
        bar.setBounds(100 , 200 , 100 , 10);
        bar.setValue(60);
        add(bar);
        setVisible(true);


    }

    public static void main(String[] args) {
        new JProgress();
    }
}
