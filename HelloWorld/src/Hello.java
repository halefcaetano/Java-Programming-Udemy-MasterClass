public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("And I'm scared of aliens");
        }
        int topScore = 80;
        if (topScore == 100){
            System.out.println("You got the high score!");
        }
        int secondTopScore = 90;
        if (topScore > secondTopScore && topScore < 100){
            System.out.println("Greater than second top score and less than 100");
        }
    }
}