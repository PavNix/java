package lesson4;

import java.util.Scanner;

import javax.lang.model.element.Element;

public class Homework4 {
    public static void main(String[] args) {
        Homework4.task1();
        Homework4.task2();
        Homework4.task3();
        Homework4.task4(10);
        Homework4.task5();
        System.out.println(Homework4.task6(25, 0.1));
    }

    public static void task1() {
        Scanner scQustion = new Scanner(System.in);

        System.out.println("Введите число: ");
        long n = scQustion.nextInt();

        long result = 1;

        if (n > 4 && n < 16) {
            for (long i = n; i != 0; i--) {
                result *= i;
            }

            System.out.println("Факториал числа " + n + " равен = " + result);
        } else {
            System.out.println("Введите любое число от 5 до 15");
        }

    }

    public static void task2() {

        for (int j = 1; j <= 10; j++) {
            System.out.println(5 + " * " + j + " = " + (5 * j));
        }

    }

    public static void task3() {
        Scanner scQustion = new Scanner(System.in);

        System.out.println("Введите высоту: ");
        int x = scQustion.nextInt();

        System.out.println("Введите ширину: ");
        int y = scQustion.nextInt();

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                if (j == 1 || j == y || i == 1 || i == x) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void task4(int n) {
        int counter = 0;
        int width = 1;
        int height = 0;

        while (true) {
            System.out.print("*");
            counter++;

            if (counter < width) {
                continue;
            }

            if (height < 2 * n - 2) {
                counter = 0;
                if (height < n - 1) {
                    width++;
                } else {
                    width--;
                }

                System.out.println("");

                height++;
                continue;
            }

            break;
        }
        System.out.println("");
    }

    public static void task5() {
        Scanner scQustion = new Scanner(System.in);

        System.out.println("Введите ширину: ");
        int x = scQustion.nextInt();

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {
                if (i >= j && i >= (x + 1) - j || (i <= j && i <= (x + 1) - j)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                if (j % x == 0) {
                    System.out.println("");
                }
            }
        }
    }

    public static double task6(double a, double err) {
        double x0 = a;
        double x1 = 1 / 2.0 * (x0 + a / x0);
        double d = Math.abs((x1 - x0));

        for (; d >= 2 * err && d * d >= 2 * err;) {
            x0 = x1;
            x1 = 1 / 2.0 * (x0 + a / x0);
            d = Math.abs((x1 - x0));
        }
        return x1;
    }
}