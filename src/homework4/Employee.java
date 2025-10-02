package homework4;

public abstract class Employee extends Person {

    private Integer experience;
    private Integer basic = 1000;
    protected PROFESSION profession;

    public Employee(String name, String lastName, Integer experience) {
        super(name, lastName);
        this.experience = experience;
        setProfession();
    }

    public Integer getSalary() {
        return basic * profession.getKoef() * experience;


    }

    public abstract void setProfession();

    @Override
    public String toString() {
        return "Employee{" +
                "name= " + name +
                ", lastName= " + lastName +
                ", experience=" + experience +
                ", profession=" + profession +
                ", salary=" + getSalary() +
                '}';
    }
}

