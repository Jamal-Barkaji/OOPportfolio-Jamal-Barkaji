import java.util.Scanner;

public class SquareCalculations
{
    public static void main(String[] args)
    {
        double input;
        double perimeter;
        double area;
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter length of a square's side: ");
        input = scan.nextDouble();
        scan.close();

        perimeter = (double) (input *  4);
        area = (double) (input * input);
        System.out.println(input + " Perimeter = " + perimeter + " units");
        System.out.println(input + " Area = " + area + " units^2");
    }
}
