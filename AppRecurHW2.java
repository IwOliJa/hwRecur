package com.telran.algo.hw;

import java.util.Arrays;

public class AppRecurHW2 {
    public static void main(String[] args) {

        //Second level: Задача 2. Дан массив, написать рекурсивный метод нахождения максимального элемента
        // в этом массиве. Максимальное число вывести в консоль.

        //int[] arr = new int[] {};
        int[] arr = {3, 8, 2, 45, 10, 11, 72, 6, 12, 64, 5};


        int index = 0;
        //int max = 0;
        System.out.println(findMax(arr, index));

    }

    public static int findMax(int[] arr, int index) {
        int max = 0;
        if (index < arr.length) {
            max = arr[index];
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = findMax(arr, i);
                }
            }
            return max;
        } else {
            System.out.println("Elements are not included!");
            return -1;
        }
    }
}




//---------------------------------------------------------------------------------------------------------

      /* 2.способ:
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int max = arr[arr.length - 1];
        System.out.println("Maximum number = " + max);
    }
}
*/
        /* 3.способ
        int max = 0;
        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        System.out.println(max);
        System.out.println(arr[max]);
    }
}

*/




