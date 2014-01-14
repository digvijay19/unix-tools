package digvijag.unixtools;

import digvijag.unixtools.lib.WcOperations;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class WcOperationsTest {
    @Test
    public void testCountChars() throws Exception {
        WcOperations operation = new WcOperations();
        int expected = 5;
        int actual = operation.countChars("abcde");
        assertEquals(actual, expected);
    }

    @Test
    public void testCountLines() throws Exception {
        WcOperations operation = new WcOperations();
        int expected = 2;
        int actual = operation.countLines("abcde\r\ndw");
        assertEquals(actual, expected);
    }

    @Test
    public void testCountWords() throws Exception {
        WcOperations operation = new WcOperations();
        int expected = 3;
        int actual = operation.countWords("ab cd e");
        assertEquals(actual, expected);
    }
}
