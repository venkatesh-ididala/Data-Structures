import java.util.ArrayList;

public class oddpatternseries {

    public static void main(String[] args) {
        // Given series: 5, 6, 9, 14, 21

        // Generate the number series using ArrayList
        ArrayList<Integer> series = generateNumberSeries(5, 2);

        // Display the generated series
        System.out.println("Generated Number Series:");
        for (int number : series) {
            System.out.print(number + " ");
        }

        // Predict the next three numbers
        int nextIncrement = 2 + 2;  // Increment by the next odd number after 7
        predictNextNumbers(series, nextIncrement, 3);
    }

    // Function to generate the number series using ArrayList
    private static ArrayList<Integer> generateNumberSeries(int initialNumber, int increment) {
        ArrayList<Integer> series = new ArrayList<>();
        series.add(initialNumber);

        for (int i = 1; i < 5; i++) {   // Adjust the loop limit based on the series length
            initialNumber += increment;
            series.add(initialNumber);
            increment += 2;  // Increment by consecutive odd numbers
        }

        return series;
    }

    // Function to predict and display the next numbers in the series
    private static void predictNextNumbers(ArrayList<Integer> series, int nextIncrement, int numberOfPredictions) {
        System.out.println("\nPredicted Next Numbers:");
        for (int i = 0; i < numberOfPredictions; i++) {
            int lastNumber = series.get(series.size() - 1);
            int nextNumber = lastNumber + nextIncrement;
            series.add(nextNumber);
            System.out.print(nextNumber + " ");
            nextIncrement += 2;  // Increment by the next odd number
        }
    }
}

