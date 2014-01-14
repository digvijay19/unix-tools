package digvijag.unixtools.cli;

import digvijag.filesystem.MyFileReader;
import digvijag.unixtools.lib.Cut;

public class CutClient {
    public static void main(String[] args) {
        MyFileReader rf = new MyFileReader();
        Cut operations = new Cut();
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
