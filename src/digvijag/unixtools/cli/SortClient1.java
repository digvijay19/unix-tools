package digvijag.unixtools.cli;

import digvijag.filesystem.MyFileReader;
import digvijag.unixtools.lib.Sort;

public class SortClient1 {
    static public void main(String[] fileNames) {
        MyFileReader rf = new MyFileReader();
        String fileData;
        try {
            fileData = rf.readFile(fileNames[0]);
        } catch (Exception e) {
            System.err.println("File not Found");
            return;
        }
        Sort sort = new Sort();
        System.out.println(sort.sortData(fileData));
    }
}
