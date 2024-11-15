public class Main {
    public static void main(String[] args) {
       

        // Example 1
        try {
            String str = null;
            System.out.println(str.length()); 
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after handling exception.");
        }

        // Example 2
        try {
            int result = 10 / 2;  // No exception here
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("This will execute after successful execution of the try block.");
        }
    }
}
