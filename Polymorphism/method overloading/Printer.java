
public class Printer {
    void print(String str) {
        System.out.println("Printing string: " + str);
    }

    void print(int num) {
        System.out.println("Printing integer: " + num);
    }

    
    void print(double num) {
        System.out.println("Printing double: " + num);
    }

    void print(String str, int num) {
        System.out.println("Printing string and integer: " + str + ", " + num);
    }

    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.print("Hello, World!"); 

        printer.print(42);

        printer.print(3.14); 

        printer.print("Number", 100); 
    }
}
