import org.junit.Test;
import ru.test.ru.Numbers;

import static org.junit.Assert.*;

public class NumbersTest {

    @Test
    public void main() throws Exception{
        Numbers numbers = new Numbers();
        int actual = numbers.sum(7);
        int expected = 10;
        assertEquals(expected,actual);
    }
}