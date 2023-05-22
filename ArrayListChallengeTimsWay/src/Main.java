import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();
        while(flag){
            printActions();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default->flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }

    }

    public static void printActions(){
        String Textblock = """
                Available Options
                0 - to shutdown
                1 - to add items (comma delimited list)
                2 - to remove any items (comma delimited list)
                Enter a number for which action you want to do:""";
        System.out.print(Textblock + " ");
    }
    public static void addItems(ArrayList<String> groceries){
        System.out.println("Add items separated by commas");
        String[] items = scanner.nextLine().split(",");
        for (String i : items){
            String trimmed = i.trim();
            if (!groceries.contains(trimmed)){
                groceries.add(trimmed);
            }
        }
    }
    public static void removeItems(ArrayList<String> groceries){
        System.out.println("Add items separated by commas");
        String[] items = scanner.nextLine().split("");
        for (String i : items){
            String trimmed = i.trim();
                groceries.remove(trimmed);
        }
    }
}