package digvijag.unixtools;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class UniqOperationsTest {
    @Test
    public void testGetUniqueData() throws Exception {
        String data = "a\r\na\r\nb\r\na";
        String expected = "a\r\nb\r\na";
        String actual = new UniqOperations().getUniqueData(data);
        System.out.println(actual);
        assertEquals(expected,actual);
    }
}
