import javax.swing.*;

public class JTextAreaExample { // class name must match file name
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextArea Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JTextArea textArea = new JTextArea();
        textArea.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 14));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        textArea.setText("Hello! This is a JTextArea.\n");


        textArea.setEditable(false);

        frame.add(new JScrollPane(textArea));
        frame.setVisible(true);
    }
}
