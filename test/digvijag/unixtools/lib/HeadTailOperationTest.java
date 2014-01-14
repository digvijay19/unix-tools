package digvijag.unixtools.lib;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class HeadTailOperationTest {
    Head operations = new Head();

    @Test
    public void testGetHeadLines() throws Exception {
        String data = "a\r\nb\r\nc\r\nd\r\ne\r\nf";
        String expected = "a\r\nb\r\nc\r\nd\r\ne";
        String actual = operations.getHeadLines(data, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetFileName() throws Exception {
        String[] args = {"a.txt"};
        String fileName = operations.getFileName(args);
        assertEquals(fileName, "a.txt");
    }

    @Test
    public void testGetNumberOfLines() throws Exception {
        String[] args = {"-n5", "a.txt"};
        int actual = operations.getNumberOfLines(args);
        assertEquals(actual, 5);
    }
}
