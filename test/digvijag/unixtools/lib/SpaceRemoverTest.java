package digvijag.unixtools.lib;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SpaceRemoverTest {
    @Test
    public void testRemoveExtraSpaces() throws Exception {
        SpaceRemover spaceRemover = new SpaceRemover();
        String input = "hello                 world";
        String expected = "hello world";
        String actual = spaceRemover.removeExtraSpaces(input);
        assertEquals(expected,actual);
    }
}