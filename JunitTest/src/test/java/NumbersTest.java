import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersTest {

    @Test
    public void main() throws Exception{
        Numbers numbers = new Numbers();
        int actual = numbers.sum(5);
        int expected = 10;
        assertEquals(expected,actual);
    }
}