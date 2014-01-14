package digvijag.unixtools;

import digvijag.unixtools.lib.CutOperations;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CutOperationsTest {
    @Test
    public void testGetField() throws Exception {
        CutOperations operations = new CutOperations();
        String[] args = {"-f1","-d ","a.txt"};
        int field = operations.getField(args);
        assertEquals(field,0);
    }

    @Test
    public void testGetDelimiter() throws Exception {
        CutOperations operations = new CutOperations();
        String[] args = {"-f1","-d ","a.txt"};
        String delimiter = operations.getDelimiter(args);
        assertEquals(delimiter," ");
    }

    @Test
    public void testGetFileName() throws Exception {
        CutOperations operations = new CutOperations();
        String[] args = {"-f1","-d ","a.txt"};
        String fileName = operations.getFileName(args);
        assertEquals(fileName,"a.txt");
    }

    @Test
    public void testGetCutResult() throws Exception {
        CutOperations operations = new CutOperations();
        String data = "a b c";
        String result = operations.getCutResult(data," ",0);
        assertEquals(result,"a");
    }
}
