package ui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// it's difficult to find the right way
// to do it in Java

// there are many options 


class Window {

    static JFrame frame;


    static int count = 0;

    public static void displaySome(){
        System.out.println(count);
        count++;
    }

    public static void main(String[] args) {
        frame = new JFrame("Hello World");

        JButton button = new JButton("click");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displaySome();
            }
        });

        frame.add(button);
        frame.setSize(400, 400);
        frame.show();
    }

}
