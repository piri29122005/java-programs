import java.util.Scanner;

public class VowelCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int vowelCount = 0;

        try {
            for (char c : inputString.toCharArray()) {
                if (Character.isDigit(c)) {
                    throw new Exception("Invalid Input");
                }
                if (String.valueOf(c).matches("[aeiouAEIOU]")) {
                    vowelCount++;
                }
            }
            System.out.println("Vowels: " + vowelCount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}