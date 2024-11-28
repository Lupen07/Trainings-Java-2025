package my.training;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    private JTextField textFieldName;
    private JTextField textFieldSurname;
    private JTextField textFieldEmail;
    private JCheckBox checkBox;

    public MyFrame() {
        super("COZZY");
        setBounds(700,150, 500, 800);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout()); // North (top), South (bottom), East (right), West (left), Center (middle)

// Block

        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(20,0,0,0));

        JLabel labelTitle = new JLabel("MY FORM");
        labelTitle.setFont(new Font("Arial", Font.BOLD, 22));
        panel.add(labelTitle);

// Block
        JPanel panelOne = new JPanel(); // панель
        panelOne.setLayout(new GridBagLayout()); // менеджер компонування GridBagLayout

        JLabel name = new JLabel("Name: ");
        textFieldName = new JTextField(); // текстові поля

        JLabel surname = new JLabel("Surname: ");
        textFieldSurname = new JTextField(); // текстові поля

        JLabel email = new JLabel("Email: ");
        textFieldEmail = new JTextField(); // текстові поля

// Bolck - встановлює бажаний розмір текстових полів

        textFieldName.setPreferredSize(new Dimension(200, 40));
        textFieldSurname.setPreferredSize(new Dimension(200, 40));
        textFieldEmail.setPreferredSize(new Dimension(200,40));

        textFieldName.setPreferredSize(new Dimension(150, 25));
        textFieldSurname.setPreferredSize(new Dimension(150, 25));
        textFieldEmail.setPreferredSize(new Dimension(150,25));

// Block - створює новий об'єкт налаштувань для GridBagLayout

        GridBagConstraints constricts = new GridBagConstraints(); // створює об'єкт для точного керування розташуванням компонентів у GridBagLayout

        constricts.fill = GridBagConstraints.BOTH; // розтягує компоненти по горизонталі та вертикалі в комірці сітки
        constricts.insets = new Insets(0, 0, 10, 5); // додає відступ навкло компонентів (Insets(зверху, зліва, знизу, справа))


// Block name

        constricts.gridx = 0; // перший стовпчик //
        constricts.gridy = 0; // перший рядок
        panelOne.add(name, constricts);


// Block textFildName

        constricts.gridx = 1;  // 1.0 це 2 комірка у першому рядку
        constricts.gridy = 0;
        panelOne.add(textFieldName, constricts);


// Block surname

        constricts.gridx = 0;
        constricts.gridy = 1;
        panelOne.add(surname, constricts);


// Block textFildSurname

        constricts.gridx = 1;
        constricts.gridy = 1;
        panelOne.add(textFieldSurname, constricts);

// Block email

        constricts.gridx = 0;
        constricts.gridy = 2;
        panelOne.add(email, constricts);

// Block textFildEmail

        constricts.gridx = 1;
        constricts.gridy = 2;
        panelOne.add(textFieldEmail, constricts);

// Block JPanel panelButton

        JPanel panelButton = new JPanel();

// Block JPanel button

        JButton sendButton = new JButton("Send");
        sendButton.setPreferredSize(new Dimension(150, 25));

// Block CheckBox

        checkBox = new JCheckBox("Suscraibe to oure news please: ");

// Blocks panels to add

        panelButton.add(checkBox);
        panelButton.add(sendButton, BorderLayout.SOUTH);

        panelButton.setBorder(new EmptyBorder(0,0,40,0));


// Blocks of frame

        add(panel, BorderLayout.NORTH);
        add(panelOne, BorderLayout.CENTER);
        add(panelButton, BorderLayout.SOUTH);

// Опрацювання подій кнопки sendButton

        sendButton.addActionListener(this);
        checkBox.addActionListener(this);

/*        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.GREEN);
                panelOne.setBackground(Color.YELLOW);
                panelButton.setBackground(Color.BLUE);
                labelTitle.setForeground(Color.BLACK);


            }
        }); */

        /* (0,0)  (1,0)  (2,0) ...
           (0,1)  (1,1)  (2,1) ...
           (0,2)  (1,2)  (2,2) ... */
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        if (e.getActionCommand().equals("Suscraibe to oure news please: ")) {
            System.out.println("Натиснутий чекбокс!");
        } else if (e.getActionCommand().equals("Send")) {
            System.out.println("Натиснута кнопка!");
            String name = textFieldName.getText();
            String surname = textFieldSurname.getText();
            String email = textFieldEmail.getText();
            boolean checkBoxNews = checkBox.isSelected();
            try {
                User user = new User(name, surname, email, checkBoxNews);
                User.add(user);
                User.printAllUsers();
            } catch (UserExeption ex) {
                if (ex.getCode() == UserExeption.NO_NAME) showError("Ваше і'мя введено не вірно!");
                else if (ex.getCode() == UserExeption.NO_SURNAME) showError("Ваше прізвище введено невірно!");
                else if (ex.getCode() == UserExeption.NO_EMAIL) showError("Ваш емейл введено не вірно!");
            }
        }
    }
    private void showError(String text) {
        JOptionPane.showMessageDialog(this, text, "Помилка: ", JOptionPane.ERROR_MESSAGE);
    }
}