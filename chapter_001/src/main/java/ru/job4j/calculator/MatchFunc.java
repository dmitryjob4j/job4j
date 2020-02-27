package ru.job4j.calculator;

public class MatchFunc {
    public static int func1(int x){
        int y = x * x + 1;
        return y;
    }
    public static int func2(int x){
        int y = x * 10;
        return y;
    }
    public static void main(String[] args){
       int result1 = MatchFunc.func1(3);
       int result2 = MatchFunc.func2(5);
       int total = result1 + result2;
       System.out.println(total);
    }
}
