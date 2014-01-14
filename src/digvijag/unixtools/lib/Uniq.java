package digvijag.unixtools.lib;

public class Uniq {

    public String getUniqueData(String fileData) {

        String[] lines = fileData.split("\r\n");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < lines.length - 1; i++) {
            if (!lines[i].equals(lines[i + 1])) {
                result.append(lines[i]);
                result.append("\r\n");
            }
        }
        result.append(lines[lines.length - 1]);
        return result.toString().trim();
    }
}