package ru.job4j.loop;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
public class CheckPrimeNumberTest {
    //проверяем простое ли число 5
    @Test
    public void when5(){
        boolean rsl = CheckPrimeNumber.check(5);
        assertThat(rsl, is(true));
    }
    //проверяем простое ли число 4
    @Test
    public void when4(){
        boolean rsl = CheckPrimeNumber.check(4);
        assertThat(rsl, is(false));
    }
    //проверяем простое ли число 1
    @Test
    public void when1(){
        boolean rsl = CheckPrimeNumber.check(1);
        assertThat(rsl, is(false));
    }
}
