public class Challenge1 {
    public static void main(String[] args) {
        double variable1 = 20.00d;
        double variable2 = 80.00d;
        double result = (variable1 + variable2) * 100;
        System.out.println(result);
        double result2 = result % 40.00d;
        System.out.println(result2);
        boolean check = (result2 == 0) ? true : false;
        System.out.println(check);
        String check2 = (!check) ? "got some remainder" : "" ;
        System.out.println(check2);

    }
}
