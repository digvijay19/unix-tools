package digvijag.unixtools;

import digvijag.filesystem.ReadFile;

public class Uniq {
    public static void main(String[] args) {
        String fileName, fileData = "";
        ReadFile rf = new ReadFile();
        String[] lines = {};
        try {
            fileName = args[0];
            fileData = rf.readFile(fileName);
        } catch (Exception e) {
            System.err.println("SomeThing went Wrong");
        }
        lines = fileData.split("\r\n");
        System.out.println(lines[0]);
        for (int i = 1; i < lines.length; i++) {
            if (!lines[i].equals(lines[i - 1])) {
                System.out.println(lines[i]);
            }
        }
    }
}