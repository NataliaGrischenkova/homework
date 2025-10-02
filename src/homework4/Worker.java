package homework4;

public class Worker extends Employee {

    public Worker(String name, String lastName, Integer experience) {
        super(name, lastName, experience);

    }

    @Override
    public void setProfession() {
        this.profession = PROFESSION.WORKER;
    }
}
