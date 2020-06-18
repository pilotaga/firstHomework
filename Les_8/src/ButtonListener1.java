import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener1 implements ActionListener {
    private JTextField jTextField;

    public ButtonListener1(JTextField jTextField) {
        this.jTextField = jTextField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jTextField.setText(" ");
    }
}
