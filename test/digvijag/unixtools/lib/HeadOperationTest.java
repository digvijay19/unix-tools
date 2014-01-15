package digvijag.unixtools.lib;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class HeadOperationTest {
    Head operations = new Head();

    @Test
    public void test_GetHeadLines_when_lines_are_available() throws Exception {
        String data = "a\r\nb\r\nc\r\nd\r\ne\r\nf";
        String expected = "a\r\nb\r\nc\r\nd\r\ne";
        String actual = operations.getHeadLines(data, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void test_GetHeadLines_when_lines_are_not_available() throws Exception {
        String data = "a\r\nb\r\nc";
        String expected = "a\r\nb\r\nc";
        String actual = operations.getHeadLines(data, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void test_GetHeadLines_when_number_of_lines_is_negative() throws Exception {
        String data = "a\r\nb\r\nc";
        String expected = "";
        String actual = operations.getHeadLines(data, -1);
        assertEquals(expected, actual);
    }

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
