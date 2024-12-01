package my.training;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {




//  Блок JFrame

        JFrame frame = new JFrame("COZZY");

        //  Екземпляр MyListener
        MyListener myListener = new MyListener(frame);

        frame.setBounds(600,400,  850, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ImageIcon

        ImageIcon icon = new ImageIcon(Main.class.getResource("/images/jenkins.png"));


//  Перший блок Mеню JMenuBar, JMenu, JMenuItem

        JMenuBar menuBar = new JMenuBar();
        JMenu main = new JMenu("Програма");

        JMenuItem itemExit = new JMenuItem("Вихід");

        main.add(itemExit);
        menuBar.add(main);



//        frame.add(menuBar);


//  Другий блок меню Синій, Жовний додавання його в menuBar

        JMenu bg = new JMenu("Фон");

        JMenuItem blue = new JMenuItem("Cиній");
        JMenuItem yellow = new JMenuItem("Жовтий");

        bg.add(blue);
        bg.add(yellow);
        menuBar.add(bg);

//  Третій блок підменю
        JMenu submenu = new JMenu("Підменю");
        bg.add(submenu);

        JMenuItem subItem =new JMenuItem("НОВИНИ");
        submenu.add(subItem);
        submenu.addSeparator();

//  Чекбокси та інше

        JCheckBox checkBoxItem = new JCheckBox("Чекбокс");
        submenu.add(checkBoxItem);





        frame.setJMenuBar(menuBar);
//  Опрацювання активності

        itemExit.addActionListener(myListener);
        blue.addActionListener(myListener);
        yellow.addActionListener(myListener);
        submenu.addActionListener(myListener);
        subItem.addActionListener(myListener);
        checkBoxItem.addActionListener(myListener);

        // відображаємо в frame icone

        frame.setIconImage(icon.getImage());

        frame.setVisible(true);


    }
}