public class Worker {

    private String name;
    private String birthDate;
    protected String endDate;

    public Worker() {

    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    protected int getAge() {
        int currentYear = 2022;
        int dob = Integer.parseInt(birthDate.substring(6));

        return (currentYear - dob);
    }

    protected double collectPay() {

        return 0.0;

    }

    protected void terminate (String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
