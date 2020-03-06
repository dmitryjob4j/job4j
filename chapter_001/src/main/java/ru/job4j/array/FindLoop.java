package ru.job4j.array;

/**
 * Class поиск элемнта в массиве прямым перебором.
 *
 * @author dstepanov
 * @version 1
 * @since 07.03.2020
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
}
