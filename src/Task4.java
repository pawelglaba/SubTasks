import java.util.Random;

public class Task4 {

    public static void BirthdayParadox() {
        boolean[] birthdays = new boolean[365];
        int counter = 0;
        Random random = new Random();

        while (true) {
            int randomIndex = random.nextInt(365);

            if (birthdays[randomIndex] == false) {
                birthdays[randomIndex] = true;
                counter++;
            } else {
                break; // Exit the loop if a repeated birthday is found

            }
        }

        System.out.println("Number of people needed for a 50-50 chance of sharing a birthday: " + (counter + 1));
    }


    public static void main(String[] args) {
        BirthdayParadox();
    }


}
