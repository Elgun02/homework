package Homework;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Добро пожаловать в кофейню.");
        System.out.println("Выберите один из напитков - 1) Эспрессо, 2) Американо , 3) Капучино, 4) Чай.");
        System.out.print("Введите: ");
        byte drink = sc.nextByte();

        switch (drink) {
            case 1:
                System.out.println("Готовится Эспрессо.");
                System.out.println("Подождите...");
                System.out.println("Готово!");
                break;
            case 2:
                System.out.println("Готовится Американо. [Эспрессо + Вода]");
                System.out.println("Подождите...");
                System.out.println("Готово!");
                break;
            case 3:
                System.out.println("Готовится Капучино. [Эспрессо + Вспененное молоко]");
                System.out.println("Подождите...");
                System.out.println("Готово!");
                break;
            case 4:
                System.out.println("Готовится Чай. [Вода + Пакетик чая]");
                System.out.println("Подождите...");
                System.out.println("Готово!");
                break;
            default:
                System.out.println("Напиток не найден!");
        }

        sc.close();
    }
}
