package ru.job4j.condition;

public class Max {
    public static int max(int first, int second){
//тернерный оператор выбираем максимальное число
        int maxNumb = first > second ? first : second;
        return  maxNumb;
    }
}
