package com.company;
import java.awt.Dimension;
import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.WindowConstants;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class UserInterface1 implements Runnable {
    private JFrame frame;
    public UserInterface1(){}
    @Override
    public void run(){
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(200, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }
    private void createComponents(Container container){
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        container.add(new JLabel("Are you?"));
        JCheckBox yes = new JCheckBox("Yes!");
        JCheckBox no = new JCheckBox("No!");

        container.add(yes);
        container.add(no);

        container.add(new JLabel("Why"));
        JRadioButton no_reason = new JRadioButton("No reason");
        JRadioButton fun = new JRadioButton("Because it is fun!");
        ButtonGroup buttonGroupRadio = new ButtonGroup();
        buttonGroupRadio.add(no_reason);
        buttonGroupRadio.add(fun);
        container.add(no_reason);
        container.add(fun);
        JButton button = new JButton("Done!");
        container.add(button);
    }

}