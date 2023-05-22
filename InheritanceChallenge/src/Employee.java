public class Employee extends Worker{

    private String hireDate;
    private long employeeId;

    private static int employeeNo = 1;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.hireDate = hireDate;
        this.employeeId = Employee.employeeNo++;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "hireDate='" + hireDate + '\'' +
                ", employeeId=" + employeeId +
                "} " + super.toString();
    }
}
