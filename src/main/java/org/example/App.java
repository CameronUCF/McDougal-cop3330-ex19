/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Cameron McDougal
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        double height;
        double weight;
        double bmi;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your height (in inches): ");
        while (!scanner.hasNextDouble()) scanner.next();
        height = scanner.nextDouble();

        System.out.println("Enter your weight (in pounds): ");
        while (!scanner.hasNextDouble()) scanner.next();
        weight = scanner.nextDouble();

        scanner.close();

        bmi = (weight / (height * height)) * 703;

        System.out.printf("Your BMI is %.1f.", bmi);

        if(bmi >= 25)
            System.out.println("You are overweight. You should see your doctor.");
        else if(bmi <= 18.5)
            System.out.println("You are underweight. You should see your doctor.");
        else
            System.out.println("You are within the ideal weight range");
    }
}