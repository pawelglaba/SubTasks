import java.util.Random;

public class Task2 {

    //    public static int[] SecondMaximum(int usersInt) {
    public static void SecondMaximum(int usersInt) {

        if (usersInt <= 0) {
            System.out.println("Program may not work properly - Your number is less or equal to 0");
            // return null;
        } else if (usersInt == 1) {
            System.out.println("Second largest nuber is undefined. usersInt should be >1");
            // return null;
        } else {
            int randomNumber;
            Random random = new Random();
            int[] array = new int[usersInt];


            for (int i = 0; i < usersInt; i++) {
                randomNumber = random.nextInt(usersInt + 2);
                array[i] = randomNumber;
            }

            int secondMaximum = SortArray(array);
            System.out.println("Your second maximum is: " + secondMaximum);
            // return array;
        }

    }


    public static int SortArray(int[] array) {

        int secondMaximum;


        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        secondMaximum = array[1];
        return secondMaximum;
    }

    public static void main(String[] args) {

        SecondMaximum(3);

        // int[] testArray = SecondMaximum(3);
//
//        for (int i = 0; i < testArray.length; i++) {
//            System.out.println(testArray[i]);
//        }


    }


}











