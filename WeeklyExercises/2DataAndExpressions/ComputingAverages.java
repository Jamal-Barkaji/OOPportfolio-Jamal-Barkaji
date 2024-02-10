// *******************************************************************
//   Average.java
//
//   Read three integers from the user and print their average
// *******************************************************************


import java.util.Scanner;
public class ComputingAverages
{
    public static void main(String[] args)
    {
        int val1, val2, val3;
        double average;
        Scanner scan = new Scanner(System.in);


        // get three values from user
        System.out.println("Please enter three integers and " +
                "I will compute their average");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        scan.close();

        average = (double) (num1 + num2 + num3) /3;
        System.out.println("Average = " + average);

    }
}