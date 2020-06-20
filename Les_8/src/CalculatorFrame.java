import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorFrame extends JFrame {
    public CalculatorFrame(String title) {
        setTitle(title);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(50, 35, 500, 500);
        setVisible(true);

        GridBagLayout gb = new GridBagLayout();
        setLayout(gb);
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 3;
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;
        JTextField jtf = new JTextField("Press some button...");
        gb.setConstraints(jtf, c);
        add(jtf);

        c.gridx = 3;
        c.gridy = 0;
        c.gridwidth = 1;
        JButton jb4 = new JButton("C");
        jb4.addActionListener(new ButtonListener1(jtf));
        gb.setConstraints(jb4, c);
        add(jb4);



        JButton[][] jbs = new JButton[3][3];
        int z = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c.gridx = j;
                c.gridy = i + 1;
                c.gridwidth = 1;
                jbs[i][j] = new JButton(String.valueOf(z));
                jbs[i][j].addActionListener(new ButtonListener(jtf));
                gb.setConstraints(jbs[i][j], c);
                add(jbs[i][j]);
                z++;
            }
        }

        c.gridx = 3;
        c.gridy = 1;
        c.gridwidth = 1;
        JButton jb1 = new JButton("+");
        jb1.addActionListener(new ButtonListener(jtf));
        gb.setConstraints(jb1, c);
        add(jb1);

        c.gridx = 3;
        c.gridy = 2;
        c.gridwidth = 1;
        JButton jb2 = new JButton("-");
        jb2.addActionListener(new ButtonListener(jtf));
        gb.setConstraints(jb2, c);
        add(jb2);

        c.gridx = 3;
        c.gridy = 3;
        c.gridwidth = 1;
        JButton jb3 = new JButton("*");
        jb3.addActionListener(new ButtonListener(jtf));
        gb.setConstraints(jb3, c);
        add(jb3);

        c.gridx = 3;
        c.gridy = 4;
        c.gridwidth = 1;
        JButton jb5 = new JButton("/");
        jb5.addActionListener(new ButtonListener(jtf));
        gb.setConstraints(jb5, c);
        add(jb5);

        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 1;
        JButton jb6 = new JButton("=");
        jb6.addActionListener(new ButtonListener2(jtf));
        gb.setConstraints(jb6, c);
        add(jb6);

        c.gridx = 1;
        c.gridy = 4;
        c.gridwidth = 1;
        JButton jb7 = new JButton("0");
        jb7.addActionListener(new ButtonListener(jtf));
        gb.setConstraints(jb7, c);
        add(jb7);

        c.gridx = 2;
        c.gridy = 4;
        c.gridwidth = 1;
        JButton jb8 = new JButton(".");
        jb8.addActionListener(new ButtonListener(jtf));
        gb.setConstraints(jb8, c);
        add(jb8);

//        c.gridx = 2;
//        c.gridy = 1;
//        c.gridwidth = 1;
//        JButton jb3 = new JButton("3");
//        gb.setConstraints(jb3, c);
//        add(jb3);


//        setLayout(new GridLayout(5, 3));

//        char[] chars = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '0', '-'};
//        for (int i = 0; i < chars.length; i++) {
//            JButton jb = new JButton(String.valueOf(chars[i]));
//            jb.addActionListener(new ButtonListener(jtf));
//            add(jb);
//        }
//
//        JButton singleBtn = new JButton("Single");
//        singleBtn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                setBackground(new Color(0x051607));
//                System.out.println("Clicked on single button");
//            }
//        });
//        add(singleBtn);
    }
}