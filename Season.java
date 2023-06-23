package Homework;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите значение месяца: ");

        int date = sc.nextInt();

        if (date >= 1 && date <= 2)
            System.out.print("Зима");
        else if (date >= 3 && date <= 5)
            System.out.print("Весна");
        else if (date >= 6 && date <= 8)
            System.out.print("Лето");
        else if (date >= 9 && date <= 11)
            System.out.print("Осень");
        else if (date == 12)
            System.out.print("Зима");
        else
            System.out.println("Error 404");

        sc.close();
    }
}


