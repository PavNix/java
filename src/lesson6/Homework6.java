package lesson6;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Homework6.task1();
        Homework6.task2("Hello my Java language");
        Homework6.task3("ititititit");
    }

    public static void task1() {
        Scanner scQustion = new Scanner(System.in);

        System.out.println("Input some text");
        String text = scQustion.nextLine();
        text = text.toLowerCase();

        int countLetter = 0;

        char[] letters = text.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'b') {
                countLetter += 1;
            }
        }
        System.out.println(text);
        System.out.println("b = " + countLetter);
    }

    public static void task2(String text) {
        String[] result = text.split("[ ]");
        String maxWord = result[0];

        for (int i = 0; i < result.length; i++) {
            if (maxWord.length() < result[i].length()) {
                maxWord = result[i];
            }
        }

        System.out.println(maxWord);
    }

    public static void task3(String text) {
        String pattern = Character.toString(text.charAt(0));

        int offset = 0;

        for (int i = 1; i < text.length(); i++) {
            if (text.charAt(i) == pattern.charAt(offset)) {
                offset++;

                if (offset == pattern.length()) {
                    break;
                }
            } else {
                offset = 0;
                pattern += Character.toString(text.charAt(i));
            }
        }

        System.out.println(pattern);
    }
}
