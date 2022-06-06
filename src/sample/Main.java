package sample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Main.task1();
        Main.task2();
        Main.task3();

    }

    public static void task1(){
        // Задача 1 Вывести площадь треугольника по формуле Герона.
        double sideA = 0.3;
        double sideB = 0.4;
        double sideC = 0.5;

        double p = (sideA + sideB + sideC) / 2;
        double s = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));

        System.out.println(s);
    }

    public static void task2(){
        // Задача 2 Вычислить и вывести на экран сумму покупки.
        int applePrice = 2;
        int amountApple = 6;

        int sumCoast = applePrice * amountApple;
        System.out.println(sumCoast + " $");
    }

    public static void task3(){
        //Задача 3 Вычислить и вывести на экран стоимость топлива для поездки.

        Scanner scQustion = new Scanner(System.in);

        System.out.println("Стоимость топлива за один литр: ");
        double coast = scQustion.nextDouble(); //1,2$

        double distance = 100;
        
        System.out.println("Сколько литров топлива на сто киллометров используется:  ");
        double coastDist = scQustion.nextDouble(); //8 литров
        
        System.out.println("Дистанция поездки: ");
        double sumDistance = scQustion.nextDouble(); //120 км
        
        double sumPrice = (coastDist / distance * sumDistance) * coast;;

        scQustion.close();
        
        System.out.println(sumPrice + " $");
    }
}