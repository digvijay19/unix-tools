package digvijag.unixtools.cli;

import digvijag.filesystem.MyFileReader;
import digvijag.unixtools.lib.Tail;

public class TailClient {
    public static void main(String[] args) {
        String fileName, fileData, result = "";
        Tail operations = new Tail();
        int numberOfLines;

        try {
            fileName = operations.getFileName(args);
            numberOfLines = operations.getNumberOfLines(args);
            fileData = new MyFileReader().readFile(fileName);
            result = operations.getTailLines(fileData, numberOfLines);
        } catch (Exception e) {
            System.err.println("Something went wrong");
        }
        System.out.println(result);
    }
}
