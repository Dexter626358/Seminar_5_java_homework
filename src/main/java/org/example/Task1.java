package org.example;

import java.lang.reflect.Array;
import java.util.*;

// Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.
public class Task1 {
    public static void main(String[] args) {
        String[] names = {"Зезюлин Дмитрий", "Боюр Николай", "Горюнова Евгения",
                "Ведентьева Елена", "Немова Анжелика", "Пармехина Элина", "Иннокентьев Марсель", "Чубыкин Петр",
                "Бобринская Жанна", "Бекишева Виктория"};
        String[] homePhones = {"+7(181)438855", "null", "+7(45)522574", "+7(819)976568",
                "null", "+7(3898)248796", "null", "null", "+7(6074)427203", "null"};
        String[] workingPhones = {"+7(703)461659", "+7(86)456076", "null", "+7(248)947606",
                "null", "+7(606)812337", "null", "+7(4053)189616", "+7(845)792512", "+7(88)518282"};
        String[] mobilePhones = {"+7(909)662-81-8577", "+7(909)124-41-6698", "+7(909)897-09-2720",
                "+7(909)877-05-8915", "+7(909)669-00-0679", "+7(909)784-58-3766", "+7(909)744-45-0342",
                "+7(909)184-09-5163", "+7(909)109-55-8935", "+7(909)020-47-5500"};
        Map<String, Map<String, List<String>>> phoneBook = new HashMap<>();
        for (int i = 0; i < mobilePhones.length; i++) {
            Map<String, List<String>> phoneList= new HashMap<>();
            if(!workingPhones[i].equals("null")){
                phoneList.put("work", List.of(workingPhones[i]));
            }
            if(!mobilePhones[i].equals("null")){
                phoneList.put("mobile", List.of(mobilePhones[i]));
            }
            if(!homePhones[i].equals("null")){
                phoneList.put("home", List.of(homePhones[i]));
            }
            phoneBook.put(names[i], phoneList);
        }
        for (Map.Entry entry: phoneBook.entrySet()) {
                System.out.println(entry.getKey() +" "+entry.getValue());
            }
    }
}