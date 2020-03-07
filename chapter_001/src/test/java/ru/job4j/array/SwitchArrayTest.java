package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap1to6() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expect = {1, 7, 3, 4, 5, 6, 2, 8};
        int[] rsl = SwitchArray.swap(input, 1, 6);
        assertThat(rsl, is(expect));
    }
}
