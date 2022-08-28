package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        Student nick = new Student("nick", 1, 1, 4.0);
        System.out.println(nick.getName());
        System.out.println(nick.getStudentId());
        System.out.println(nick.getNumberOfCredits());
        System.out.println(nick.getGpa());
    }
}
