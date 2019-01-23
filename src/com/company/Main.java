package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Exercise 7.0
//        Create a new project in IntelliJ IDEA named ArrayPractice:Done
//        Initialize your project as a Git repository and be sure to add and commit all changes as you work:Done
//        Declare an array named dailyAverageTemp: done
//        Instruct the user to input daily average temperatures (in degrees Fahrenheit) for 7 days: done
//        Each time the user inputs a value, add it to your dailyAverageTemp array: done

//        Exercise 7.1
//        Write a program that loops through your
//        dailyAverageTemp array and prints out each
//        daily average temperature: done
//
//        Next, your program should print out the weekly average temperature (e.g., the average of the averages)
//        (Remember to add and commit your changes to your repository as you work!)

        

//        Modify your dailyAverageTemp exercise to use at least one
//        for-each loop
//        Your program should convert each daily average temperature to Celsius, and should store the Celsius values in a new array named dailyAverageTempCelsius
//•
//•
//        Your program should print out the daily and weekly
//•
//        averages in Fahrenheit and Celsius
//•
//        When you are finished, create a remote repository on GitHub and connect it to your local repository, then push your changes up to GitHub

        double average;
        double sum = 0;

        Scanner scan = new Scanner(System.in);
        double[] dailyAverageTemp = new double[7];

        for (int i=0; i < dailyAverageTemp.length; i++ ) {
            System.out.println("Enter a temperature number in degrees Fahrenheit for 7 day forecast.");
            dailyAverageTemp[i] =scan.nextDouble();
            sum = sum + dailyAverageTemp[i];
        }

        average = sum/7;
        System.out.println(average);



    }
}
