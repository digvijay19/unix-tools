package digvijag.unixtools;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Head {
    public static void main(String[] args) {
        String fileName;
        ArrayList<String> result = new ArrayList<String>();
        try {
            fileName = args[0];
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String currentLine;
            int i = 0;
            while ((currentLine = br.readLine()) != null && i<10) {
                result.add(currentLine);
                i++;
            }
        } catch (Exception e) {
            System.err.println("Something went wrong");
        }
        for (String line : result) {
            System.out.println(line);
        }
    }
}
