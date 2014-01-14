package digvijag.unixtools.cli;

import digvijag.filesystem.MyFileReader;
import digvijag.unixtools.lib.UniqOperations;

public class UniqClient {
    public static void main(String[] args) {
        String fileName, fileData = "", result;
        MyFileReader rf = new MyFileReader();
        try {
            fileName = args[0];
            fileData = rf.readFile(fileName);
        } catch (Exception e) {
            System.err.println("SomeThing went Wrong");
        }
        result = new UniqOperations().getUniqueData(fileData);
        System.out.println(result);
    }
}