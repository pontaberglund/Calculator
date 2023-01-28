import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomActionListener{
    public static ActionListener generateActionListener(Screen screen, String newChar) {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                screen.updateScreen(newChar);
            }
        };
    }
}
