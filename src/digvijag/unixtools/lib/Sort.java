package digvijag.unixtools.lib;

import java.util.Arrays;
import java.util.Collections;

public class Sort {

    public String sortData(String fileData) {
        String lines[] = fileData.split("\r\n");
        Collections.sort(Arrays.asList(lines));
        StringBuilder result = new StringBuilder();
        for (String line : lines) {
            result.append(line);
            result.append("\r\n");
        }
        return result.toString().trim();
    }
}
