// ***************************************************************
//   Salary.java
//
//   Computes the amount of a raise and the new
//   salary for an employee.  The current salary
//   and a performance rating (a String: "Excellent",
//   "Good" or "Poor") are input.
// ***************************************************************


import java.util.Scanner;
import java.text.NumberFormat;


public class Salary
{
    public static void main (String[] args)
    {
        double currentSalary;
        double raise = 0;
        double newSalary;
        String rating;


        Scanner scan = new Scanner(System.in);


        System.out.print ("Enter the current salary: ");
        currentSalary = scan.nextDouble();
        System.out.print ("Enter the performance rating (Excellent, Good, or Poor): ");
        rating = scan.next();


        switch (rating) {
            case "Excellent":
                raise = (currentSalary * 0.06);
                break;
            case "Good":
                raise = (currentSalary * 0.04);
                break;
            case "Poor":
                raise = (currentSalary * 0.015);
                break;
            default:
                System.out.println("Error. Wrong input");
        }


        newSalary = currentSalary + raise;


        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println();
        System.out.println("Current Salary:       " + money.format(currentSalary));
        System.out.println("Amount of your raise: " + money.format(raise));
        System.out.println("Your new salary:      " + money.format(newSalary));
        System.out.println();
    }
}