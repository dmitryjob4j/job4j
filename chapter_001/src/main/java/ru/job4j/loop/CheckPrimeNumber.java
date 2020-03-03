package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check (int number){
        boolean prime = true;
        //проверяем ранво ли чесло 1 елси да то это не простое
        if (number == 1) {
         prime = false;
        }
        else{
            for (int index = 2; index <= number; index++) {
                //проверяем числа от 2 до number - 1 делимость по модулю
                if (number % index == 0 || number % (number - 1) == 0) {
                    prime = false;
                    //иначе число простое
                } else break;
            }
        }
        return prime;
    }
}
