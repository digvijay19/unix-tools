package digvijag.unixtools.cli;

import digvijag.filesystem.MyFileReader;
import digvijag.unixtools.lib.HeadTailArgumentHandler;
import digvijag.unixtools.lib.Tail;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class TailClient {
    public static void main(String[] args) {
        String fileName = "", fileData, result;
        Tail operations = new Tail();
        HeadTailArgumentHandler headTailArgumentHandler = new HeadTailArgumentHandler();
        int numberOfLines;
        InputStream inputStream;
        Properties properties = new Properties();
        try{
            inputStream = new FileInputStream(System.getenv("UNIX_TOOLS") + "/lib/config.properties");
            properties.load(inputStream);
            numberOfLines = Integer.parseInt(properties.getProperty("default.tail.lines"));

        }catch (Exception e){
            numberOfLines = 10;
        }
        try {
            fileName = headTailArgumentHandler.getFileName(args);
            numberOfLines = headTailArgumentHandler.getNumberOfLines(args, numberOfLines);
            fileData = new MyFileReader().readFile(fileName);
            result = operations.getTailLines(fileData, numberOfLines);
        } catch (NullPointerException e) {
            System.err.println("Please specify a filename");
            return;
        } catch (NumberFormatException e) {
            System.err.println("Please give proper number of Lines");
            return;
        } catch (Exception e) {
            System.err.println("tail :" + fileName + " : No such file or directory");
            return;
        }
        System.out.println(result);
    }
}
