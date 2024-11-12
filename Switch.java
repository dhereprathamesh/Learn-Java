public class Switch {
    public static void main(String[] args) {
        char grade = 'A';
        
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good!");
                break;
            case 'C':
                System.out.println("Needs Improvement.");
                break;
            default:
                System.out.println("Invalid grade.");
        }
    }
}
