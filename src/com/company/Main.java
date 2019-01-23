package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Create a new project in IntelliJ IDEA named ArrayPractice:Done
//        Initialize your project as a Git repository and be sure to add and commit all changes as you work:Done
//        Declare an array named dailyAverageTemp: done
//        Instruct the user to input daily average temperatures (in degrees Fahrenheit) for 7 days: done
//        Each time the user inputs a value, add it to your dailyAverageTemp array: done

        double average = 0;
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
