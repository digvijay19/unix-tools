package digvijag.unixtools;

public class CutOperations {

    public int getField(String[] args) {

        for (String arg : args) {
            if(arg.matches("-f.")){
                return Integer.parseInt(arg.replace("-f", ""))-1;
            }
        }
        return 0;
    }

    public String getDelimeter(String[] args) {
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
