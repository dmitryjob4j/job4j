package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish){
        int count = 0;
        //Заводим масив диапозона чисел
        for (int number = 1; number <= finish; number++){
            //Проверяем простое число или нет
            if (CheckPrimeNumber.check(number)){
                count += 1;
            }
        }
        return count;
    }
}
