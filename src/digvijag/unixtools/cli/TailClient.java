package digvijag.unixtools.cli;

import digvijag.filesystem.MyFileReader;
import digvijag.unixtools.lib.HeadTailArgumentHandler;
import digvijag.unixtools.lib.Tail;

public class TailClient {
    public static void main(String[] args) {
        String fileName = "", fileData, result;
        Tail operations = new Tail();
        HeadTailArgumentHandler headTailArgumentHandler = new HeadTailArgumentHandler();
        int numberOfLines;

        try {
            fileName = headTailArgumentHandler.getFileName(args);
            numberOfLines = headTailArgumentHandler.getNumberOfLines(args);
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
