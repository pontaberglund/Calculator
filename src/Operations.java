import javax.swing.*;
import java.awt.*;

public class Operations extends JPanel {
    Operations(Screen screen) {
        GridLayout layout = new GridLayout(5, 1);
        this.setLayout(layout);
        CustomButtonOperations b1 = new CustomButtonOperations("+");
        CustomButtonOperations b2 = new CustomButtonOperations("-");
        CustomButtonOperations b3 = new CustomButtonOperations("*");
        CustomButtonOperations b4 = new CustomButtonOperations("/");
        CustomButtonOperations b5 = new CustomButtonOperations("=");

        b1.addActionListener(CustomActionListener.generateActionListener(screen,"+"));
        b2.addActionListener(CustomActionListener.generateActionListener(screen,"-"));
        b3.addActionListener(CustomActionListener.generateActionListener(screen,"*"));
        b4.addActionListener(CustomActionListener.generateActionListener(screen,"/"));
        b5.addActionListener(CustomActionListener.generateActionListener(screen,"="));

        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
    }
}
