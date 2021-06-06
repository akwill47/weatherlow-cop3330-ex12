package ex12.base;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 12 Solution
 *  Copyright 2021 William Weatherlow
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
