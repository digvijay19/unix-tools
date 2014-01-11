package digvijag.filesystem;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaders {
    public String readFile(String fileName) {
        String fileData = "";
        try {
            BufferedReader br = new BufferedReader(new java.io.FileReader(fileName));
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                fileData += "\r\n" + currentLine;
            }
        } catch (Exception e) {
            System.err.println("File not Found");
        }
        return fileData.trim();
    }
}