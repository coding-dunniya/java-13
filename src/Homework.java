/**
 * A simple class to calculate the absolute value of a number
 */
public class Homework {

    /**
     * calculate the absolute value of an integer number
     *
     * @param n the integer number
     * @return absolute value of n
     */
    public static int abs(int n) {
        return n < 0 ? n * -1 : n;
    }

    /**
     * calculate the absolute value of a long number
     *
     * @param n the long number
     * @return absolute value of n
     */
    public static long abs(long n) {
        return n < 0 ? n * -1 : n;
    }

    /**
     * calculate the absolute value of a double number
     *
     * @param n the double number
     * @return absolute value of n
     */
    public static double abs(double n) {
        return n < 0 ? n * -1 : n;
    }
}
