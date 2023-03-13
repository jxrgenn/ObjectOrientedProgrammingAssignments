import java.io.*;
import java.util.*;

public class CreateRucksack {
    public static void main(String[] args) throws IOException {
        File file = new File("rucksacks.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));

        int sum = 0;
        String rucksack;
        while ((rucksack = reader.readLine()) != null) {
            String firstPart = rucksack.substring(0, rucksack.length() / 2);
            String secondPart = rucksack.substring(rucksack.length() / 2);
            Set<Character> firstSet = new HashSet<>();
            Set<Character> secondSet = new HashSet<>();
            for (char c : firstPart.toCharArray()) {
                firstSet.add(c);
            }
            for (char c : secondPart.toCharArray()) {
                secondSet.add(c);
            }
            firstSet.retainAll(secondSet);
            char itemType = firstSet.iterator().next();
            int priority = (int)itemType - (Character.isLowerCase(itemType) ? 'a' : 'A' - 26);
            sum += priority;
        }
        reader.close();
        System.out.println(sum);
    }
}
