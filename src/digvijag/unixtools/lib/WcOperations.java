package digvijag.unixtools.lib;

public class WcOperations {
    int totalWords = 0;

    public int countChars(String text) {
        return text.length();
    }

    public int countLines(String text) {
        String[] lines = text.split("\r\n");
        return lines.length;
    }

    public int countWords(String text) {
        String[] lines = text.split("\r\n");
        for (String item : lines) {
            totalWords += item.split(" ").length;
        }
        return totalWords;
    }
}