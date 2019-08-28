public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {

        long years = minutes / (365 * 24 * 60);
        long days = minutes / (24 * 60);
        long remainingDays = days % 365;

        if (minutes < 0) {
            System.out.println("Invalid value");
        } else {
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }

    }

}
