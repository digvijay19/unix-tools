package digvijag.unixtools.lib;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class HeadTailArgumentHandlerTest {
    HeadTailArgumentHandler operations = new HeadTailArgumentHandler();
    @Test
    public void testGetFileName() throws Exception {
        String[] args = {"a.txt"};
        String fileName = operations.getFileName(args);
        assertEquals(fileName, "a.txt");
    }

    @Test
    public void test_GetFileName_when_filename_not_specified() throws Exception {
        String[] args = {"-n5"};
        String fileName = operations.getFileName(args);
        assertEquals(fileName, null);
    }

    @Test
    public void test_GetNumberOfLines_when_number_of_lines_specified() throws Exception {
        String[] args = {"-n5", "a.txt"};
        int actual = operations.getNumberOfLines(args);
        assertEquals(actual, 5);
    }

    @Test
    public void test_getNumberOfLines_when_number_not_specified() throws Exception {
        String[] args = {"a.txt"};
        int actual = operations.getNumberOfLines(args);
        assertEquals(actual, 10);
    }
}
