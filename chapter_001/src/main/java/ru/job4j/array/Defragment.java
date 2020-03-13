package ru.job4j.array;

/**
 * class Defragment сортирует массив, ячейки null переносит в конец, заполненые ячейки в начало
 *
 * @author dstepanov
 * @version 1
 * @since 10.03.2020
 */
public class Defragment {
    /**
     * compress - метод дефрагментирует заданный массив String
     *
     * @param array - заданный массив
     * @return - возвращает результат
     */
    public static String[] compress(String[] array) {
        String temp;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                int point = i;
                temp = array[i];
                while (point < array.length - 1) {
                    if (array[point + 1] != null) {
                        array[i] = array[point + 1];
                        array[point + 1] = temp;
                        break;
                    } else {
                        point += 1;
                    }
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int i = 0; i < compressed.length; i++) {
            System.out.print(compressed[i] + " ");
        }
    }
}
