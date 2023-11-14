import java.util.Scanner;

public class Challenge8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bigger = 0;
        int smaller = 0;
        int count = 0;
        while (true){
            System.out.print("Write a number: ");
            String nextNumber = scanner.nextLine();
            try {
                int number = Integer.parseInt(nextNumber);
                if (bigger < number || count == 0){
                    bigger = number;
                }
                if (smaller > number || count == 0){
                    smaller = number;
                }
                count++;
            } catch (NumberFormatException e) {
                break;
            }
        }
        System.out.println("Bigger number: " + bigger);
        System.out.println("Smaller number: " + smaller);
    }
}
