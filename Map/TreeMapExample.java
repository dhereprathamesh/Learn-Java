import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
        
        // Adding elements
        map.put("Apple", "Fruit");
        map.put("Carrot", "Vegetable");
        map.put("Mango", "Fruit");
        map.put("Cucumber", "Vegetable");
        
        // Displaying the map (sorted order by key)
        System.out.println("TreeMap: " + map);
        
        // Accessing a value by key
        System.out.println("The category of Apple: " + map.get("Apple"));
        
        // Checking if a key exists
        System.out.println("Contains 'Banana' key: " + map.containsKey("Banana"));
    }
}
