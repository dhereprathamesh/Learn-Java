public class BreakContinue {
    public static void main(String[] args) {
        // Example with break
        System.out.println("Using break:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // Exit the loop when i equals 3
            }
            System.out.println(i);
        }
        
        // Example with continue
        System.out.println("Using continue:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Skip the iteration when i equals 3
            }
            System.out.println(i);
        }
    }
}
