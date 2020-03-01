package ru.job4j.loop;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
public class CounterTest {
    //Тест подсчета четных чисел в диапозоне от 1 до 10
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty(){
        int rsl = Counter.sumByEven(1,10);
        int expected = 30;
        assertThat(rsl,is(expected));
    }
    //Тест подсчета четных чисел в диапозоне от 5 до 19
    @Test
    public void whenSumEvenNumbersFromFiveToNineteen(){
        int rsl = Counter.sumByEven(5,19);
        int expected = 84;
        assertThat(rsl, is(expected));
    }
}
