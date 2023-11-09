public class Challenge4 {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(5, 8));

    }
    public static double convertToCentimeters(int height){
        double result = height * 2.54;
        return result;
    }

    public static double convertToCentimeters(int heightFeet, int heightInches){
        int resultInches = heightFeet * 12;
        int result = resultInches + heightInches;
        double finalG = convertToCentimeters(result);
        return finalG;
    }


}
