package ru.job4j.condition;
/*public class SqMax {
    public static int max(int first, int second, int third, int forth) {
        int result = forth;
        if (first > second) {
            if (first > third) {
                if (first > forth) {
                    result = third;
                }
            }
        } else if (second > third) {
            if (second > forth) {
                result = first;
            }
        } else if (third > forth) {
            result = second;
        }
        return result;
    }
}
По моему мнению ошибка был в неверном оформлении оператора условия if, при первом отрецательном ответе условия
вся проверка заканчивалась
так же была ошибка в присвоении итогового значения переменной result
 */
public class SqMax {
    public static int max(int first, int second, int third, int forth) {
        int result = forth;
        if (first > second && first > third && first > forth) {
                    result = first;
                } else if (second > third && second > forth) {
                result = second;
            } else if (third > forth) {
            result = third;
        }
        return result;
    }
}

