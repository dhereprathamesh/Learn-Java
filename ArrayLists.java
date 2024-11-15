import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> fruits = new ArrayList<>();
        
    
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

 
        System.out.println("First fruit: " + fruits.get(0));

     
        fruits.set(1, "Blueberry");

        fruits.remove(2);

     
        System.out.println("Fruits list: " + fruits);
    }
}
