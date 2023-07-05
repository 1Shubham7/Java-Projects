import java.util.ArrayList;
import java.util.List;

public class Main {

    static int changename(int a){
        a=20;
        return a;
//        System.out.println(a);
    }

    public static void main(String[] args) {
        List shubham = new ArrayList<>();
        List mahar = new Vector<>();
        Kutta kutta;
        kutta = Kutta.Acha;
        System.out.println(kutta);

    }

    enum Kutta{
        Acha, Bacha, Kacha, Lacha;
    }
}