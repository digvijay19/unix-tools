package digvijag.unixtools.lib;

public class HeadTailOperation {

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

    public String getTailLines(String fileData, int numberOfLines) {
        String[] lines = fileData.split("\r\n");
        StringBuilder result = new StringBuilder();

        int i = lines.length - numberOfLines;
        while (i < lines.length) {
            result.append(lines[i]);
            result.append("\r\n");
            i++;
        }
        return result.toString().trim();
    }

    public String getFileName(String[] args) {

        for (String arg : args) {
            if (!arg.startsWith("-")) {
                return arg;
            }
        }
        return null;
    }

    public int getNumberOfLines(String[] args) {
        for (String arg : args) {
            if (arg.startsWith("-n")) {
                return Integer.parseInt(arg.replace("-n", ""));
            }
        }
        return 10;
    }
}