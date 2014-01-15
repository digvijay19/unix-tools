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
}
