package digvijag.unixtools.lib;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SortTest {
    @Test
    public void testSortData() throws Exception {
        String input = "c\r\na\r\nb";
        String expected = "a\r\nb\r\nc";
        Sort sort = new Sort();
        String actual = sort.sortData(input);
        assertEquals(expected, actual);
    }
}