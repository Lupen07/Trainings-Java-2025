package my.training;

import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;

public class User {
    private  String name;
    private String surname;
    private String email;
    private boolean checkBox;
    private static ArrayList<User> users = new ArrayList<>(); // статичний належить класу, а не об'єкту

    public User (String name, String surname, String email, boolean checkBox) throws UserExeption {

        if (name.length() == 0 ) throw new UserExeption(UserExeption.NO_NAME);
        if (surname.length() == 0 ) throw new UserExeption(UserExeption.NO_SURNAME);
        if (email.length() == 0 ) throw new UserExeption(UserExeption.NO_EMAIL);

        this.name = name;
        this.surname = surname;
        this.email = email;
        this.checkBox = checkBox;
    }

    public static void add(User user) {
        users.add(user);
    }

    public static void printAllUsers() {
        users.forEach((u) -> System.out.println(u));
    }

    public String toString() {
        return "ім'я та прізвище користувача: " + name + " " + surname + " емейл користувача: " + email + " чи був поставлений чекбокс : " + checkBox;
    }
}
