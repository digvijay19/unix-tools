package digvijag.unixtools.lib;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class WcOperationsTest {

    @Test
    public void test_count_characters_in_a_single_line() throws Exception {
        WC operation = new WC("abcdefghij");
        int expected = 10;
        int actual = operation.countChars();
        assertEquals(actual, expected);
    }

    @Test
    public void test_count_characters_when_multiple_lines_are_present() throws Exception {
        WC operation = new WC("abcde\r\nfghij");
        int expected = 12;
        int actual = operation.countChars();
        assertEquals(actual, expected);
    }

    @Test
    public void test_Count_Lines() throws Exception {
        WC operation = new WC("abcde\r\ndw");
        int expected = 2;
        int actual = operation.countLines();
        assertEquals(actual, expected);
    }

    @Test
    public void test_count_lines_when_empty_line_is_present_in_end() throws Exception {
        WC operation = new WC("abcde\r\nfghij\r\n");
        int expected = 2;
        int actual = operation.countLines();
        assertEquals(actual, expected);
    }

    @Test
    public void test_Count_Words_in_a_single_line() throws Exception {
        WC operation = new WC("ab cd e");
        int expected = 3;
        int actual = operation.countWords();
        assertEquals(actual, expected);
    }

    @Test
    public void test_Count_Words_in_a_multiple_lines() throws Exception {
        WC operation = new WC("ab cd e\r\nhello world\r\nhi");
        int expected = 6;
        int actual = operation.countWords();
        assertEquals(actual, expected);
    }

    @Test
    public void test_count_words_when_multiple_spaces_are_present() throws Exception {
        WC operation = new WC("ab   cd");
        int expected = 2;
        int actual = operation.countWords();
        assertEquals(actual, expected);
    }
}