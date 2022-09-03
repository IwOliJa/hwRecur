package com.telran.algo.hw;

import java.util.Arrays;

public class AppSortHW2 {
    public static void main(String[] args) {
        String[] array = {
                "",
                "Kirova",
                "Fjodorov",
                "Darjina",
                "Cvetkova",
                "Aleksejev",
                "Volgina",
                "Grigorjan",
                "Borovik",
                "Pavlecuk",
                "Zubov"};
                 //j = 0;
        for (int j = 1; j < array.length; j++) {
            int maxPos = j;
            for (int i = j; i < array.length; i++) {
                if (array[i].compareTo(array[maxPos]) < 0) {
                    maxPos = i;
                }
            }
            String temp = array[j];
            array[j] = array[maxPos];
            array[maxPos] = temp;
            System.out.print(System.lineSeparator() + j + " - " + array[j]);
        }
        System.out.println(System.lineSeparator());
        System.out.println(Arrays.toString(array));
    }
}
