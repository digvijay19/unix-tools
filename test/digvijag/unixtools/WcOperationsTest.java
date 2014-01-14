package digvijag.unixtools;

import digvijag.unixtools.lib.WcOperations;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class WcOperationsTest {
    @Test
    public void testCountChars() throws Exception {
        WcOperations operation = new WcOperations("abcde");
        int expected = 5;
        int actual = operation.countChars();
        assertEquals(actual, expected);
    }

    @Test
    public void testCountLines() throws Exception {
        WcOperations operation = new WcOperations("abcde\r\ndw");
        int expected = 2;
        int actual = operation.countLines();
        assertEquals(actual, expected);
    }

    @Test
    public void testCountWords() throws Exception {
        WcOperations operation = new WcOperations("ab cd e");
        int expected = 3;
        int actual = operation.countWords();
        assertEquals(actual, expected);
    }
}
