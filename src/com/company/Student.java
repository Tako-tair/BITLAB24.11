package com.company;

public class Student extends User{
    private double gpa;
    private String[] courses = new String[100];
    private int indexOfCourses = 0;
    int index = 0;

    Student(){}
    public Student(int id, String login, String password, String name, String surname, double gpa, int indexOfCourses) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
        this.indexOfCourses = indexOfCourses;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getIndexOfCourses() {
        return indexOfCourses;
    }

    public void setIndexOfCourses(int indexOfCourses) {
        this.indexOfCourses = indexOfCourses;
    }
    public void  addCourse(String course){
        courses[index] = course;
        index++;
    }
    public String getCourses(){
        String text = "";
        for (int i = 0; i < courses.length; i++) {
            if(courses[i]!=null)
                text += courses[i] + " ";
        }
        return text;
    }

    @Override
    public String getData() {
        return  "name: " + name + ", " +
                "GPA: " + gpa + ", " +
                getCourses() +
                " Index: " + indexOfCourses;
    }
}
