public class Challenge2 {
    public static void main(String[] args) {
        printDayOfWeek(6);
    }
    public static void printDayOfWeek(int day){
        String dayOfWeek =
        switch(day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wed";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
        System.out.println(dayOfWeek);
    }
}
