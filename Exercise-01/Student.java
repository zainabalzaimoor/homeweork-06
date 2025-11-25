package com.ga;

public class Student extends Person implements IStudentRole{
    private double currentGrade;

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Student(String firstName, String lastName, double currentGrade) {
        super(firstName, lastName);
        this.currentGrade = currentGrade;
    }

    public double getCurrentGrade() {
        return currentGrade;
    }

    public void setCurrentGrade(double currentGrade) {
        this.currentGrade = currentGrade;
    }

    @Override
    public void Learn(){
        System.out.println("The student is learning at " + currentGrade);
    }

    @Override
    public String toString() {
        return "Student{" + getFirstName() +" " + getLastName() + ", Grade = " + getCurrentGrade() +
                "currentGrade=" + currentGrade +
                '}';
    }
}
