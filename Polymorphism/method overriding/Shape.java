
class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}


class Circle extends Shape {
    @Override
    void display() {
        System.out.println("This is a Circle");
    }
}


class Rectangle extends Shape {
    @Override
    void display() {
        System.out.println("This is a Rectangle");
    }
}

class Main {
    public static void main(String[] args) {
        // Using polymorphism
        Shape myShape = new Shape();
        Shape myCircle = new Circle();
        Shape myRectangle = new Rectangle();

        // Call the display method on different objects
        myShape.display();    
        myCircle.display();   
        myRectangle.display();  
    }
}
