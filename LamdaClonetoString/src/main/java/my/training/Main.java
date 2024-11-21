package my.training;

import java.math.BigDecimal;
import java.math.RoundingMode;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tempo tempoPersona = new Tempo("Matteo", "Zanetti", 21, 7, 1982);

        String result = tempoPersona.toString();
        System.out.println(result);

        // клас String
        char[] cArr = {'a', 'b', 'c', 'd'};
        String st1 = new String(cArr);
        System.out.println(st1);

        String st2 = "My new string";
        String st3 = "My new string";

        System.out.println(st2.charAt(1)); // за індексом виводимо
        System.out.println(st2.equals(st3)); // equals походить від класу object
        System.out.println(st2.startsWith("XMy new"));
        System.out.println(st2.endsWith("ing"));
        System.out.println(st2.indexOf("str")); // показує з якого індексу починається
        System.out.println(st2.indexOf("dhsodhrfd")); // якщо такий рядок не знайдений, то поверне -1
        System.out.println(st2.length());
        System.out.println(st2.replace('y', 's'));
        System.out.println(st2.substring(6));
        System.out.println(st2.toLowerCase());
        System.out.println(st2.toUpperCase());

        String usarData ="                 info@gmail.com             ";
        System.out.println(usarData.trim()); // trim забирає пробіли до і після

        // Клас Math

        System.out.println(Math.E);
        System.out.println(Math.PI);
        System.out.println(Math.abs(-5)); // модуль завжди повертає позитивне число  -5 = 5 ну і 5 теж = 5
        System.out.println(Math.cos(1)); //  всі параметри підславляються в радіанах
        System.out.println(Math.tan(1));
        System.out.println(Math.sin(1));
        // якщо з якоїсь причини необхідно вичислити sin 30 градусів, ну ми знаємо,
        // що sin 30% це 0.5 десятих, а це одна других.
        // Що ж ми робимо?
        System.out.println(Math.sin(Math.PI / 180));

        double di = Math.pow(2, 3); // 2 ^ 3 = 8 число а підносить до степеня b 2 * 2 = 4 * 2 = 8
        System.out.println("POW: " + Math.pow(5, 2)); // 5 *  5 = 25

        System.out.println("resutl: " + di);

        System.out.println(Math.max(26, 44));
        System.out.println(Math.min(33, 7));

        System.out.println(Math.round(2.7)); // заокруглює

        System.out.println(Math.ceil(5.2)); // заокруглюэ до найближчого верхнього цілого

        System.out.println(Math.floor(5.99)); // просто відкидає дробну частину, і заокруглює до найближчого нижнього цілого

        BigDecimal baseData = new BigDecimal( 5.7754045);

        System.out.println( baseData.setScale(1, RoundingMode.HALF_DOWN));

        //* RoundingMode.FLOOR — округляє в меншу сторону.
        //  RoundingMode.CEILING — округляє в більшу сторону.
        //  RoundingMode.HALF_DOWN — округляє в меншу сторону,
        //  якщо число після десяткової крапки менше 0.5, і в більшу сторону, якщо більше.

        System.out.println((new BigDecimal(5.745677)).setScale(1, RoundingMode.HALF_UP));

        System.out.println(Math.random()); // генерує випадкове число

        int i =  (int) (Math.random() * 11); // double
        // double i =  Math.random() * 11;
        // int i =  (int) (1 + Math.random() * 10);

        System.out.println(i);


    }
}