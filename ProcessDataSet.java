package exceptionHandling;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProcessDataSet {
    public static void main(String[] args) throws IOException{
        try {BufferedReader reader = new BufferedReader(new FileReader("Salary.txt"));
       

        int assistantProfCnt = 0;
        double assistantProfTotalSalary = 0.0;
        double assistantProfAvgSalary = 0.0;

        int associateProfCnt = 0;
        double associateProfTotalSalary = 0.0;
        double associateProfAvgSalary = 0.0;

        int fullProfCnt = 0;
        double fullProfTotalSalary = 0.0;
        double fullProfAvgSalary = 0.0;

        int facultyCount = 0;
        double facultyTotalSalary = 0.0;
        double facultyAverageSalary = 0.0;

        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String rank = parts[2];
            double salary = Double.parseDouble(parts[3]);

            if (rank.equals("Assistant Professor")) {
            	assistantProfCnt++;
            	assistantProfTotalSalary += salary;
            } else if (rank.equals("Associate Professor")) {
            	associateProfCnt++;
            	associateProfTotalSalary += salary;
            } else if (rank.equals("Full Professor")) {
            	fullProfCnt++;
                fullProfTotalSalary += salary;
            }
            facultyCount++;
            facultyTotalSalary += salary;
        
        }

        assistantProfAvgSalary = assistantProfTotalSalary / assistantProfCnt;
        associateProfAvgSalary = associateProfTotalSalary / associateProfCnt;
        fullProfAvgSalary = fullProfTotalSalary / fullProfCnt;
        facultyAverageSalary = facultyTotalSalary / facultyCount;

        System.out.println("Total salary for assistant professors: " + assistantProfTotalSalary);
        System.out.println("Average salary for assistant professors: " + assistantProfAvgSalary);
        System.out.println("Total salary for associate professors: " + associateProfTotalSalary );
        System.out.println("Average salary for associate professors: " + associateProfAvgSalary);
        System.out.println("Total salary for full professors: " + fullProfTotalSalary);
        System.out.println("Average salary for full professors: " + fullProfAvgSalary);
        System.out.println("Total salary for faculty: " + facultyTotalSalary);
        System.out.println("Average salary for faculty: " + facultyAverageSalary);
        reader.close();
        }
        catch (FileNotFoundException e)
        {
        	e.printStackTrace();
        }
    }
}
