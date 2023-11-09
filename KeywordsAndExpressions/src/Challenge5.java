public class Challenge5 {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
    }
    public static String getDurationString(int seconds){
        if (seconds >= 0) {
            int minutes = seconds / 60;
            return getDurationString(minutes, seconds % 60);
        }else{
            return "Invalid number";
        }
    }

    public static String getDurationString(int minutes, int seconds){
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            int remainingSeconds = seconds % 60;
            return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
        }else{
            return "Invalid number";
        }
    }
}
