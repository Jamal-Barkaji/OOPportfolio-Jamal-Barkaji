import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareCalculations {
    public static void main(String[] args) {
        try {
            double input;
            double perimeter;
            double area;
            Scanner scan = new Scanner(System.in);


            System.out.println("Enter length of a square's side: ");
            input = scan.nextDouble();
            scan.close();

            area = (double) (input * input);

            if (input < 0)
                perimeter = (double) (input * 4 * -1);
            else
                perimeter = (double) (input * 4);

            System.out.println("Perimeter = " + perimeter + " units");
            System.out.println("Area = " + area + " units^2");
        } catch (InputMismatchException e) {
            System.out.println("Error. Inappropriate input.");
        }
    }
}
