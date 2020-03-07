package ru.job4j.array;

/**
 * Class переставляет элементы массива
 *
 * @author dstepanov
 * @version 1.1
 * @since 07.03.2020
 */
public class SwitchArray {
    /**
     * swap менеят местами указанные элементы
     *
     * @param array  - массив
     * @param source - элемент который нужно поменяять на dest
     * @param dest   - элемент который нужно поменять на source
     * @return - возврощает перестановленный массив array
     */
    public static int[] swap(int[] array, int source, int dest) {
        if (source >= 0 && source <= array.length - 1 && dest >= 0 && dest <= array.length - 1) {
            int temp = array[source];
            array[source] = array[dest];
            array[dest] = temp;
        }
        return array;
    }

    /**
     * Метод который меняет местами элементы местами
     *
     * @param array - масиив в котором нужно поменять первый и последний элемент местами
     * @return - возврощает результат перестановки
     */
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    /**
     * метов который заджает массив и выводит на экран результат перестановки
     *
     * @param args выводит результат
     */

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
}
