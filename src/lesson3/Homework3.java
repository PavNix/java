package lesson3;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        Homework3.task1();
        Homework3.task2();
        Homework3.task2_1();
        Homework3.task3();
        Homework3.task4(1322);
        System.out.println(Homework3.task5(143341));
        System.out.println(Homework3.task6(2, -2));

    }

    public static void task1() {
        Scanner scQustion = new Scanner(System.in);

        System.out.println("Введите число 1: ");
        int num1 = scQustion.nextInt();

        System.out.println("Введите число 2: ");
        int num2 = scQustion.nextInt();

        System.out.println("Введите число 3: ");
        int num3 = scQustion.nextInt();

        System.out.println("Введите число 4: ");
        int num4 = scQustion.nextInt();

        if (Math.max(num1, num2) > Math.max(num3, num4)) {
            System.out.println("Max number = " + Math.max(num1, num2));
        } else {
            System.out.println("Max number = " + Math.max(num3, num4));
        }

    }

    public static void task2() {
        Scanner scQustion = new Scanner(System.in);

        System.out.println("Введите номер квартиры: ");
        int numApartment = scQustion.nextInt(); // номер квартиры

        int floor; // этаж квартиры
        int sumEntrance = 5; // количество подъездов в доме
        int sumFloor = 9; // количество этажей в доме
        int appartOnFloor = 4; // количество квартир на одном этаже

        int sumApartments = appartOnFloor * sumFloor * sumEntrance; // количество квартир в доме
        int appartOnEntrance = sumApartments / sumEntrance; // количество квартир в одном подъезде

        if (numApartment > sumApartments) {
            System.out.println("Такой квартиры нет в этом доме.");
        }

        int entrance = numApartment / appartOnEntrance; // определяем подъезд

        if (numApartment % appartOnEntrance != 0) {
            entrance++;
        }

        if (numApartment % appartOnEntrance == 0) {
            floor = sumFloor;
        }

        else {
            floor = (numApartment % appartOnEntrance) / appartOnFloor;
            if (numApartment % appartOnFloor != 0) {
                floor++;
            }
        }

        if (numApartment <= sumApartments) {
            System.out.println(numApartment + " находится на этаже № " + floor + " в подъезде № " + entrance);
        }

    }

    public static void task2_1() {
        // Код для определения подъезда и этажа квартиры из любых других входящих данных
        Scanner scQustion = new Scanner(System.in);

        System.out.println("Введите номер квартиры: ");
        int numApartment = scQustion.nextInt(); // номер квартиры

        System.out.println("Введите количество подъездов в доме: ");
        int sumEntrance = scQustion.nextInt(); // количество подъездов

        System.out.println("Введите количество этажей в доме: ");
        int sumFloor = scQustion.nextInt(); // количество этажей

        System.out.println("Введите количество квартир в доме: ");
        int sumApartments = scQustion.nextInt(); // количество квартир

        int floor; // этаж квартиры

        int appartOnEntrance = sumApartments / sumEntrance; // количество квартир в одном подъезде
        int appartOnFloor = sumApartments / sumEntrance / sumFloor; // количество квартир на одном этаже

        int entrance = numApartment / appartOnEntrance; // определяем подъезд

        if (numApartment % appartOnEntrance != 0) {
            entrance++;
        }

        if (numApartment % appartOnEntrance == 0) {
            floor = sumFloor;
        }

        else {
            floor = (numApartment % appartOnEntrance) / appartOnFloor;
            if (numApartment % appartOnFloor != 0) {
                floor++;
            }
        }

        System.out.println(numApartment + " находится на этаже № " + floor + " в подъезде № " + entrance);
    }

    public static void task3() {
        Scanner scQustion = new Scanner(System.in);

        System.out.println("Введите сторону a: ");
        int a = scQustion.nextInt();

        System.out.println("Введите сторону b: ");
        int b = scQustion.nextInt();

        System.out.println("Введите сторону c: ");
        int c = scQustion.nextInt();

        int min = Math.min(Math.min(a, b), c);

        if (min <= 0) {
            System.out.println("Такой треугольник не существует.");
            return;
        }

        System.out.println("Такой треугольник существует.");
    }

    public static void task4(int num) {
        int a = num % 10;
        int b = (num / 10) % 10;
        int c = (num / 100) % 10;
        int d = (num / 1000) % 10;

        if ((a + b) == (c + d)) {
            System.out.println("Билет счастливый.");
            return;
        }

        System.out.println("Билет несчастливый.");
    }

    public static boolean task5(int num) {
        if ((num / 100000) % 10 != (num / 1) % 10) {
            return false;
        }

        if ((num / 10000) % 10 != (num / 10) % 10) {
            return false;
        }

        if ((num / 1000) % 10 != (num / 100) % 10) {
            return false;
        }

        return true;
    }

    public static boolean task6(double x, double y) {
        double radius = 6;

        double length = Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));

        if (length > radius) {
            return false;
        }

        return true;
    }
}
