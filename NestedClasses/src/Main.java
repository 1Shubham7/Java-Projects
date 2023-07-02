import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(10001,"Rahul",2001),
                new Employee(10001,"Rohan",2019),
                new Employee(10001,"Mark",2003),
                new Employee(10001,"Shubham",2015)
        ));

//        var comparotor = new EmployeeComparator<>();
//        employees.sort(comparotor);

        employees.sort(new Employee.EmployeeComparator<>("yearStarted").reversed());

        for (Employee e : employees){
            System.out.println(e);
        }
    }
}