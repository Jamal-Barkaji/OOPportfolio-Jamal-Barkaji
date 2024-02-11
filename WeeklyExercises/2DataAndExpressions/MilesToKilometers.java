import java.util.Scanner;

public class MilesToKilometers
{
    public static void main(String[] args)
    {
        double input;
        double answer;
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter value in miles");
        input = scan.nextDouble();
        scan.close();

        answer = (double) (input *  1.60935);
        System.out.println(input + " miles = " + answer + " kilometers");
    }
}
