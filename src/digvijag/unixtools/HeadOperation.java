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
                return Integer.parseInt(arg.replace("-n",""));
            }
        }
        return 10;
    }
}
