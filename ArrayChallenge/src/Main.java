import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0;i <= 9; i++){
            array[i] = random.nextInt(1000);
        }
        System.out.println("before sorting : " + Arrays.toString(array));

        int [] array2 = Arrays.copyOf(array, 10);
        Arrays.sort(array);



        for (int i = 0; i<=9; i++){
                array2[i] = array[9 - i];
        }

        System.out.println("Decreasing Order : " + Arrays.toString(array2));

    }
}