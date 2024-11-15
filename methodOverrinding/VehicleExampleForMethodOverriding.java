
class VehicleExampleForMethodOverriding {
    public void start() {
        // Overridden method
        System.out.println("Vehicle is starting...");
    }



class Car extends VehicleExampleForMethodOverriding {
    @Override
    public void start() {
        // Overriding method
        System.out.println("Car is starting with key...");
    };
}


    public static void main(String[] args) {
        // Parent reference pointing to a Parent object
        VehicleExampleForMethodOverriding vehicle = new VehicleExampleForMethodOverriding();
        vehicle.start(); // Calls the start() method of Vehicle

       
    }

}