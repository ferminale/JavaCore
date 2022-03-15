package HW4;

import java.util.*;

public class HW4 {
    public static void main(String[] args) {
        String[] fruit = {"one", "two", "three", "four", "four", "five", "six", "four", "seven", "nine", "one"};
        HashMap<String, Integer> fetus = new HashMap<>();
        for (String x : fruit) {
            fetus.put(x, fetus.getOrDefault(x,0)+1);
        }
        System.out.println(fetus);

        Phonebook book = new Phonebook();
        book.addContact("Сергей", "9991113322");
        book.addContact("Абрикос", "9992224433");
        book.addContact("Нина", "9993334433");
        book.addContact("Нина", "9994445555");
        book.addContact("Абрикос", "9995556363");
        book.addContact("Фиолентий", "9991234567");


        book.getContact("Сергей");
        book.getContact("Нина");
        book.getContact("Фиолентий");

    }
}