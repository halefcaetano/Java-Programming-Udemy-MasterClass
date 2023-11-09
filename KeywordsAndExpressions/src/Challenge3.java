public class Challenge3 {
    public static void main(String[] args) {
        System.out.println (calculateHighScorePosition(1500));
        System.out.println (calculateHighScorePosition(1000));
        System.out.println (calculateHighScorePosition(500));
        System.out.println (calculateHighScorePosition(100));
        System.out.println (calculateHighScorePosition(25));

    }
    public static int calculateHighScorePosition (int score){
        int result;
        if (score >= 1000){
            result = 1;
        }else if ((score >= 500) && (score < 1000)){
            result = 2;
        }else if ((score >= 100) && (score < 500)){
            result = 3;
        }else{
            result = 4;
        }
        return result;
    }
}
