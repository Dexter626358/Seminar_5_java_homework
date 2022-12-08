package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

// Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.
public class Task1 {
    public static void main(String[] args) {
        List<String> names = List.of(new String[]{"Зезюлин Дмитрий", "Боюр Николай", "Горюнова Евгения",
                "Ведентьева Елена", "Немова Анжелика", "Пармехина Элина", "Иннокентьев Марсель", "Чубыкин Петр",
                "Бобринская Жанна", "Бекишева Виктория"});
        List<String> homePhones = List.of(new String[]{"+7(181)438855", "null", "+7(45)522574", "+7(819)976568",
                "null", "+7(3898)248796", "null", "null", "+7(6074)427203", "null"});
        List<String> workingPhones = List.of(new String[]{"+7(703)461659", "+7(86)456076", "null", "+7(248)947606",
                "null", "+7(606)812337", "null", "+7(4053)189616", "+7(845)792512", "+7(88)518282"});
        List<String> mobilePhones = List.of(new String[]{"+7(909)662-81-8577", "+7(909)124-41-6698", "+7(909)897-09-2720",
                "+7(909)877-05-8915", "+7(909)669-00-0679", "+7(909)784-58-3766", "+7(909)744-45-0342",
                "+7(909)184-09-5163", "+7(909)109-55-8935", "+7(909)020-47-5500"});
        HashMap<String, HashMap<String, String>> phoneBook= new HashMap<>();
        HashMap<String, String> phones = new HashMap<>();
        for (int i = 0; i < mobilePhones.size(); i++) {
            phones.put("Домашний", homePhones.get(i));
            phones.put("Мобильный", mobilePhones.get(i));
            phones.put("Рабочий", workingPhones.get(i));
            phoneBook.put(names.get(i), phones);
        }

        for (String key: phoneBook.keySet())
        {
            System.out.println(key + " --> " + phoneBook.get(key));
        }




    }
}