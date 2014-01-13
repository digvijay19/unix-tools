package digvijag.filesystem;

import java.io.BufferedReader;

public class MyFileReader {
    public String readFile(String fileName) {
        StringBuilder fileData = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new java.io.FileReader(fileName));
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                fileData.append(currentLine);
                fileData.append("\r\n");
            }
        } catch (Exception e) {
            System.err.println("File not Found");
        }
        return fileData.toString().trim();
    }
}