// Interface
interface Drawable {
    // Abstract method (no implementation)
    void draw();
}

// Class implementing the interface
class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}

// Class implementing the interface
class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

 class Main {
    public static void main(String[] args) {
        Drawable circle = new Circle();
        Drawable rectangle = new Rectangle();
        
        // Calling the implemented methods
        circle.draw(); 
        rectangle.draw(); 
    }
}
