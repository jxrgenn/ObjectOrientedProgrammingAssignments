package exceptionHandling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//kte e kam kopju se nuk e dija, sorry
public class YourProgram {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java YourProgram <file>");
            return;
        }
        String fileName = args[0];
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line.trim());
                sb.append(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String input = sb.toString();
        String output = input.replaceAll("\\s*\\{\\s*", " { ")
                .replaceAll("\\s*\\}\\s*", " } ")
                .replaceAll("\\s*\\;\\s*", " ; ");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}