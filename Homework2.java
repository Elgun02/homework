package Homework;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();

        System.out.print("Enter first 'double' number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second 'double' number: ");
        double b = sc.nextDouble();

        double c = a * b;

        int d = (int) c;

        System.out.println("Result: " + d);

        sc.close();
    }
}
