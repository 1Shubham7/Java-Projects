public class Main {
    public static void main(String[] args) {

    Employee shubh = new Employee("Shubh","14/07/2003","01/01/2021");
        System.out.println(shubh);
        System.out.println("Age " + shubh.getAge());
        System.out.println("Pay " + shubh.collectPay());

    SalariedEmployee shubham = new SalariedEmployee("Shubham","14/07/2003","01/02/2010", 35000);

        System.out.println(shubham);
        System.out.println("Shubham's Paycheck = " + shubham.collectPay());
        shubham.retire();
        System.out.println("Shubham's Pension Check = " + shubham.collectPay());

        HourlyEmployee Jini = new HourlyEmployee("Jini","14/07/2002",
                "12/12/2012",12);
        System.out.println(Jini);
        System.out.println("Jini's Paycheck = " + Jini.collectPay());
        System.out.println("Jini's Holiday Pay = " + Jini.getDoublePay());
    }
}