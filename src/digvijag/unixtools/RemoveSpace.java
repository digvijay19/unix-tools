package digvijag.unixtools;

import digvijag.filesystem.ReadFile;

public class RemoveSpace {
    public static void main(String[] args) {
        String fileName, fileData = "", result;
        ReadFile rf = new ReadFile();
        try {
            fileName = args[0];
            fileData = rf.readFile(fileName);
        } catch (Exception e) {
            System.err.println("SomeThing went Wrong");
        }
        result = fileData.replaceAll(" +", " ");
        System.out.println(result);
    }
}