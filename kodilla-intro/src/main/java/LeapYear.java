public class LeapYear {
    public static void main(String[] args) {
        int year = 2000;
        String test = isItLeapYear(year);
        System.out.println(test);
    }

    private static String isItLeapYear(int a) {
        String leapYear = "This is leap year.";
        String notLeapYear = "This is not leap year.";

        if (a % 4 != 0) {
            return notLeapYear;
        }
        else if (a % 100 != 0) {
            return leapYear;
        }
        else if (a % 400 != 0) {
            return notLeapYear;
        }
        else {
            return leapYear;
            }
        }
}
