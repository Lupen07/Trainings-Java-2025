package my.training;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("COZZY");
        frame.setBounds(700,150,500, 800);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(20, 0,0,0)); // відступ

        JLabel labelTaitl = new JLabel("Моя форма");
        labelTaitl.setFont(new Font("Arial", Font.BOLD, 22));
        panel.add(labelTaitl);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout()); // КОМПОНОВЩИК ВАЖЛИВО
        JLabel name = new JLabel("Name: ");
        JTextField nameTextField = new JTextField();
        JLabel surname = new JLabel("Surname: ");
        JTextField surnametextField = new JTextField();
        JLabel email = new JLabel("Email: ");
        JTextField emailTextField = new JTextField();

        // блок вирівнювання
        name.setHorizontalAlignment(SwingConstants.RIGHT);
        surname.setHorizontalAlignment(SwingConstants.RIGHT);
        email.setHorizontalAlignment(SwingConstants.RIGHT);

        nameTextField.setPreferredSize(new Dimension(200,40));
        surnametextField.setPreferredSize(new Dimension(200,40));
        emailTextField.setPreferredSize(new Dimension(200,40));


        nameTextField.setPreferredSize(new Dimension(150,25));
        surnametextField.setPreferredSize(new Dimension(150,25));
        emailTextField.setPreferredSize(new Dimension(150,25));

        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(0,0,10,5);
        panel1.add(name, c);
        c.gridx = 1;
        c.gridy = 0;
        panel1.add(nameTextField, c);
        c.gridx = 0;
        c.gridy = 1;
        panel1.add(surname, c);
        c.gridx = 1;
        c.gridy = 1;
        panel1.add(surnametextField, c);
        c.gridx = 0;
        c.gridy = 2;
        panel1.add(email, c);
        c.gridx = 1;
        c.gridy = 2;
        panel1.add(emailTextField, c);


//        panel1.add(name);
//        panel1.add(nameTextField);
//        panel1.add(surname);
//        panel1.add(surnametextField);
//        panel1.add(email);
//        panel1.add(emailTextField);
//        FlowLayout - розтавляє компоненти один за одним
//        GroupLayout



        JPanel panelButtom = new JPanel();
        JCheckBox news = new JCheckBox("підписатись на наші новини");
        JButton button = new JButton("Відправити");
        button.setPreferredSize(new Dimension(150,25)); // ось так ми відзначаємо ширину і висоту кнопки

        panelButtom.add(news);
        panelButtom.add(button, BorderLayout.SOUTH);
        panelButtom.setBorder(new EmptyBorder(0,0,40,0));


        frame.add(panel, BorderLayout.NORTH);
        frame.add(panel1, BorderLayout.CENTER);
        frame.add(panelButtom, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}