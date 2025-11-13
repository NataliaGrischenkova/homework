package hwstream;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {3, 8, 1, 5, 12, 7, 4, 10};

        // найти максимальное значение
        int max = Arrays.stream(numbers).max().getAsInt();
        System.out.println("Максимальное значение: " + max);

        // найти минимальное значение
        int min = Arrays.stream(numbers).min().getAsInt();
        System.out.println("Минимальное значение: " + min);

        // вывести сумму всех четных чисел
        int sumEven = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .sum();
        System.out.println("Сумма всех четных чисел: " + sumEven);

        // распечатать все элементы начиная с 5
        System.out.println("Элементы начиная с 5:");
        Arrays.stream(numbers)
                .skip(4)
                .forEach(System.out::println);

        // Создать пример показанный в классе:
        List<Parent> parents = Arrays.asList(
                new Parent("Parent1", 35, Arrays.asList(
                        new Child("Child11", 5, true),
                        new Child("Child12", 4, false)
                )),
                new Parent("Parent2", 40, Arrays.asList(
                        new Child("Child21", 20, false),
                        new Child("Child22", 15, true),
                        new Child("Child23", 30, true)
                )),
                new Parent("Parent3", 50, Arrays.asList(
                        new Child("Child31", 25, true),
                        new Child("Child33", 20, true),
                        new Child("Child33", 15, false),
                        new Child("Child34", 10, false)
                ))
        );

        // распечатать всех детей в имени которых есть 2
        System.out.println("Дети в имени которых есть 2:");
        parents.stream()
                .flatMap(parent -> parent.getChilds().stream())
                .filter(child -> child.getName().contains("2"))
                .forEach(child -> System.out.println(child.getName()));

        // найти всех родителей у которых детей больше 3
        System.out.println("родителей у которых детей больше 3:");
        parents.stream()
                .filter(parent -> parent.getChilds().size() > 3)
                .forEach(System.out::println);

        // вывести всех мальчиков
        System.out.println("Мальчики:");
        parents.stream()
                .flatMap(parent -> parent.getChilds().stream())
                .filter(child -> child.isMan())
                .forEach(System.out::println);

        // вывести всех девочек
        System.out.println("Девочки:");
        parents.stream()
                .flatMap(parent -> parent.getChilds().stream())
                .filter(child -> !child.isMan())
                .forEach(System.out::println);

        // вывести все имена детей большими буквами (toUpperCase)
        System.out.println("Все имена детей большими буквами:");
        parents.stream()
                .flatMap(parent -> parent.getChilds().stream())
                .map(child -> child.getName().toUpperCase())
                .forEach(System.out::println);

        // найти сколько всего детей у всех родителей
        long sumKids = parents.stream()
                .mapToLong(parent -> parent.getChilds().size())
                .sum();
        System.out.println("Сколько всего детей у всех родителей: " + sumKids);

        // создать map, где ключ - имя родителя, а значение - количество детей
        System.out.println("map, где ключ - имя родителя, а значение - количество детей:");
        Map<String, Integer> map = parents.stream()
                .collect(Collectors.toMap(Parent::getName, parent -> parent.getChilds().size() ));
        System.out.println(map);
    }
}
