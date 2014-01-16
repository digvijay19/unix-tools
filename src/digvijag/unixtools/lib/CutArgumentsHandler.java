package digvijag.unixtools.lib;

public class CutArgumentsHandler {

    public int[] getFields(String[] args) {

        for (String arg : args) {
            if (arg.startsWith("-f")) {
                String[] fieldsInString = arg.replace("-f", "").split(",");
                int[] fields = new int[fieldsInString.length];
                for (int i = 0; i < fieldsInString.length; i++) {
                    fields[i] = Integer.parseInt(fieldsInString[i]);
                }
                return fields;
            }
        }
        return new int[]{1};
    }

    public String getDelimiter(String[] args) {
        for (String arg : args) {
            if (arg.matches("-d.")) {
                return arg.replace("-d", "");
            }
        }
        return " ";
    }

    public String getFileName(String[] args) {

        for (String arg : args) {
            if (!arg.startsWith("-")) {
                return arg;
            }
        }
        return null;
    }
}
