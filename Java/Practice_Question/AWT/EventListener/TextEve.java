import java.awt.*;
import java.awt.event.*;
class TextEve extends Frame implements TextListener {
   TextField tf;
   Label lbl = new Label("Typing...");
   TextEve() {
      this.lbl.setBounds(50, 80, 200, 30);
      this.add(this.lbl);
      this.tf = new TextField();
      this.tf.setBounds(50, 40, 200, 30);
      this.add(this.tf);
      this.tf.addTextListener(this);
      this.setLayout((LayoutManager)null);
      this.setSize(300, 200);
      this.setVisible(true);
   }
   public void textValueChanged(TextEvent var1) {
      this.lbl.setText("You typed: " + this.tf.getText());
   }
   public static void main(String[] args) {
      new TextEve();
   }
}
