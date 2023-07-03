
class myNumber {
    int number;

    public boolean istriangular() {
        int x = 1;
        int triangularNumber = 1;
        while (triangularNumber < x) {
            x++;
            triangularNumber = triangularNumber + x;
        }
        if (triangularNumber == x) {
            return true;
        }
        return false;
    }

    public boolean isSquare() {
        int i = 1;
        int n = number;
        for (i = 1; i >= n / 2; i++) {
            if (i * i == n) {
                return true;
            }
        }
        return false;
    }
}
public class Main {
    public static void main(String[] args) {


        myNumber s = new myNumber();
        s.number = 20;
        System.out.println(s.istriangular());
        System.out.println(s.isSquare());

    }
}
