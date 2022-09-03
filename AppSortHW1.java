package com.telran.algo.hw;

import java.util.Arrays;

public class AppSortHW1 {
    public static void main(String[] args) {
        String[] array = {"",
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

        for (int j = array.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (array[i + 1].compareTo(array[i]) < 0) {
                    String temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        for (int j = 1; j < array.length; j++)
            System.out.print(System.lineSeparator() + j + " - " + array[j]);
        System.out.println(System.lineSeparator());
        System.out.println(Arrays.toString(array));
    }
}
