import javax.swing.*;
import java.awt.*;

public class CustomButtonOperations extends JButton {
    CustomButtonOperations(String s) {
        this.setText(s);
        this.setBorder(BorderFactory.createCompoundBorder());
        this.setFocusable(false);
    }
}
