package digvijag.unixtools.cli;

import digvijag.filesystem.MyFileReader;
import digvijag.unixtools.lib.WC;
import digvijag.unixtools.lib.WcArgumentsHandler;

import java.io.File;
import java.io.FileNotFoundException;

public class WcClient {
    static public void main(String[] args) throws Exception {
        MyFileReader rf = new MyFileReader();
        File file;
        String fileData, fileName;
        WcArgumentsHandler wcArgumentsHandler = new WcArgumentsHandler();
        fileName = wcArgumentsHandler.getFileName(args);
        try {
            file = new File(fileName);
            fileData = rf.readFile(fileName);
        } catch (NullPointerException e) {
            System.err.println("Unable to get filename.");
            return;
        } catch (FileNotFoundException e) {
            System.err.println("No such File present");
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