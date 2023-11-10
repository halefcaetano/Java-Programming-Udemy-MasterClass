public class Challenge6 {
    public static void main(String[] args) {
        sumDigits(9);

    }
    public static int sumDigits(int number){
        int sum = 0;
        if (number < 0){
            return -1;
        }else{
            if (number >= 1000){
                int thousand = number /1000;
                int firstHundred = (number % 1000);
                int hundred = firstHundred / 100;
                int firstTen = (firstHundred % 100);
                int ten = firstTen / 10;
                int unit = firstTen % 10;
                System.out.println(thousand + hundred + ten + unit);
                sum = thousand + hundred + ten + unit;
            }else if (number >= 100 && number < 1000){
                int hundred = number / 100;
                int firstTen = (number % 100);
                int ten = firstTen / 10;
                int unit = firstTen % 10;
                System.out.println(hundred + ten + unit);
                sum = hundred + ten + unit;
            }else {
                int ten = number / 10;
                int unit = number % 10;
                System.out.println(ten + unit);
                sum = ten + unit;
            }
        }
        return sum;
    }
}
