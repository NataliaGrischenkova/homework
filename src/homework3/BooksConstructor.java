package homework3;

public class BooksConstructor {
    String title;
    String author;
    int year;

    public BooksConstructor(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public BooksConstructor(String title, String author) {
        this(title, author, 0);
    }

    public void print() {
        System.out.println("Название: " + title + ", Автор: " + author + ", Год: " + year);
    }
}

// Создать класс содержащий несколько конструкторов. Создать объект этого класса, использовав один из них.
// В этом конструкторе сделать вызов другого конструктора этого же класса.