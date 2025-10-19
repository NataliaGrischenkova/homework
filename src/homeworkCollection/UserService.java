package homeworkCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UserService {

    public List<User> findByName(List<User> users, String name) {
        List<User> result = new ArrayList<>();
        for (User user : users) {
            if (user.getName().equals(name)) {
                result.add(user);
            }
        }
        return result;
    }

    public List<User> findByGender(List<User> users, Gender gender) {
        List<User> result = new ArrayList<>();
        for (User user : users) {
            if (user.getGender() == gender) {
                result.add(user);
            }
        }
        return result;
    }

    public List<User> sortByAge(List<User> users) {
        List<User> sorted = new ArrayList<>(users);
        Collections.sort(sorted);
        return sorted;
    }
}
