public class SalariedEmployee extends Employee{

    double annualSalary;
    boolean isRetired ;

    public SalariedEmployee(String name, String birthDate, String hireDate,
                            double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    public double collectPay() {
        double paycheck =  annualSalary/26;
        double adjustedPay = (isRetired) ? paycheck : paycheck;
        return (int) adjustedPay;
    }

    protected void retire() {
        terminate("12/12/2060");
        isRetired = true;
    }

}
