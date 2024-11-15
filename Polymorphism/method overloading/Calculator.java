
//Compile-Time Polymorphism (Method Overloading)
class Calculator {
    // Method to add two numbers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three numbers
	
    int add(int a, int b, int c) {
        return a + b + c;
    }



    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Call the overloaded methods
        System.out.println("Sum of two numbers: " + calc.add(5, 10)); // Sum of two numbers: 15
        System.out.println("Sum of three numbers: " + calc.add(5, 10, 15)); // Sum of three numbers: 30
    }
}
