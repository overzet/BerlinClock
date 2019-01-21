package be.intec.berlinclock;

public class BerlinClock {
    public static String getTime(String time) {
        if (!time.matches("\\d\\d:\\d\\d:\\d\\d")) {
            throw new IllegalArgumentException("Time must be in the format HH:MM:SS");
        }

        StringBuilder timeSB = new StringBuilder();
        String[] timeElements = time.split(":");


        timeSB.append(new Second().getLamps(Integer.parseInt(timeElements[2]))).append("\n");
        timeSB.append(new Hour().getLamps(Integer.parseInt(timeElements[0]))).append("\n");
        timeSB.append(new Minute().getLamps(Integer.parseInt(timeElements[1]))).append("\n");

        return timeSB.toString();
    }
}