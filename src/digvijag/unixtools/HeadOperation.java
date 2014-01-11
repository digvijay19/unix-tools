package digvijag.unixtools;

public class HeadOperation {

    public String getHeadLines(String fileData, int numberOflines) {

        String[] lines = fileData.split("\r\n");
        String result = "";
        int i = 0;

        while (i < numberOflines && i < lines.length) {
            result += "\r\n" + lines[i];
            i++;
        }
        return result.trim();
    }
}
