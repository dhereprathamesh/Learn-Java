// Creating a custom exception class by extending Exception (for checked exceptions)
class CustomException extends Exception {
    // Constructor to initialize the custom exception with a message
    public CustomException(String message) {
        super(message);  // Passing the message to the parent (Exception) class
    }
}

public class Main {

    // Method that declares it can throw a CustomException
    public static void checkAge(int age) throws CustomException {
        if (age < 18) {
            // Throwing the custom exception if age is less than 18
            throw new CustomException("Age must be 18 or older.");
        }
        System.out.println("Age is valid.");
    }

    public static void main(String[] args) {
        try {
            // Calling the method that may throw CustomException
            checkAge(15);
        } catch (CustomException e) {
            // Catching the custom exception and printing the message
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
