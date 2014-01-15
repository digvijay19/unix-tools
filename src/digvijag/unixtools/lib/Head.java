package digvijag.unixtools.lib;

public class Head {

    public String getHeadLines(String fileData, int numberOflines) {

        String[] lines = fileData.split("\r\n");
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < numberOflines && i < lines.length) {
            result.append(lines[i]);
            result.append("\r\n");
            i++;
        }
        return result.toString().trim();
    }
}