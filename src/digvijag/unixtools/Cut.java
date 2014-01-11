package digvijag.unixtools;

import digvijag.filesystem.ReadFile;

public class Cut {
    public static void main(String[] args) {
        ReadFile rf = new ReadFile();
        CutOperations operations = new CutOperations();
        String fileName, fileData, delimiter;
        int field = operations.getField(args);
        delimiter = operations.getDelimeter(args);
        fileName = operations.getFileName(args);
        fileData = rf.readFile(fileName);
        String lines[] = fileData.split("\r\n");
        for (String line : lines) {
            String[] fields = line.split(delimiter);
            System.out.println(fields[field]);
        }
    }
}
