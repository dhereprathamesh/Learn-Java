
class Vehicle {
    int maxSpeed;
    String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
        System.out.println("Vehicle Constructor called.");
    }

   
    public void displayDetails() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}


class Car extends Vehicle {
    String carBrand;
    int numberOfSeats;

    public Car(int maxSpeed, String fuelType, String carBrand, int numberOfSeats) {
        
        super(maxSpeed, fuelType);

        this.carBrand = carBrand;
        this.numberOfSeats = numberOfSeats;
        System.out.println("Car Constructor called.");
    }

    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Car Brand: " + carBrand);
        System.out.println("Number of Seats: " + numberOfSeats);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Car car = new Car(200, "Petrol", "Toyota", 5);

     
        car.displayDetails();
    }
}
