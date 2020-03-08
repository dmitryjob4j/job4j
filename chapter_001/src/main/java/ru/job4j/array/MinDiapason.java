package ru.job4j.array;

/**
 * class выбирает элемент массива в заданнойм диапозоне
 *
 * @author dstepanov
 * @version 1
 * @since 08.03.2020
 */
public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i <= finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
