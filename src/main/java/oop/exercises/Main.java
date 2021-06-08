package oop.exercises;
import java.util.Scanner;
/*
 * UCF cop3330 Summer 2021 Assignment 1 solutions
 * Copyright 2021 Keondez Robinson
 */

public class Main
{
    public static void main(String[] args)
    {
        int length, width, f2;
        double m2;
        Scanner input;
        input = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        length = input.nextInt();

        System.out.print("What is the width of the room in feet? ");
        width = input.nextInt();
        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet. ");

        f2 = length * width;
        m2 = f2 * 0.09290304;

        System.out.println("The area is ");
        System.out.println(f2 + " square feet");
        System.out.println(m2 + " square meters");
    }
}
