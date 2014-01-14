package digvijag.unixtools.lib;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class UniqOperationsTest {
    @Test
    public void testGetUniqueData() throws Exception {
        String data = "a\r\na\r\nb\r\na";
        String expected = "a\r\nb\r\na";
        String actual = new Uniq().getUniqueData(data);
        assertEquals(expected,actual);
    }
}
