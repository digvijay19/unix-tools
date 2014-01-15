package digvijag.unixtools.cli;

import digvijag.filesystem.MyFileReader;
import digvijag.unixtools.lib.WC;
import digvijag.unixtools.lib.WcArgumentsHandler;

import java.io.File;

public class WcClient {
    static public void main(String[] args) {
        MyFileReader rf = new MyFileReader();
        File file;
        String fileData,fileName;
        WcArgumentsHandler wcArgumentsHandler = new WcArgumentsHandler();
        fileName = wcArgumentsHandler.getFileName(args);
        file = new File(fileName);
        fileData = rf.readFile(fileName);
        WC wc = new WC(fileData);
        int totalChars, totalLines, totalWords;
        totalChars = wc.countChars();
        totalLines = wc.countLines();
        totalWords = wc.countWords();
        System.out.println(totalLines + "\t" + totalWords + "\t" + totalChars + "\t" + file.getName());
    }
}