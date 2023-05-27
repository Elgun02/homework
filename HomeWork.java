package HomeWorks;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome. Please ENTER your numbers. ");

        System.out.println();

        System.out.print("Binary: ");
        int b = scanner.nextInt();
        System.out.println(Integer.toBinaryString(b));

        System.out.println();

        System.out.print("Octal: ");
        int o = scanner.nextInt();
        System.out.println(Integer.toOctalString(o));

        System.out.println();

        System.out.print("Decimal: ");
        int d = scanner.nextInt();
        System.out.println((d));

        System.out.println();

        System.out.print("Hex: ");
        int h = scanner.nextInt();
        System.out.println(Integer.toHexString(h));

        System.out.println();
        System.out.println("<3");

        scanner.close();
    }
}
