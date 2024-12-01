package my.training;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener {

    JFrame frame;

    public MyListener(JFrame frame) {
        this.frame = frame;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        String c = e.getActionCommand();
        if(c.equals("Вихід")) {
            System.exit(0);
        } else if (c.equals("Жовтий")) {
            frame.getContentPane().setBackground(Color.YELLOW);
        } else if (c.equals("Cиній")) {
            frame.getContentPane().setBackground(Color.BLUE);
        }


    }
}
