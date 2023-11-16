import java.util.Random;

public class Task3 {

    public static String generateRandomString(int length) {

        if (length >= 1) {
            char[] charArray = new char[26];
            for (int i = 0; i < 26; i++) {
                charArray[i] = (char) ('a' + i);
            }

            Random random = new Random();
            StringBuilder randomString = new StringBuilder();

            for (int i = 0; i < length; i++) {
                int randomIndex = random.nextInt(26);
                randomString.append(charArray[randomIndex]);
            }

            return randomString.toString();
        } else {
            System.out.println("Selected number must be >=1 ");
            return null;
        }
    }

    public static void main(String[] args) {

        String testString = generateRandomString(10);
        System.out.println(testString);

    }


}
