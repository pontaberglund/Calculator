import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {

    Calculator(int width, int height) {
        GridBagLayout frameLayout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        this.setSize(width,height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(true);
        this.setLayout(frameLayout);

        gbc.weightx = 1;
        gbc.gridwidth = 2;
        gbc.weighty = 0.2;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        Screen screen = new Screen();
        this.add(screen, gbc);

        gbc.weightx = 0.7;
        gbc.weighty = 0.8;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.BOTH;
        Digits digits = new Digits(screen);
        this.add(digits, gbc);

        gbc.weightx = 0.3;
        gbc.weighty = 0.8;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.BOTH;
        Operations operations = new Operations(screen);
        this.add(operations, gbc);

        this.revalidate();
        this.repaint();
    }

}
