import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of integers
        LinkedList<Integer> numbers = new LinkedList<>();

        // Add elements to the LinkedList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Access elements (index-based access is slower in LinkedList)
        System.out.println("First number: " + numbers.get(0));

        // Add an element at the beginning
        numbers.addFirst(5);

        // Add an element at the end
        numbers.addLast(40);

        // Remove the first element
        numbers.removeFirst();

        // Remove the last element
        numbers.removeLast();

        // Print the LinkedList
        System.out.println("Numbers list: " + numbers);
    }
}
