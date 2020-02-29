package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
public class MultiMaxTest {
    //тест когда максимальное первое из трех
    @Test
    public void whenFirstMax(){
        MultiMax check = new MultiMax();
        int result = check.max(15,7,11);
        assertThat(result, is(15));
    }
    //тест когда максимальное второе из трех
    @Test
    public void whenSecondMax(){
        MultiMax check = new MultiMax();
        int result = check.max(7,27,9);
        assertThat(result, is(27));
    }
    //тест когда максимальное третье из трех
    @Test
    public void whenThirdMax(){
        MultiMax check = new MultiMax();
        int result = check.max(21,99,114);
        assertThat(result,is(114));
    }
    //тест все числа одинаковые
    @Test
    public void whenAllMax(){
        MultiMax check = new MultiMax();
        int result =check.max(33,33,33);
        assertThat(result,is(33));
    }
}
