package digvijag.unixtools;

public class UniqOperations {

    public String getUniqueData(String fileData) {

        String[] lines = fileData.split("\r\n");
        String result = "";
        for (int i = 0; i < lines.length - 1; i++) {
            if (!lines[i].equals(lines[i + 1])) {
                result += lines[i] + "\r\n";
            }
        }
        result += lines[lines.length - 1];
        return result.trim();
    }
}