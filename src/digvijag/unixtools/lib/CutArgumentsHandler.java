package digvijag.unixtools.lib;

public class CutArgumentsHandler {

    public int getField(String[] args) {

        for (String arg : args) {
            if(arg.matches("-f.")){
                return Integer.parseInt(arg.replace("-f", ""));
            }
        }
        return 1;
    }

    public String getDelimiter(String[] args) {
        for (String arg : args) {
            if(arg.matches("-d.")){
                return arg.replace("-d", "");
            }
        }
        return " ";
    }

    public String getFileName(String[] args) {

        for (String arg : args) {
            if(!arg.startsWith("-")){
                return arg;
            }
        }
        return null;
    }
}
