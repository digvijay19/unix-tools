package digvijag.unixtools.lib;

public class Cut {

    public int getField(String[] args) {

        for (String arg : args) {
            if(arg.matches("-f.")){
                return Integer.parseInt(arg.replace("-f", ""))-1;
            }
        }
        return 0;
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
