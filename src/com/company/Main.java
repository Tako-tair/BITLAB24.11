package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main (String[]args) {

        Staff s1 = new Staff(26098, "illidan", "qwerty", "Amir", "Aralbay",15004.01,3);
        Staff s2 = new Staff(26098, "Maximus", "123456", "Dan", "Obi",22510.33,2);
        Staff s3 = new Staff(36778, "Decimus", "qazwsx", "Croll", "Wan",484848.1,2);
        Staff s4 = new Staff(14896, "Meridius", "qwerty12", "Calvin", "Kenoby",33644.01,2);
        Staff s5 = new Staff(17443, "Batman", "algakazakhstan", "Harris", "Solo",44786.11,2);

        Student st1 = new Student(26098, "illidan", "qwerty", "Amir", "Aralbay",1.45,2);
        Student st2 = new Student(26098, "illidan", "qwerty", "Amir", "Aralbay",3.65,2);
        Student st3 = new Student(26098, "illidan", "qwerty", "Amir", "Aralbay",4.00,2);
        Student st4 = new Student(26098, "illidan", "qwerty", "Amir", "Aralbay",2.55,2);
        Student st5 = new Student(26098, "illidan", "qwerty", "Amir", "Aralbay",1.55,2);

        s1.addSubject("Matan");
        s1.addSubject("Matan");
        s1.addSubject("Matan");
        s2.addSubject("Matan");
        s3.addSubject("Matan");
        s4.addSubject("Matan");
        s5.addSubject("Matan");

        st1.addCourse("Russion");
        st2.addCourse("Russion");
        st3.addCourse("Russion");
        st4.addCourse("Russion");
        st5.addCourse("Russion");

        User[] users = {s1,s2,s3,s4,s5,st1,st2,st3,st4,st5};
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].getData());
        }
    }
}