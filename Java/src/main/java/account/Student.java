package account;

/**
 * Refactor Exercise 2: Account
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */

public class Student extends PaymentAccount {

    private double gpa;

    public Student(String name, int studentID, double gpa) {
        super(name, studentID);
        this.gpa = gpa;
    }

    public void updateGPA(double gpa) {
        this.gpa = gpa;
    }

    public double getGPA() {
        return this.gpa;
    }

    @Override
    public boolean pay(int amount) {
        return false; // No payment option.
    }
}
