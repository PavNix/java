package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Homework5.task1();
        Homework5.task2();
        Homework5.task3();
        Homework5.task4();
        Homework5.task5();
    }

    public static void task1() {
        int[] arr = new int[] {0,5,2,4,7,1,3,19};

        for (int i = 0; i < arr.length; i++) {

            Arrays.sort(arr);
            if (arr[i] % 2 == 0) {
                continue;
            }

            System.out.println("Нечетным является число " + arr[i]);
        }
    }

    public static void task2(){
        Scanner scQustion = new Scanner(System.in);

        System.out.println("Введите количество элементов массива: ");
        int[] arr = new int[scQustion.nextInt()];

        for (int i = 0; i < arr.length; i++){
            System.out.println("Введите элемент массива: ");
            arr[i] = scQustion.nextInt();

            int[] newArray = Arrays.copyOfRange(arr, 0, arr.length);
            System.out.println(Arrays.toString(newArray));
        }
    }

    public static void task3(){
        int[] arr = new int[15];
        int[] newArray = new int[30];

        for (int i = 0,j = 15; i < arr.length; i++,j++) {
            arr[i] = (int) (1 + Math.random() * 100);
            newArray[i] = arr[i];
            newArray[j] = arr[i] * 2;
        }
        
        System.out.println("Массив 1: " + Arrays.toString(arr));
        System.out.println("Массив 2: " + Arrays.toString(newArray));

    }

    public static void task4() {
        int[] arr = new int[] {7, 2, 9, 4, 3};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void task5() {
        Scanner scQustion = new Scanner(System.in);
        
        int[][] arr = new int [][] {
            {1, 5, 1, 2, 4, 4, 1, 7}, 
            {5, 1, 1, 4, 6, 9, 1, 3}, 
            {8, 8, 4, 1, 9, 2, 3, 3}, 
            {2, 6, 8, 7, 6, 0, 6, 9}, 
            {2, 1, 5, 4, 0, 5, 6, 3}, 
            {7, 1, 4, 9, 6, 3, 8, 9}, 
            {9, 0, 2, 4, 9, 7, 4, 6}, 
            {6, 3, 7, 7, 9, 3, 8, 9}
        };

        System.out.println("Введите количество поворотов массива, где 1 поворот равен 90 градусов.");
        int reverse = scQustion.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length; j++) {
                arr[i][j] = j + 1;
            }
        }
        
        for (int x = 0; x < reverse; x++) {
			for (int i = 0; i < arr.length / 2; i++) {
				for (int j = 0; j < arr.length / 2 + arr.length % 2; j++) {
					int tmp = arr[i][j];
					arr[i][j] = arr[arr.length - 1 - j][i];
					arr[arr.length - 1 - j][i] = arr[arr.length - 1 - i][arr.length
							- 1 - j];
					arr[arr.length - 1 - i][arr.length - 1 - j] = arr[j][arr.length
							- 1 - i];
					arr[j][arr.length - 1 - i] = tmp;
				}
			}
		}

        for (int i = 0; i < arr.length; i++) {
		System.out.println(Arrays.toString(arr[i]));
		}
    }

}
