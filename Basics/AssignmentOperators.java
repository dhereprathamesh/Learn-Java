public class AssignmentOperators {
    public static void main(String[] args) {
        // Declaring variables
        int a = 10;
        int b = 5;

        // Simple assignment (=)
        a = b;
        System.out.println("a = b: " + a); 

        // Add and assign (+=)
        a += 3; // a = a + 3
        System.out.println("a += 3: " + a); 

        // Subtract and assign (-=)
        a -= 2; // a = a - 2
        System.out.println("a -= 2: " + a); 

        // Multiply and assign (*=)
        a *= 4; // a = a * 4
        System.out.println("a *= 4: " + a); 

        // Divide and assign (/=)
        a /= 6; // a = a / 6
        System.out.println("a /= 6: " + a);

        // Modulus and assign (%=)
        a %= 3; // a = a % 3
        System.out.println("a %= 3: " + a); 
    }
}
