package my.training;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {

        Date date = new Date();
        Calendar calendar = new GregorianCalendar();

        System.out.println("This is date today: " + date);

        System.out.println(calendar.getTimeInMillis());
        System.out.println(calendar.getTimeZone());
        calendar.set(1982,06,30,15,30,15);
        System.out.println(calendar.getTimeInMillis());
        calendar.set(GregorianCalendar.YEAR, 2022);
        calendar.set(GregorianCalendar.DAY_OF_MONTH, 5);
        calendar.set(GregorianCalendar.MONTH, 06);
        calendar.set(GregorianCalendar.HOUR, 15);
        calendar.set(GregorianCalendar.MINUTE, 35);
        calendar.set(GregorianCalendar.SECOND, 25);

        System.out.println(calendar.getTimeInMillis());
        System.out.println(calendar.get(GregorianCalendar.YEAR));

        String dates = "16.07.1989 12:30:15";

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        date = dateFormat.parse(dates);

        calendar.setTime(date);

        // один з можливих варіантів

        System.out.println(calendar.get(GregorianCalendar.DAY_OF_MONTH));

        GregorianCalendar calendarToday = new GregorianCalendar();

        int day = calendarToday.get(GregorianCalendar.DAY_OF_MONTH);

        int month = calendarToday.get(GregorianCalendar.MONTH) + 1;

        int year = calendarToday.get(GregorianCalendar.YEAR);


        System.out.println("Сьогоднішня дата: " + day + " місяць: " + month + " рік: " + year);


        LocalDate localDate = LocalDate.now();

        System.out.println("Дата = " + localDate.getDayOfMonth() + " / " + localDate.getMonthValue() + " / " + localDate.getYear());

        System.out.println(new SimpleDateFormat("рік - YYYY / день - dd / місяць - MM : година HH:хвилини mm і ss секунд").format(date));

    }
}