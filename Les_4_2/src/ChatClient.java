import javax.swing.*;
import java.awt.*;

public class ChatClient extends JFrame {

    public ChatClient(String title) throws HeadlessException {
        super(title);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(50, 35, 500, 500);
        setVisible(true);
        createLayout();
    }

    public void createLayout() {
//        BorderLayout bl = new BorderLayout();
//        setLayout(bl);
//
//        JTextArea chatField = new JTextArea("Welcome to our chat!");
//        JScrollPane chatScroll = new JScrollPane(chatField);
//
//        JTextField messageField = new JTextField("Enter your message, please!");
//        JButton sendButton = new JButton("Send");
//
//        add(chatScroll, BorderLayout.NORTH);
//        add(messageField, BorderLayout.CENTER);
//        add(sendButton, BorderLayout.SOUTH);

        GridBagLayout gb = new GridBagLayout();
        setLayout(gb);
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;
        JTextArea chatArea = new JTextArea("Welcome to our chat!");
        JScrollPane chatScroll = new JScrollPane(chatArea);
        gb.setConstraints(chatScroll, c);
        add(chatScroll);

        c.gridy = 4;
        c.weighty = 0.25;
        JTextField messageField = new JTextField("Enter your message, please!");
        messageField.addActionListener(new MessageFieldListener(chatArea, messageField));
        JScrollPane messageScroll = new JScrollPane(messageField);
        gb.setConstraints(messageScroll, c);
        add(messageScroll);

        c.gridy = 5;
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new SendButtonListener(chatArea, messageField));
        gb.setConstraints(sendButton, c);
        add(sendButton);
    }

}
