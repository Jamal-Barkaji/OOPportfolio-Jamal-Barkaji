import java.util.Scanner;

public class Fraction {
    public static void main(String[] args) {
        try {
            String input;
            int numerator;
            int denominator;
            float answer;
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter fraction: ");
            input = scan.next();
            scan.close();
            String[] parts = input.split("/", 2);
            String string1 = parts[0];
            String string2 = parts[1];
            numerator = Integer.parseInt(string1);
            denominator = Integer.parseInt(string2);
            answer = (float) numerator / denominator;

            System.out.println("Fraction is equivalent to " + answer);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error. Inappropriate input.");
        }
    }
}
