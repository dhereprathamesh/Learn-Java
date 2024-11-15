class Car {
    // Private fields (hidden from outside access)
    private String model;
    private int speed;
    private boolean engineStatus;

    // Constructor to initialize the car details
    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
        this.engineStatus = false; // Engine is initially off
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Getter for speed
    public int getSpeed() {
        return speed;
    }

    // Getter for engine status
    public boolean isEngineOn() {
        return engineStatus;
    }

    // Method to start the car engine
    public void startEngine() {
        if (!engineStatus) {
            engineStatus = true;
            System.out.println("The engine has started.");
        } else {
            System.out.println("The engine is already running.");
        }
    }

    // Method to stop the car engine
    public void stopEngine() {
        if (engineStatus) {
            engineStatus = false;
            System.out.println("The engine has stopped.");
        } else {
            System.out.println("The engine is already off.");
        }
    }

    // Method to accelerate the car
    public void accelerate(int increase) {
        if (engineStatus) {
            if (increase > 0) {
                speed += increase;
                System.out.println("The car accelerates by " + increase + " km/h. Current speed: " + speed + " km/h.");
            } else {
                System.out.println("Invalid speed increase.");
            }
        } else {
            System.out.println("Can't accelerate. The engine is off.");
        }
    }

    // Method to decelerate the car
    public void decelerate(int decrease) {
        if (engineStatus) {
            if (decrease > 0 && speed - decrease >= 0) {
                speed -= decrease;
                System.out.println("The car decelerates by " + decrease + " km/h. Current speed: " + speed + " km/h.");
            } else {
                System.out.println("Invalid speed decrease.");
            }
        } else {
            System.out.println("Can't decelerate. The engine is off.");
        }
    }
}

 class Main {
    public static void main(String[] args) {
        // Creating an object of Car
        Car myCar = new Car("Toyota Corolla", 0);

        // Accessing public methods (getters) to view the state of the car
        System.out.println("Car Model: " + myCar.getModel());
        System.out.println("Car Speed: " + myCar.getSpeed() + " km/h");
        System.out.println("Engine On: " + myCar.isEngineOn());

        // Starting the engine
        myCar.startEngine();

        // Accelerating the car
        myCar.accelerate(50); 

        // Decelerating the car
        myCar.decelerate(20); 

        // Stopping the engine
        myCar.stopEngine(); 
    }
}
