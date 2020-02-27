package ru.job4j.converter;

public class Converter {
    public static int rubleToEvro(int value){
        int rsl = value / 70; // формула перевода рубли в евро = 70.
        return rsl;
    }
    public static int rubleToDollar(int value){
        int rsl = value / 60; // формула перевода рубли в доллары = 60.
        return rsl;
    }
    public static void main(String[] args){
        int euro = Converter.rubleToEvro(140);
        int dollar = Converter.rubleToDollar(300);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("300 rubles are " + dollar + " dollar.");
        int in = 140;
        int expected = 2;
        int out = rubleToEvro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 evro. Test result " + passed);
        in = 300;
        expected = 4;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("300 rubles are 4 dollar. Test result " + passed);
    }
}