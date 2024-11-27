package my.training;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dimension;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("COZZY");
//        Dimension size = Toolkit.getDefaultToolkit().getScreenSize(); // цей створений об'єкт довзоляє  розширювати на весь екран за допомогою метода getScreenSize()
//        frame.setBounds(0, 0, size.width, size.height); // ось так можна розлишити вікно на весь екран
//        frame.setLocation(0,0); // позиція
//        frame.setSize(size); // розмір
        frame.setBounds(700, 150, 500, 800);
        frame.setResizable(false); // якщо ставимо true то зможе регулювати, а якщо ставимо false, то не зможе
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // буде закривати програму при закриттю вікна
        frame.setVisible(true); //  робимо frame відображаємим true відображається, і false ніg
    }
}