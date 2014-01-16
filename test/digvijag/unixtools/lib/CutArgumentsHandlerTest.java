package digvijag.unixtools.lib;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CutArgumentsHandlerTest {
    CutArgumentsHandler operations = new CutArgumentsHandler();

    @Test
    public void test_GetField_when_field_option_is_given() throws Exception {
        String[] args = {"-f2", "-d ", "a.txt"};
        int field = operations.getField(args);
        assertEquals(field, 2);
    }

    @Test
    public void test_GetField_when_field_option_is_not_given() throws Exception {
        String[] args = {"-d ", "a.txt"};
        int field = operations.getField(args);
        assertEquals(field, 1);
    }

    @Test
    public void test_GetField_when_field_option_is_given_but_number_is_not_specified() throws Exception {
        String[] args = {"-f", "-d ", "a.txt"};
        int field = operations.getField(args);
        assertEquals(field, 1);
    }

    @Test
    public void test_GetDelimiter_when_delimeter_is_specified() throws Exception {
        String[] args = {"-f1", "-da", "a.txt"};
        String delimiter = operations.getDelimiter(args);
        assertEquals(delimiter, "a");
    }

    @Test
    public void test_GetDelimiter_when_delimeter_is_not_specified() throws Exception {
        String[] args = {"-f1", "a.txt"};
        String delimiter = operations.getDelimiter(args);
        assertEquals(delimiter, " ");
    }

    @Test
    public void testGetFileName() throws Exception {
        String[] args = {"-f1", "-d ", "a.txt"};
        String fileName = operations.getFileName(args);
        assertEquals(fileName, "a.txt");
    }

    @Test
    public void test_GetFileName_when_filename_is_not_specified() throws Exception {
        String[] args = {"-f1", "-d "};
        String fileName = operations.getFileName(args);
        assertEquals(fileName,null);
    }
}
