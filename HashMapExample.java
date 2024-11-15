import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        
        // Adding elements
        map.put("Apple", "Fruit");
        map.put("Carrot", "Vegetable");
        map.put("Mango", "Fruit");
        map.put("Cucumber", "Vegetable");
        
        // Displaying the map
        System.out.println("HashMap: " + map);
        
        // Accessing a value by key
        System.out.println("The category of Apple: " + map.get("Apple"));
        
        // Checking if a key exists
        System.out.println("Contains 'Banana' key: " + map.containsKey("Banana"));
    }
}
