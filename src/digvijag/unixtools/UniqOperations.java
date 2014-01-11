package digvijag.unixtools;

public class UniqOperations {

    public String getUniqueData(String fileData) {

        String[] lines = fileData.split("\r\n");
        String result = "";
        System.out.println(lines[0]);
        for (int i = 1; i < lines.length; i++) {
            if (!lines[i].equals(lines[i - 1])) {
                result += "\r\n" + lines[i];
            }
        }
        return result.trim();
    }
}
