package digvijag.unixtools.lib;

public class Cut {

    public String getCutResult(String fileData, String delimiter, int field) {
        StringBuilder result = new StringBuilder();
        String lines[] = fileData.split("\r\n");
        for (String line : lines) {
            String[] fields = line.split(delimiter);
            result.append(fields[field]);
            result.append("\r\n");
        }
        return result.toString().trim();
    }
}
