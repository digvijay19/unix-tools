package digvijag.unixtools.lib;

public class WcOperations {
    int totalWords = 0;
    String fileData = "";

    public WcOperations(String fileData) {
        this.fileData = fileData;
    }

    public int countChars() {
        return fileData.length();
    }

    public int countLines() {
        String[] lines = fileData.split("\r\n");
        return lines.length;
    }

    public int countWords() {
        String[] lines = fileData.split("\r\n");
        for (String item : lines) {
            totalWords += item.split(" ").length;
        }
        return totalWords;
    }
}