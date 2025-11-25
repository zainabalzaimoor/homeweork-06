package com.ga;

public class Teacher extends FullTimeInstructor implements ITeacherRole{

    public Teacher(String firstName, String lastName, double salaryRate) {
        super(firstName, lastName, salaryRate);
    }

    @Override
    public void Teach(String className) {
        System.out.println(getFirstName() + " is teaching " + className);
    }

    @Override
    public String toString() {
        return "Teacher{" + getFirstName() + "" + getLastName() + "," +
                " Salary Rate: " + getSalaryRate()
                +"}";
    }
}
