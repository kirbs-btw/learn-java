package ui;
import javax.swing.*;
import java.awt.event.ActionListener;

public class MainFrame extends javax.swing.JFrame{

    public static void main(String[] args) {
        MainFrame frame=new MainFrame();
        frame.setTitle("Hello World");
        frame.setSize(1000, 620);
        frame.setResizable(false);
        frame.setLocation(50, 50);
        frame.setVisible(true);


        JPanel panel = new JPanel();
        JButton button = new JButton("click");
        panel.add(button);
        frame.add(panel);

        frame.pack();
    }

}


