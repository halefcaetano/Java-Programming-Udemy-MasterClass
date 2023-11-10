public class Challenge3 {
    public static void main(String[] args) {
        System.out.println(isPrime(22));
    }
    public static boolean isPrime(int wholeNumber){
        for (int i = 2; i < wholeNumber; i++){
            if (wholeNumber % i == 0) {
               return false;
            }
        }
        return true;
    }
}
