import java.util.Random;

public class Task1 {


    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        boolean check;
        int iterator = 0;

        int randomNumber;
        do {
            randomNumber = random.nextInt(10 * size);
            check = true;

            for (int i = 0; i < size; i++) {
                if (array[i] == randomNumber) {
                    check = false;
                    break;
                }
            }
            if (check) {
                array[iterator++] = randomNumber;
            }

        } while (iterator < size);

        return array;
    }


    public static void main(String[] args) {
        int[] array = generateRandomArray(6);
        System.out.println("Array elements:");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
