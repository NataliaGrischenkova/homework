package homeworkCollection;

import java.util.Objects;

public class User implements Comparable<User> {
    private String name;
    private Gender gender;
    private int age;

    public User(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name) && gender == user.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, age);
    }

    @Override
    public int compareTo(User other) {
        if(this.age != other.age) {
            return Integer.compare(this.age, other.age);
        }
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "User{" +
                "имя='" + name + '\'' +
                ", пол=" + gender +
                ", возраст=" + age +
                '}';
    }
}
