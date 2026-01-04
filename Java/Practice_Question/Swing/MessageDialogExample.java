import javax.swing.*;
public class MessageDialogExample {
    public static void main(String[] args) {

        // ShowMessageDialogExample ==========================================
        // JOptionPane.showMessageDialog(
        //     null,
        //     "Operation Successful!",
        //     "Status",
        //     JOptionPane.INFORMATION_MESSAGE
        // );


        // ShowMessageDialogExample ==========================================
        // String name = JOptionPane.showInputDialog(
        // null,
        // "Enter your name:"
        //  );
        // System.out.println("User entered: " + name);


int result = JOptionPane.showConfirmDialog(
    null,
    "Do you want to continue?",
    "Confirm",
    JOptionPane.YES_NO_CANCEL_OPTION
);
if(result == JOptionPane.YES_OPTION) {
    System.out.println("User selected YES");
} else if(result == JOptionPane.NO_OPTION) {
    System.out.println("User selected NO");
} else {
    System.out.println("User cancelled the operation");
}

}

}
