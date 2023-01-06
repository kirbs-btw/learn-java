package ui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Window {

    public static void main(String[] args) {
        JFrame window = new JFrame("Hello World");


        JLabel someText = new JLabel("Hello dear Guest");
        window.add(someText);

        JButton clickButton = new JButton("click");
        clickButton.setPreferredSize(new Dimension(50, 50));
        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hello world!!");
            }
        });
        window.setSize(400, 300);
        window.setMinimumSize(new Dimension(300, 300));
        window.add(clickButton);
        window.setVisible(true);

    }

}