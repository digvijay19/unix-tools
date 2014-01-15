package digvijag.unixtools.lib;

public class WcArgumentsHandler {

    public String getFileName(String[] args) {
        for (String arg : args) {
            if (!arg.startsWith("-")) {
                return arg;
            }
        }
        return null;
    }
}
