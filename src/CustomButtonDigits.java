import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.ButtonUI;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;

public class CustomButtonDigits extends JButton {

    CustomButtonDigits(String s) {
        this.setText(s);
        this.setBorder(BorderFactory.createCompoundBorder());
        this.setFocusable(false);
    }
}
