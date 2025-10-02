package homework4;

public class Main {
    public static void main(String[] args) {

        Employee worker1 = new Worker ("nameW1", "lastNameW1", 1);
        Employee worker2 = new Worker ("nameW2", "lastNameW2", 2);
        Employee worker3 = new Worker ("nameW3", "lastNameW3", 3);
        Employee worker4 = new Worker ("nameW4", "lastNameW4", 4);

        Employee director1 = new Director("nameD1", "lastName1", 1);
        Employee director2 = new Director("nameD2", "lastName2", 2);

        ((Director)director1).addWorker(worker1);
        ((Director)director1).addWorker(worker2);
        ((Director)director1).addWorker(worker3);

        ((Director)director2).addWorker(director1);

        System.out.println(worker4);

    }
}
