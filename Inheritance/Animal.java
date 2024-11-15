
class Animal {
    String species;
    String habitat;


    public Animal(String species, String habitat) {
        this.species = species;
        this.habitat = habitat;
        System.out.println("Animal Constructor called.");
    }


    public void displayInfo() {
        System.out.println("Species: " + species);
        System.out.println("Habitat: " + habitat);
    }
}

class Dog extends Animal {
    String breed;
    String name;

   
    public Dog(String species, String habitat, String breed, String name) {
        
        super(species, habitat);


        this.breed = breed;
        this.name = name;
        System.out.println("Dog Constructor called.");
    }

 
    @Override
    public void displayInfo() {
        super.displayInfo();

        System.out.println("Breed: " + breed);
        System.out.println("Name: " + name);
    }

    public void bark() {
        System.out.println(name + " is barking!");
    }
}

public class InheritanceExample2 {
    public static void main(String[] args) {
        Dog dog = new Dog("Mammal", "Domestic", "Golden Retriever", "Buddy");

       
        dog.displayInfo();

  
        dog.bark();
    }
}
