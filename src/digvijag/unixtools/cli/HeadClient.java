package digvijag.unixtools.cli;

import digvijag.filesystem.MyFileReader;
import digvijag.unixtools.lib.Head;

public class HeadClient {
    public static void main(String[] args) {
        String fileName, fileData, result = "";
        Head operations = new Head();
        int numberOfLines;

        try {
            fileName = operations.getFileName(args);
            numberOfLines = operations.getNumberOfLines(args);
            fileData = new MyFileReader().readFile(fileName);
            result = operations.getHeadLines(fileData, numberOfLines);

        } catch (Exception e) {
            System.err.println("Something went wrong");
        }
        System.out.println(result);
    }
}