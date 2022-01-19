package extendTaskSix;

public class Staff extends User {
    private double salary;

    public Staff() {}

    public Staff (String name, String surname, double salary) {
        super(name, surname);
        this.salary = salary;;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void getData() {
        super.getData();
        System.out.print(" " + salary);
    }
}