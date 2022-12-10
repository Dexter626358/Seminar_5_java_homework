package org.example;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
Пусть дан список сотрудников:Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин,
Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова,
Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
 Отсортировать по убыванию популярности.
 */
public class SortStaff {
    public static void main(String[] args){
        String[] staff = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин",
                "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова",
                "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"};
        ArrayList<String> names = new ArrayList<>();
        for (String item: staff) {
            var data = List.of(item.split(" "));
            names.add(data.get(0));
        }
        HashMap<String, Integer> countNames = new HashMap<>();
        for (String name: names) {
            countNames.put(name, Collections.frequency(names, name));
        }
        Map<String, Integer> sortedCountNames =  countNames.entrySet().stream().sorted(Comparator.comparingInt(e->-e.getValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> {throw new AssertionError();}, LinkedHashMap::new));
        for (Map.Entry entry: sortedCountNames.entrySet()) {
            if(!(entry.getValue().equals(1))){
                System.out.println(entry.getKey() +" "+entry.getValue());
            }
        }


    }



}
