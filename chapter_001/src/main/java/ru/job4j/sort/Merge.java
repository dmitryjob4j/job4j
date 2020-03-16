package ru.job4j.sort;

import java.util.Arrays;

/**
 * class Merge обьединяет два сортированных массива в третий сортированный массив.
 *
 * @author dstepanov
 * @version 1
 * @since 16.09.2020
 */
public class Merge {
    /**
     * @param left  - массив(сорт) для сливания 1
     * @param right - массив(сорт) для сливания 2
     * @return rsl - результат
     */
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int l = 0;
        int r = 0;
        while (i < rsl.length) {
            if (l > left.length - 1) {
                rsl[i++] = right[r++];
            } else if (r > right.length - 1) {
                rsl[i++] = left[l++];
            } else if (left[l] < right[r]) {
                rsl[i++] = left[l++];
            } else {
                rsl[i++] = right[r++];
            }
        }
        return rsl;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[]{1, 3, 5},
                new int[]{2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
