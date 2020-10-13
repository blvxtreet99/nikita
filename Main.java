package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static float getMedian(int[] arrayFindingMedian)  //Медиана
    {
        Arrays.sort(arrayFindingMedian);
        if (arrayFindingMedian.length % 2 == 0)
        {
            return ((arrayFindingMedian[arrayFindingMedian.length / 2] + arrayFindingMedian[arrayFindingMedian.length / 2 - 1]) / 2f);
        }

        return arrayFindingMedian[arrayFindingMedian.length / 2];
    }

    public static void main(String[] args) {
        int[] a = new int[5];//Длина Массива
        {
            int i = 0;
            int buf;
            boolean isSorted = false;
            Scanner in = new Scanner(System.in);

            for (int element : a) {

                System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
                a[i] = in.nextInt();

                System.out.println("Вы ввели: " + a[i]);

                i++;
            }
            System.out.println("1.Исходный массив = " +Arrays.toString(a));

            while (!isSorted) { //сортировка пузырьком
                isSorted = true;
                for (int j = 0; j < a.length - 1; j++) {
                    if (a[j] > a[j + 1]) {
                        isSorted = false;

                        buf = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = buf;
                    }
                }
            }

            int arrayLength = a.length;
            System.out.println("\n2.Длинна массива = " + arrayLength);
            System.out.println("\n3.Сортировка = " +Arrays.toString(a));
            System.out.println("\n4.Медиана: " + getMedian(a));
        }
    }
}
