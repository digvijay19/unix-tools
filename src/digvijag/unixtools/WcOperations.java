package digvijag.unixtools;

class WcOperations {
    int totalWords = 0;

    int countChars(String text) {
        return text.length();
    }

    int countLines(String text) {
        String[] lines = text.split("\r\n");
        return lines.length;
    }

    int countWords(String text) {
        String[] lines = text.split("\r\n");
        for (String item : lines) {
            totalWords += item.split(" ").length;
        }
        return totalWords;
    }
}