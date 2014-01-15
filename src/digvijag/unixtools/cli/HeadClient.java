package digvijag.unixtools.cli;

import digvijag.filesystem.MyFileReader;
import digvijag.unixtools.lib.Head;
import digvijag.unixtools.lib.HeadTailArgumentHandler;

public class HeadClient {
    public static void main(String[] args) {
        String fileName = "", fileData, result;
        Head operations = new Head();
        HeadTailArgumentHandler headTailArgumentHandler = new HeadTailArgumentHandler();
        int numberOfLines;

        try {
            fileName = headTailArgumentHandler.getFileName(args);
            numberOfLines = headTailArgumentHandler.getNumberOfLines(args);
            fileData = new MyFileReader().readFile(fileName);
            result = operations.getHeadLines(fileData, numberOfLines);

        } catch (NullPointerException e) {
            System.err.println("Please specify a filename");
            return;
        } catch(NumberFormatException e){
            System.err.println("Please give proper number of Lines");
            return;
        } catch (Exception e) {
            System.err.println("head :"+fileName +": No such file or directory");
            return;
        }
        System.out.println(result);
    }
}