package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test // Второе число больше первого
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test //Первое число больше второго
    public void whenMax5To3Then5() {
        int result = Max.max(5, 3);
        assertThat(result, is(5));
    }

    @Test //Второе число больше первого
    public void whenMax10To55Then55() {
        int result = Max.max(10, 55);
        assertThat(result, is(55));
    }

    @Test //оба числа равны выводится любое из сиел
    public void whenMax7To7Then7() {
        int result = Max.max(7, 7);
        assertThat(result, is(7));
    }
}
