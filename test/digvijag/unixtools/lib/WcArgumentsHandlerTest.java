package digvijag.unixtools.lib;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class WcArgumentsHandlerTest {
    @Test
    public void test_GetFileName_when_file_name_is_present() throws Exception {
        String[] args = {"-l","-c","a.txt"};
        String expected = "a.txt";
        String actual = new WcArgumentsHandler().getFileName(args);
        assertEquals(expected,actual);
    }

    @Test
    public void test_GetFileName_when_file_name_is_not_present() throws Exception {
        String[] args = {"-l","-c"};
        String actual = new WcArgumentsHandler().getFileName(args);
        assertEquals(null,actual);
    }
}
