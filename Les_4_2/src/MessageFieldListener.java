import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MessageFieldListener implements ActionListener {

    private JTextArea chatArea;
    private JTextField messageField;

    public MessageFieldListener(JTextArea chatArea, JTextField messageField) {
        this.chatArea = chatArea;
        this.messageField = messageField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (chatArea.getText().equals("Welcome to our chat!")){
            chatArea.setText("");
            chatArea.append(messageField.getText());
        } else {
            chatArea.append("\n" + messageField.getText());
        }
    }
}
