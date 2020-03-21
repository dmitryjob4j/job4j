package ru.job4j.condition;

/**
 * 3. Перегрузить метод max для трех чисел[#242912]
 *
 * @since 21.03.2020
 */
public class Max {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        return first > max(second, third) ? first : max(second, third);
    }

    public static int max(int first, int second, int third, int fourth) {
        return first > max(second, third, fourth) ? first : max(second, third, fourth);
    }
}
