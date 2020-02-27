package ru.job4j.converter;
import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {
    @Test
    public void rubleToEuro() {
        int in = 140; // количество евро, переменная для метода
        int expected = 2; // предпологаемое значение при цене 1 Euvro = 70 р
        int out = Converter.rubleToEvro(in); // значение которое выдает метод
        Assert.assertEquals(expected, out); // тестирование и сравнение предпологаемого значения и результата метода
    }
    @Test
    public void rubleToDollar(){
        int in = 300; // количество долларов, переменная для метода
        int expected =5; // предпологаемое значение при цене 1$ = 60 р
        int out = Converter.rubleToDollar(in); // значение которое выдает метод
        Assert.assertEquals(expected, out); // тестирование и сравнение предпологаемого значения и результата метода
    }
}
