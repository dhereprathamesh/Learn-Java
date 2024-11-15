// Parent class
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound.");
    }
}

// Child class 1
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// Child class 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

 class Main {
    public static void main(String[] args) {
        // Parent class reference, child class objects
        Animal myAnimal; 

        myAnimal = new Dog();
        myAnimal.makeSound(); // Woof! Woof!

        myAnimal = new Cat();
        myAnimal.makeSound(); // Meow! Meow!
    }
}
