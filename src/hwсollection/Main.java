package hwсollection;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("Анна", Gender.FEMALE, 25));
        users.add(new User("Андрей", Gender.MALE, 30));
        users.add(new User("Алиса", Gender.FEMALE, 25));
        users.add(new User("Иван", Gender.MALE, 22));

        UserService service = new UserService();

        System.out.println("Все пользователи:");
        System.out.println(users);

        System.out.println("Поиск по имени 'Анна':");
        System.out.println(service.findByName(users, "Анна"));

        System.out.println("Все женщины:");
        System.out.println(service.findByGender(users, Gender.FEMALE));

        System.out.println("Отсортировать по возрасту:");
        System.out.println(service.sortByAge(users));
    }
}
