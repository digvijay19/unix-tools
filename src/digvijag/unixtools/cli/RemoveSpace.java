package digvijag.unixtools.cli;

import digvijag.filesystem.MyFileReader;
import digvijag.unixtools.lib.SpaceRemover;

public class RemoveSpace {
    public static void main(String[] args) {
        String fileName, fileData = "";
        MyFileReader rf = new MyFileReader();
        try {
            fileName = args[0];
            fileData = rf.readFile(fileName);
        } catch (Exception e) {
            System.err.println("SomeThing went Wrong");
        }
        SpaceRemover spaceRemover = new SpaceRemover();
        System.out.println(spaceRemover.removeExtraSpaces(fileData));
    }
}