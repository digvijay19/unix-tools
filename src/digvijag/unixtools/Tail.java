package digvijag.unixtools;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Tail {
    public static void main(String[] args) {
        String fileName;
        ArrayList result = new ArrayList();
        try {
            fileName = args[0];
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                result.add(currentLine);
            }
        } catch (Exception e) {
            System.err.println("Something went wrong");
        }
        int length = result.size();
        for (int i = length-10; i < length; i++) {
            System.out.println(result.get(i));
        }
    }
}
