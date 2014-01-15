package digvijag.filesystem;

import java.io.BufferedReader;

public class MyFileReader {
    public String readFile(String fileName) throws Exception {
        StringBuilder fileData = new StringBuilder();
        BufferedReader br = new BufferedReader(new java.io.FileReader(fileName));
        String currentLine;
        while ((currentLine = br.readLine()) != null) {
            fileData.append(currentLine);
            fileData.append("\r\n");
        }
        return fileData.toString().trim();
    }
}