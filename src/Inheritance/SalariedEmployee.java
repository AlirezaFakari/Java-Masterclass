package Inheritance;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }
    @Override
    public double collectPay() {
        double Paycheck = annualSalary/26;
        double adjustedPay = (isRetired) ? 0.9 * Paycheck : Paycheck;
        return (int) adjustedPay;
    }

    public void retire(){
        terminate("31.02.2026");
        isRetired = true;
    }
}
