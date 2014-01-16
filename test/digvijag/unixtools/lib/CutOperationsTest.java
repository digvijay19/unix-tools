package digvijag.unixtools.lib;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CutOperationsTest {

    @Test
    public void testGetCutResult() throws Exception {
        Cut operations = new Cut();
        String data = "a b c";
        String result = operations.getCutResult(data, " ", 0);
        assertEquals(result, "a");
    }
}
