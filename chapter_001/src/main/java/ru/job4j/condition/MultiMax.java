package ru.job4j.condition;

//находим максимальное число из трех чисел
public class MultiMax {
    public int max(int first, int second, int third) {
        //вбираем максимальное из первых двух
        int result = first > second ? first : second;
        //выбираем максимальное из первых двух и третьего
        result = result > third ? result : third;
        return result;
    }
}
