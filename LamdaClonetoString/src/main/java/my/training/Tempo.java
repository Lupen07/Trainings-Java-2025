package my.training;

public class Tempo {
    private String name;
    private String surname;
    private int day;
    private int month;
    private int year;

    public Tempo(String name, String surname, int day, int month, int year) {
        this.name = name;
        this.surname = surname;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return "Name is: " + name
                + ", Surname is: " + surname
                + ", Birthday is: " + day
                + ", Month is: " + month
                + ", Year is: " + year;

    }

}
