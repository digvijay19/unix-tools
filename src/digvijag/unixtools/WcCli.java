package digvijag.unixtools;

import digvijag.filesystem.FileReaders;

import java.io.File;

public class WcCli {
    static public void main(String[] fileNames) {
        WcOperations wcOperations = new WcOperations();
        FileReaders rf = new FileReaders();
        File file;
        String fileData;
        try {
            file = new File(fileNames[0]);
            fileData = rf.readFile(fileNames[0]);
        } catch (Exception e) {
            System.err.println("File not Found");
            return;
        }
        int totalChars, totalLines, totalWords;
        totalChars = wcOperations.countChars(fileData);
        totalLines = wcOperations.countLines(fileData);
        totalWords = wcOperations.countWords(fileData);
        System.out.println(totalLines + "\t" + totalWords + "\t" + totalChars + "\t" + file.getName());
    }
}