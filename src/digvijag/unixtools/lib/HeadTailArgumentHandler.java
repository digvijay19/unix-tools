package digvijag.unixtools.lib;

public class HeadTailArgumentHandler {
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
