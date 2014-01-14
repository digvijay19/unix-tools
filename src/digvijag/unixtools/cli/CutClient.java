package digvijag.unixtools.cli;

import digvijag.filesystem.MyFileReader;
import digvijag.unixtools.lib.CutOperations;

public class CutClient {
    public static void main(String[] args) {
        MyFileReader rf = new MyFileReader();
        CutOperations operations = new CutOperations();
        String fileName, fileData, delimiter, result;
        try {
            int field = operations.getField(args);
            delimiter = operations.getDelimiter(args);
            fileName = operations.getFileName(args);
            fileData = rf.readFile(fileName);
            result = operations.getCutResult(fileData, delimiter, field) ;
            System.out.println(result);
        } catch (Exception e){
            System.err.println("Something went wrong");
        }
    }
}
