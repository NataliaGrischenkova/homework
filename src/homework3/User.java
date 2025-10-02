package homework3;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;
    private Address address;

    public User(String firstName, String lastName, int age, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public void setAddress(String country, String city) {
        this.address = new Address(country, city);
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void incrementAge() {
        age++;
    }

    public void userInfo() {
        System.out.println("Имя: " + firstName);
        System.out.println("Фамилия: " + lastName);
        System.out.println("Возраст: " + age);
        System.out.println("Пол: " + gender);
        System.out.println("Адрес: " + address.city + ", " + address.country);
    }

    public class Address {
        private String country;
        private String city;

        public Address(String country, String city) {
            this.country = country;
            this.city = city;
        }
    }
}




// Создать класс User для хранения о обработки данных о пользователе. Создать поля для хранения имени и фамилии,
// возраста и пола (использовать enum). Создать методы для:
// - Возврата имени и фамилии полностью
// - Увеличения возраста
// - Вывода общей информации о пользователе

// Для класс User создайте внутренний класс для сохранения сведений об адресе. Попробуйте добавить сведения об адресе
// в общую информацию об пользователе. Адрес должен содержать страну и город проживания пользователя.
