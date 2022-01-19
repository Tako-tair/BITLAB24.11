package extendTaskSix;

import javax.crypto.spec.PSource;

public class Student extends User{
    private double gpa;

    public Student() {}
    public Student(String name, String surname, double gpa) {
        super( name, surname);
        this.gpa = gpa;
    }
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void getData() {
        super.getData();
        System.out.println(" " + gpa);
    }
}