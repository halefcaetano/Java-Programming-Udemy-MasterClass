public class test {
    public static void main(String[] args) {
        int number = 0;
        while (number < 15){
            number ++;
            if(number <= 5){
                System.out.println("skip " + number);
                continue;
            }
            System.out.println("number " + number);
            if (number >= 10){
                System.out.println("breaking " + number);
                break;
            }
        }
    }
}
