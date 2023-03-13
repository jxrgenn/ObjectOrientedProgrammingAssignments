package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {
    public static int readInFile(String line, File file) {
        if (file.exists()==false) {
            return -1;
        }

        Scanner input = null;
        try {
            input = new Scanner(file);
        } catch (FileNotFoundException ex) {
            return -1;
        }

        int lineNO = 0;

        while (input.hasNextLine()) {
            lineNO++;
            String currentLine = input.nextLine();
            if (currentLine.equals(line)) {
                input.close();
                return lineNO;
            }
        }

        input.close();
        return -1;
    }
}