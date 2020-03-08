package ru.job4j.array;

/**
 * Class поиск элемнта в массиве прямым перебором.
 *
 * @author dstepanov
 * @version 2
 * @since 07.03.2020
 * @since 08.03.2020
 */
public class FindLoop {
    /**
     * @param data - масиив
     * @param el   - элемент массива вокорый необходима найти
     * @return rst - резаультат поиска
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * indexOF2 метод ищет в масиве элемент в заданном диапозоне.
     *
     * @param data   - массив
     * @param el     - искомый элемент
     * @param start  - место начала поиска
     * @param finish - место конца посика
     * @return - возврощение результата посика
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
