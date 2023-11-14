import java.util.Scanner;
public class Challenge7 {
    public static void main(String[] args) {

        int i = 1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
            while(i <= 5) {
                System.out.println("Write a number #" + i + ":");
                String nextNumber = scanner.nextLine();
                try {
                    int number = Integer.parseInt(nextNumber);
                    sum += number;
                    i++;
                } catch (NumberFormatException e) {
                    System.out.println(nextNumber + "Invalid number");
                }
            }
            System.out.println(sum);
    }
}
