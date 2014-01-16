package digvijag.unixtools.cli;

import digvijag.filesystem.MyFileReader;
import digvijag.unixtools.lib.Cut;
import digvijag.unixtools.lib.CutArgumentsHandler;

public class CutClient {
    public static void main(String[] args) {
        MyFileReader rf = new MyFileReader();
        Cut operations = new Cut();
        CutArgumentsHandler cutArgumentsHandler = new CutArgumentsHandler();
        String fileName, fileData, delimiter, result;
        try {
            int[] fields = cutArgumentsHandler.getFields(args);
            delimiter = cutArgumentsHandler.getDelimiter(args);
            fileName = cutArgumentsHandler.getFileName(args);
            fileData = rf.readFile(fileName);
            result = operations.getCutResult(fileData, delimiter, fields[0]) ;
            System.out.println(result);
        } catch (Exception e){
            System.err.println("Something went wrong");
        }
    }
}
