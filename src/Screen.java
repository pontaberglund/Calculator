import javax.swing.*;
import java.awt.*;

public class Screen extends JPanel {
    String output = " ";
    JLabel label;
    Screen() {
        this.setLayout(new GridBagLayout());
        this.label = new JLabel(output);
        this.add(label);
        label.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
    }

    public void updateScreen(String newChar) {

        if(newChar.equals("Del") && !output.isBlank()) {
          StringBuilder sb = new StringBuilder(output);
          sb.deleteCharAt(sb.length()-1);
          output = sb.toString();
        } else  if(newChar.equals("=")) {
            output = MathWithString.mathWithString(output);
        }else if(!newChar.equals("Del"))
            output+=newChar;

        label.setText(output);
        this.removeAll();
        this.add(label);
        this.revalidate();
        this.repaint();
    }
}
