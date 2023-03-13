package exceptionHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountFile {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java YourProgram fileName");
            System.exit(1);
        }

        String fileName = args[0];

        File file = new File(fileName);
        Scanner input = null;
        try {
            input = new Scanner(file);
        } catch (FileNotFoundException ex) {
            System.out.println("File wasn't found: " + fileName);
            System.exit(2);
        }
        int wordCnt = 0;
        int lineCnt = 0;
        int characterCnt = 0;
       
        while (input.hasNextLine()) {
            String line = input.nextLine();
            characterCnt += line.length();
            String[] words = line.split("\\s+");
            wordCnt += words.length;
            lineCnt++;
        }

        input.close();

        System.out.println("This fil: " + fileName + ", has");
        System.out.println(characterCnt + " characters");
        System.out.println(wordCnt + " words");
        System.out.println(lineCnt + " lines");
        input.close();
    }
}
