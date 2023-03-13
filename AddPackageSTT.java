package exceptionHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
//edhe kte tbh

public class AddPackageSTT {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java YourProgram srcRootDirectory");
            System.exit(1);
        }

        String srcRootDirectory = args[0];

        for (int i = 1; i <= 34; i++) {
            String chapterDirectory = srcRootDirectory + "/chapter" + i;
            File directory = new File(chapterDirectory);

            if (directory.exists()) {
                processDirectory(directory);
            } else {
                System.out.println("Directory not found: " + chapterDirectory);
            }
        }
    }

    public static void processDirectory(File directory) {
        // Get the list of files in the directory
        File[] files = directory.listFiles();

        // Process each file
        for (File file : files) {
            if (file.isDirectory()) {
                processDirectory(file);
            } else if (file.isFile() && file.getName().endsWith(".java")) {
                insertPackageStatement(file, "package chapter" + directory.getName().substring(8) + ";");
            }
        }
    }

    public static void insertPackageStatement(File file, String packageStatement) {
        Scanner input = null;
        PrintWriter output = null;
        try {
            input = new Scanner(file);
            output = new PrintWriter(file);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            return;
        }

        output.println(packageStatement);

        while (input.hasNextLine()) {
            output.println(input.nextLine());
        }

        input.close();
        output.close();
    }
}
