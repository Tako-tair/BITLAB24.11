package com.company;

public class Staff extends User{
    private double salary;
    private String[] subjects = new String[100];
    private int indexOfSubject = 0;
    int index = 0;

    Staff(){}
    public Staff(int id, String login, String password, String name, String surname, double salary, int indexOfSubject) {
        super(id, login, password, name, surname);
        this.salary = salary;
        this.indexOfSubject = indexOfSubject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getIndexOfSubject() {
        return indexOfSubject;
    }

    public void setIndexOfSubject(int indexOfSubject) {
        this.indexOfSubject = indexOfSubject;
    }
    public void  addSubject(String subject){
        subjects[index] = subject;
        index++;
    }
    public String getSubjext(){
        String text = "";
        for (int i = 0; i < subjects.length; i++) {
            if(subjects[i]!=null)
                text += subjects[i] + " ";
        }
        return text;
    }

    @Override
    public String getData() {
        return  "Name: " + name + ", " +
                "Salary: " + salary + ", " +
                getSubjext() +
                " Index: " + indexOfSubject;
    }
}
