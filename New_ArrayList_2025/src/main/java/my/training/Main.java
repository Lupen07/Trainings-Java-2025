package my.training;

import java.util.ArrayList;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int n = (int) (Math.random() * 11);
            arr.add(n);
        }
        System.out.println("Елемент за індексом 3: " + arr.get(3)); // рамдомно вибирає номер

        // get бере усі числа
        System.out.println("Елементи списку: ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i) + " ");
        }
        System.out.println();

        System.out.println("Чи міститься число 5 у списку: " + arr.contains(5)); // чи міститься елемент зі значенням 5 у списку arr
        System.out.println("Iндекс числа 5: " + arr.indexOf(5)); // повертає індекс числа 5
        System.out.println("Кількість елементів в списку: " + arr.size()); // повертає кількість у списку
        System.out.println("Видалити елементи за індексом 3: " + arr.remove(3));// видаляє елемент за вказаним індекосом

        arr.forEach((y) -> System.out.println(y + " "));
        System.out.println();
        arr.set(1, 5);
        arr.forEach((y) -> System.out.println(y + " "));

        arr.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer y1, Integer y2) {
                return y1 = y1;
            }
        });
        System.out.println();
        arr.forEach((y) -> System.out.println(y + " "));
        System.out.println();

    }
}