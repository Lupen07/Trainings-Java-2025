package my.training;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("COZZY");
        frame.setBounds(700,150, 500, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(); // основна панель на яку добавляються усі кнопки

        JButton button = new JButton("кнопка");
        panel.add(button);


        JLabel lable = new JLabel("текст мітки");
        panel.add(lable);

        JCheckBox  checkBox = new JCheckBox("текст чекбокса");
        panel.add(checkBox);

        JTextField textField = new JTextField("текстове поле"); // текстове поле для пароля наприклад
        panel.add(textField);


        ButtonGroup buttonGroup = new ButtonGroup(); // цей об'єкт відповідає за групи -> щоб кнопки були залежні
        // і щоб можна було вибрати лише одну з трьох кнопок


        JRadioButton radioButton1 = new JRadioButton("Радіо-кнопки 1");
        JRadioButton radioButton2 = new JRadioButton("Радіо-кнопки 2");
        JRadioButton radioButton3 = new JRadioButton("Радіо-кнопки 3");
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(radioButton3);

        JTextArea textArea = new JTextArea("Текст в текстовій області"); // область для введення тексту
        panel.add(textArea);

        String[][] data = {{"1", "2"},{"18", "23"},{"18", "23"},{"18", "23"},{"18", "23"},
                {"18", "23"},{"18", "23"},{"18", "23"},{"18", "23"},{"18", "23"},{"18", "23"},
                {"18", "23"},{"18", "23"},{"18", "23"},{"18", "23"} ,{"18", "23"} ,{"18", "23"},
                {"18", "23"} ,{"18", "23"} ,{"18", "23"} ,{"18", "23"} ,{"18", "23"} ,{"18", "23"},
                {"18", "23"},{"18", "23"}, {"18", "23"},{"18", "23"},{"18", "23"},{"18", "23"},
                {"18", "23"},{"18", "23"},{"18", "23"} };

        String[] cols = {"cтовпчик один", "стовпчик два"};

        JTable table = new JTable(data, cols);

        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane);



        frame.add(panel);
        frame.setVisible(true);
    }
}