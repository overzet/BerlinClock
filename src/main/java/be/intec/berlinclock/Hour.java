package be.intec.berlinclock;

public class Hour implements TimeUnit {

    private static final String ALL_LIGHTS_OFF = "OOOO";
    private static final String RED_LIGHT = "R";
    private static final int MULTIPLE_OF_FIVE = 5;

    @Override
    public String getLamps(int hrs) {

        return getLampsForHoursMultiplesOfFive(hrs) + "\n" + getLampsForSingleHours(hrs);
    }

    public String getLampsForHoursMultiplesOfFive(int hours) {

        StringBuilder lamps = new StringBuilder(ALL_LIGHTS_OFF);

        for (int i = 0; i < (hours / MULTIPLE_OF_FIVE); i++) {
            lamps.replace(i, i + 1, RED_LIGHT);
        }
        return lamps.toString();
    }

    public String getLampsForSingleHours(int hours) {

        StringBuilder lamps = new StringBuilder(ALL_LIGHTS_OFF);

        for (int i = 0; i < (hours % MULTIPLE_OF_FIVE); i++) {  //dont do calculaion ever loop, do outside loop
            lamps.replace(i, i + 1, RED_LIGHT);
        }
        return lamps.toString();
    }
}
