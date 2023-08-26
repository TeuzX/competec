import java.util.Scanner;

public class string1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTestCases = scanner.nextInt(); 

        for (int i = 0; i < numTestCases; i++) {
            String genes = scanner.next(); 
            char letterToAnalyze = scanner.next().charAt(0); 

            int occurrenceCount = countOccurrences(genes, letterToAnalyze);
            System.out.println("Caso #" + (i + 1) + ": " + occurrenceCount);
        }

        scanner.close();
    }

    private static int countOccurrences(String genes, char letter) {
        int count = 0;

        for (int i = 0; i < genes.length(); i++) {
            if (genes.charAt(i) == letter) {
                count++;
            }
        }

        return count;
    }
}
