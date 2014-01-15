package digvijag.unixtools.lib;

public class Tail {
    public String getTailLines(String fileData, int numberOfLines) {
        String[] lines = fileData.split("\r\n");
        StringBuilder result = new StringBuilder();

        int i = lines.length - numberOfLines;
        if (i < 0) i = 0;
        while (i < lines.length) {
            result.append(lines[i]);
            result.append("\r\n");
            i++;
        }
        return result.toString().trim();
    }
}
