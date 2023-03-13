import java.io.*;
import java.util.*;

public class Rucksack2 {
    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));

        int sum = 0;
        String rs1, rs2, rs3;
        while ((rs1 = reader.readLine()) != null && (rs2 = reader.readLine()) != null && (rs3 = reader.readLine()) != null) {
            Set<Character> Set = new HashSet<>();
            for (char c : rs1.toCharArray()) {
            	Set.add(c);
            }
            for (char c : rs2.toCharArray()) {
            	Set.add(c);
            }
            for (char c : rs3.toCharArray()) {
            	Set.add(c);
            }
            char otr = ' ';
            for (char c : Set) {
                if (rs1.indexOf(c) != -1 && rs2.indexOf(c) != -1 && rs3.indexOf(c) != -1) {
                	otr = c;
                    break;
                }
            }
            int priority = (int)otr - (Character.isLowerCase(otr) ? 'a' : 'A' - 26);
            sum += priority;
        }
        reader.close();
        System.out.println(sum);
    }
}