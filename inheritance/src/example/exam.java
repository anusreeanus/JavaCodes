package example;

public class exam{
    int n;  // Class-level variable 'n'

    public void printPattern() {
        int k = n;  // Initialize 'k' before the loop
        for (int row = 1; row <= n; row++) {
            int value = row;
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(value + " ");
                value = value + k--;
            }
            System.out.println();  // Move to the next line after each row
            k = n;  // Reset 'k' after each row
        }
    }

    public static void main(String[] args) {
        exam obj = new exam();
        obj.n = 5;  // Set 'n' value
        obj.printPattern();  // Call the method to print the pattern
    }
}
