package packAg;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DayOfTheWeek a = DayOfTheWeek.TUES;
        for (int i = 1;i<=10;i++){
            System.out.println(a);
            System.out.println(a.name());
            System.out.println(a.ordinal());
            System.out.println(getRandomDay());
            System.out.println(getRandomDay());
        }

    }
    public static DayOfTheWeek getRandomDay(){
        int a = new Random().nextInt(7);
        var b = DayOfTheWeek.values();
        return b[a];
    }
}