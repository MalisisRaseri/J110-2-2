package File;

public class Duration {
    static String timeToString(int secs){
        int hour = secs/3600,
                min = secs / 60 % 60,
                sec = secs /1 % 60;
        return String.format("%02d:%02d:%02d", hour, min, sec);

    }

}
