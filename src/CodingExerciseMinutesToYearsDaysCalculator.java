/**
 * @author Ian Gumilang
 */
public class CodingExerciseMinutesToYearsDaysCalculator
{
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void printYearsAndDays(long minutes)
    {
        if(minutes < 0){
            System.out.println(INVALID_VALUE_MESSAGE);
        }else{
            long hours = minutes / 60;
            long day = hours / 24;
            long YY = day / 365;

            long ZZ = day % 365;

            String result = minutes + " min = " + YY + " y and " + ZZ + " d";

            System.out.println(result);
        }
    }

    public static void main(String[] args)
    {
        printYearsAndDays(561600);
    }
}
