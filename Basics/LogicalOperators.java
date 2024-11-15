public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("a && b: " + (a && b)); // false because b is false

        System.out.println("a || b: " + (a || b)); // true because a is true


        System.out.println("!a: " + !a); // false because a is true


        int x = 10;
        int y = 20;

        if (x < y && a) {
            System.out.println("x is less than y AND a is true.");
        }

        if (x > y || b) {
            System.out.println("Either x is greater than y OR b is true.");
        }

        if (!(x > y)) {
            System.out.println("x is NOT greater than y.");
        }
    }
}
