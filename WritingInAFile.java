package exceptionHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WritingInAFile {
	 public static int writeInFile(String name, File file) {
	        if (file.exists()==false) {
	            // If the file does not exist, create a new one
	            try {
	                file.createNewFile();
	            } catch (Exception ex) {
	                ex.printStackTrace();
	                return -1;
	            }
	        }

	        Scanner input = null;
	        PrintWriter output = null;
	        try {
	            input = new Scanner(file);
	            output = new PrintWriter(file);
	        } catch (FileNotFoundException ex) {
	            return -1;
	        }

	        int lineNO = 0;

	        // Read the file and search for the correct position to insert the name
	        boolean isInputted = false;
	        while (input.hasNextLine()) {
	            lineNO++;
	            String currentLine = input.nextLine();
	            if (currentLine.compareTo(name) > 0 && isInputted==false) {
	                // Insert the name at the current position
	                output.println(name);
	                isInputted = true;
	            }
	            // Write the current line back to the file
	            output.println(currentLine);
	        }

	        // If the name was not inserted yet, append it to the end of the file
	        if (isInputted==false) {
	            output.println(name);
	            lineNO++;
	        }

	        // Close the file
	        input.close();
	        output.close();

	        // Return the line number of the name
	        return lineNO;
	    }
	
}
