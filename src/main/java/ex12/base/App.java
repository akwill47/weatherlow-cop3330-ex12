package ex12.base;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
/*
Exercise 12 - Computing Simple Interest
Computing simple interest is a great way to quickly figure out whether an investment has value. It’s also a good way to get comfortable with explicitly coding the order of operations in your programs.

Create a program that computes simple interest. Prompt for the principal amount, the rate as a percentage, and the time, and display the amount accrued (principal + interest).

The formula for simple interest is A = P(1 + rt), where P is the principal amount, r is the annual rate of interest, t is the number of years the amount is invested, and A is the amount at the end of the investment.

Example Output
Enter the principal: 1500
Enter the rate of interest: 4.3
Enter the number of years: 4
After 4 years at 4.3%, the investment will be worth $1758.
Constraints
Prompt for the rate as a percentage (like 15, not .15). Divide the input by 100 in your program.
Ensure that fractions of a cent are rounded up to the next penny.
Ensure that the output is formatted as money.
Challenges
Ensure that the values entered for principal, rate, and number of years are numeric and that the program will not let the user proceed without valid inputs.
Alter the program to use a function called calculateSimpleInterest that takes in the rate, principal, and number of years and returns the amount at the end of the investment.
In addition to printing out the final amount, print out the amount at the end of each year.
 */
public class App {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        App myApp = new App();
        System.out.print("Enter the principal: ");
        float principal = myApp.readInput();
        System.out.print("Enter the rate of interest: ");
        float rate = myApp.readInput();
        System.out.print("Enter the number of years: ");
        float time = myApp.readInput();

        String output = myApp.doMath(principal,rate,time);
        myApp.displayOutput(output);


    }
    private float readInput(){
        return in.nextFloat();
    }

    private String doMath(float principal, float rate, float time){
        float accrued = (principal*(1+(rate/100)*time));
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        return "After " + (int)time + " years at " + rate + "%, the investment will be worth $" + df.format(accrued) + ".";
    }
    private void displayOutput(String output){
        System.out.println(output);
    }

}
