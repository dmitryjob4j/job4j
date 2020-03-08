package ru.job4j.array;

/**
 * class сортирует элементы массива по возростанию
 *
 * @author dstepanov
 * @version 1
 * @since 08.03.2020
 */
public class SortSelected {
    /**
     * метод использует class MinDiapason.findMin для поиска минимального элемента
     * и метод FindLoop для определения индекса этого элемента в массиве.
     *
     * @param data массив который необходимо отсортировать по возростанию
     * @return результат сортировки
     */
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            int temp = data[i];
            data[i] = data[index];
            data[index] = temp;
        }
        return data;
    }
}
