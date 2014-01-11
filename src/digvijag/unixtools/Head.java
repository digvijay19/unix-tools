package digvijag.unixtools;

import digvijag.filesystem.FileReaders;

public class Head {
    public static void main(String[] args) {
        String fileName, fileData, result = "";
        HeadTailOperation operations = new HeadTailOperation();
        int numberOfLines;

        try {
            fileName = operations.getFileName(args);
            numberOfLines = operations.getNumberOfLines(args);
            fileData = new FileReaders().readFile(fileName);
            result = operations.getHeadLines(fileData, numberOfLines);

        } catch (Exception e) {
            System.err.println("Something went wrong");
        }
        System.out.println(result);
    }
}