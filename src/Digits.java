import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Digits extends JPanel {
    Digits(Screen screen) {
        GridLayout layout = new GridLayout(4, 3);
        this.setLayout(layout);
        CustomButtonDigits b1 = new CustomButtonDigits("1");
        CustomButtonDigits b2 = new CustomButtonDigits("2");
        CustomButtonDigits b3 = new CustomButtonDigits("3");
        CustomButtonDigits b4 = new CustomButtonDigits("4");
        CustomButtonDigits b5 = new CustomButtonDigits("5");
        CustomButtonDigits b6 = new CustomButtonDigits("6");
        CustomButtonDigits b7 = new CustomButtonDigits("7");
        CustomButtonDigits b8 = new CustomButtonDigits("8");
        CustomButtonDigits b9 = new CustomButtonDigits("9");
        CustomButtonDigits b10 = new CustomButtonDigits(".");
        CustomButtonDigits b11 = new CustomButtonDigits("0");
        CustomButtonDigits b12 = new CustomButtonDigits("Del");

        b1.addActionListener(CustomActionListener.generateActionListener(screen,"1"));
        b2.addActionListener(CustomActionListener.generateActionListener(screen,"2"));
        b3.addActionListener(CustomActionListener.generateActionListener(screen,"3"));
        b4.addActionListener(CustomActionListener.generateActionListener(screen,"4"));
        b5.addActionListener(CustomActionListener.generateActionListener(screen,"5"));
        b6.addActionListener(CustomActionListener.generateActionListener(screen,"6"));
        b7.addActionListener(CustomActionListener.generateActionListener(screen,"7"));
        b8.addActionListener(CustomActionListener.generateActionListener(screen,"8"));
        b9.addActionListener(CustomActionListener.generateActionListener(screen,"9"));
        b10.addActionListener(CustomActionListener.generateActionListener(screen,","));
        b11.addActionListener(CustomActionListener.generateActionListener(screen,"0"));
        b12.addActionListener(CustomActionListener.generateActionListener(screen,"Del"));

        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(b7);
        this.add(b8);
        this.add(b9);
        this.add(b10);
        this.add(b11);
        this.add(b12);
    }
}
