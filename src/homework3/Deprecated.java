package homework3;

public class Deprecated {

    @java.lang.Deprecated
    public void oldMethod() {
        System.out.println("Устаревший метод");
    }
    public void newMethod() {
        System.out.println("Новый метод");
    }
}

// Отметьте метод как @Deprecated. Попробуйте на экземпляре класса вызвать этот метод.
// Что подскажет idea при таком вызове.