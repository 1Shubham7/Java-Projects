import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> grocery = new ArrayList<>(List.of("Paneer","Chicken","Banana"));
        System.out.println(grocery);
        System.out.println("Available Options");
        System.out.println("0 - to shutdown");
        System.out.println("1 - to add items (comma delimited list)");
        System.out.println("2 - to remove any items (comma delimited list)");

        while(true){
            System.out.println("Enter a number for which action you want to do");
            Scanner input = new Scanner(System.in);
            int a = input.nextInt();

            if (a==0){
                System.out.println("Shutted Down");
                grocery.sort(Comparator.naturalOrder());
                System.out.println(grocery);
                break;
            }
            if (a==1){
                System.out.println("Enter the Grocery");
                String b = input.next();
                if (grocery.contains(b)){
                    System.out.println("You repeated a Grocery, Try something else");
                }
                else {
                    grocery.add(b);
                }

                grocery.sort(Comparator.naturalOrder());
                System.out.println(grocery);
            }
            if (a==2){
                System.out.println("Enter the Grocery");
                String b = input.next();
                grocery.remove(b);
                grocery.sort(Comparator.naturalOrder());
                System.out.println(grocery);
            }
        }

    }
}