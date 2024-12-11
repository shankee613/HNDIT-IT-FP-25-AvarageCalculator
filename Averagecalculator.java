package BAT_IT_2022_P_25;

public class Averagecalculator {
    
    // Method to calculate the average
    public static double calculateAverage(int[] arr) {
        // Step 1: Initialize sum to 0
        int totalSum = 0;
        
        // Step 2: Linear Search - Traverse through the array and sum the elements
        for (int num : arr) {
            totalSum += num;
        }
        
        // Step 3: Calculate the average
        return (double) totalSum / arr.length;
    }

    public static void main(String[] args) {
        // Example input
        int[] inputArray = {15, 25, 35};
        
        // Find the average
        double average = calculateAverage(inputArray);
        
        // Output the result
        System.out.println("Average = " + average);
    }
}