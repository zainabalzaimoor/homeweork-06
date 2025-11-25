public class FullTimeInstructor extends Person {
    private double salaryRate;

    public FullTimeInstructor(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public FullTimeInstructor(String firstName, String lastName, double salaryRate) {
        super(firstName, lastName);
        this.salaryRate = salaryRate;
    }

    public double getSalaryRate() {
        return salaryRate;
    }

    public void setSalaryRate(double salaryRate) {
        this.salaryRate = salaryRate;
    }
}
