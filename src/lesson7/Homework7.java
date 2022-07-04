package lesson7;

import java.util.Arrays;

public class Homework7 {
    public static void main(String[] args) {
        // System.out.println(calculateFactorial(5)); // задача с лекции №1

        // int[] arr1 = new int[] { 1, 3, 2, -5, 5, 6, 0 };// задача с лекции №2
        // System.out.println(Arrays.toString(arr1));
        // replaceOddNum(arr1);
        // System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[] { 1, 2, 6, 9, 12, -4, 8 }; // задача №1, найти максимальное число в массиве
        System.out.println(findMax(arr2));

        drawRectangle(4, 8); // задача №2, нарисовать прямоугольник из *, имея данные его ширины и высоты.

        int[] arr3 = new int[] { 1, 4, 8, 12, 15, -3 }; // задача №3, с помощью линейного поиска элемента в массиве,
                                                        // вернуть индекс искомого элемента. Если такого элемента нет,
                                                        // вернуть -1.
        int element = 4;
        System.out.println(linearSearch(arr3, element));

        Homework7.largestPallindrome(); // Доп.задача №2, найти наибольший паллиндром полученный умножением двух
                                        // трехзначных чисел.

        int[] myArray = new int[] { 1, 2, 3, 4, 5 }; // Доп.задача №3, реализовать перестановку чисел в массиве без
                                                     // повторений. Р(5) = 5! = 120 перестановок
        creatingPermutation(myArray);
    }

    public static long calculateFactorial(int n) {
        long result = 1;

        for (long i = n; i != 0; i--) {
            result *= i;
        }
        return result;
    }

    public static void replaceOddNum(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = 0;
            }
        }
    }

    public static int findMax(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void drawRectangle(int w, int h) {
        for (int i = 1; i <= w; i++) {
            for (int j = 1; j <= h; j++) {
                if (j == 1 || j == h || i == 1 || i == w) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static int linearSearch(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static void largestPallindrome() {
        int result = 0;
        int max = 999;
        for (int i = 100; i <= max; i++) {
            for (int j = max; j >= i; j--) {
                if (findPalindrome(i * j) && (i * j) > result) {
                    result = i * j;
                }
            }
        }
        System.out.println(result);
    }

    public static boolean findPalindrome(int n) {
        String nString = String.valueOf(n);
        int j = 0;
        int stringLength = nString.length() - 1;
        for (int i = stringLength; i >= 0; i--) {
            if (nString.charAt(j) == nString.charAt(i)) {
                if (i == 0) {
                    return true;
                }
                j++;
            } else if (nString.charAt(j) != nString.charAt(i)) {
                return false;
            }
        }
        return false;
    }

    public static void creatingPermutation(int[] array) {
        int k = array.length - 1;
        int n = k;
        System.out.println(Arrays.toString(array));

        for (; k > 0;) {
            leftShift(array, k);
            if (array[k] != k) {
                k = n;
                System.out.println(Arrays.toString(array));
            } else {
                k = k - 1;
            }
        }
    }

    public static void leftShift(int[] array, int k) {
        int tmp = array[0];

        for (int i = 0; i < k; i++) {
            array[i] = array[i + 1];
        }
        array[k] = tmp;
    }
}
