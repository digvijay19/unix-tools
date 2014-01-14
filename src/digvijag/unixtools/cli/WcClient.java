package digvijag.unixtools.cli;

import digvijag.filesystem.MyFileReader;
import digvijag.unixtools.lib.WC;

import java.io.File;

public class WcClient {
    static public void main(String[] fileNames) {
        MyFileReader rf = new MyFileReader();
        File file;
        String fileData;
        try {
            file = new File(fileNames[0]);
            fileData = rf.readFile(fileNames[0]);
        } catch (Exception e) {
            System.err.println("File not Found");
            return;
        }
        WC wc = new WC(fileData);
        int totalChars, totalLines, totalWords;
        totalChars = wc.countChars();
        totalLines = wc.countLines();
        totalWords = wc.countWords();
        System.out.println(totalLines + "\t" + totalWords + "\t" + totalChars + "\t" + file.getName());
    }
}