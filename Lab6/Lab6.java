import javax.swing.*;
public class Lab6 {
    public static void main(String[] args) {
        int[] intArray = new int[100]; // Array to hold ints
        int lengthFilled = inputFromFile(args[0], intArray); // Read ints from file into array

        int sum = sum(intArray, lengthFilled);
        JOptionPane.showMessageDialog(null, "The sum of the integers is: " + sum);

        int avg = average(intArray, lengthFilled);
        JOptionPane.showMessageDialog(null, "The average of the integers is: " + avg);
    }

    
    private static int inputFromFile(String filename, int[] nums) {
        TextFileInput in = new TextFileInput(filename);
        int lengthFilled = 0;
        String line = in.readLine();
        
        while (lengthFilled < nums.length && line != null) {
            nums[lengthFilled++] = Integer.parseInt(line.trim()); ; 
            line = in.readLine();
        }
        in.close();
        return lengthFilled; 
    }

    // Method to check if a word exists in the array
    public static boolean wordIsThere(String findMe, String[] theList, int lengthFilled) {
        for (int i = 0; i < lengthFilled; i++) {
            if (theList[i].equals(findMe)) {
                return true;
            }
        }
        return false;
    }
}