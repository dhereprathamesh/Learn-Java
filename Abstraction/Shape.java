// Abstract class
abstract class Shape {
    // Abstract method (no implementation)
    public abstract void draw();
    
    // Regular method (with implementation)
    public void area() {
        System.out.println("Calculating area...");
    }
}


class Circle extends Shape {
    // Providing implementation for the abstract method
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Rectangle extends Shape {
    // Providing implementation for the abstract method
    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

 class Main {
    public static void main(String[] args) {
        // Creating objects of the subclasses
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        
        // Calling the implemented methods
        circle.draw();  
        circle.area(); 
        
        rectangle.draw(); 
        rectangle.area(); 
    }
}
