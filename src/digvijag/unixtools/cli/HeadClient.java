package digvijag.unixtools.cli;

import digvijag.filesystem.MyFileReader;
import digvijag.unixtools.lib.HeadTailOperation;

public class HeadClient {
    public static void main(String[] args) {
        String fileName, fileData, result = "";
        HeadTailOperation operations = new HeadTailOperation();
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