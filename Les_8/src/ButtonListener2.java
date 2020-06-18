import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ButtonListener2 implements ActionListener {
    private JTextField jTextField;
    private StringBuilder digit1;
    private StringBuilder digit2;
    private double digit11;
    private double digit22;

    private char operator;

    public ButtonListener2(JTextField jTextField) {
        this.jTextField = jTextField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //List charList = new List();
       // char[] ch = new char[jTextField.getText().length()];
        char[] operators = new char[]{ '+', '-', '*', '/'};
        char[] ch = jTextField.getText().toCharArray();
        String[] parts = jTextField.getText().split("\\W");


        for (int i = 1; i < ch.length; i++ ){
            if(((ch[i]>='0') && (ch[i]<='9'))||(ch[i] == '.')) {
            } else {
                operator = ch[i];
                i++;
                while (i < ch.length )
                {
                    i++;
                }
            }
        }

        digit11 = Double.valueOf(parts[1]);
        digit22 = Double.valueOf(parts[2]);

        switch (operator){
            case ('+'):
                jTextField.setText(Double.toString(digit11 + digit22));
                break;
            case ('-'):
                jTextField.setText(Double.toString(digit11 - digit22));
                break;
            case ('*'):
                jTextField.setText(Double.toString(digit11 * digit22));
                break;
            case ('/'):
                jTextField.setText(Double.toString(digit11 / digit22));
                break;
        }


        //jTextField.setText(jTextField.getText() + jButton.getText());
    }
}
