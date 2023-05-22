import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i <= 9 ; i++) {
            array[i] = random.nextInt(1000);
        }
        System.out.println("Unsorted Array : " + Arrays.toString(array));

        boolean a = true;
        int b = 0;
        while(a == true){

            a = false;
            for (int i = 0; i <= 8; i++){
                if (array[i] < array[i+1]){
                    b = array[i];
                    array[i] = array[i+1];
                    array[i+1] = b;
                    a = true;
                }
            }
        }

        System.out.println("Sorted Array : " + Arrays.toString(array));

    }
}