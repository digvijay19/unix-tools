package digvijag.unixtools;

import digvijag.filesystem.ReadFile;

public class Head {
    public static void main(String[] args) {
        String fileData, result = "";
        try {
            fileData = new ReadFile().readFile(args[0]);
            result = new HeadOperation().getHeadLines(fileData,10);

        } catch (Exception e) {
            System.err.println("Something went wrong");
        }
        System.out.println(result);
    }
}