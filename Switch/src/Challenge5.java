public class Challenge5 {
    public static void main(String[] args) {
        int test = 5;
        while (test <= 20){
            if (isEvenNumber(test)){
                System.out.println(test);
            }
            test++;
        }

    }
    public static boolean isEvenNumber(int number){
        if (number % 2 == 0){
            return true;
        }
        return false;
    }
}
