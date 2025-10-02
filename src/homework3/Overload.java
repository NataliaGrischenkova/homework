package homework3;

public class Overload {
    public void car(String brand) {
        System.out.println("Марка: " + brand);
    }

    public void car(String brand, String model) {
        System.out.println("Марка: " + brand + ", Модель: " + model);
    }
    public String car(String brand, int year) {
        return "Марка: " + brand + ", Год выпуска: " + year;
    }
}

// Сделайте класс с несколькими перегруженными методами. Создайте экземпляр класса и
// вызовите все созданные методы, передав им необходимые параметры. Что произойдет если методы будут иметь
// одинаковое имя, одинаковый параметры, но разнай возвращаемый тип?