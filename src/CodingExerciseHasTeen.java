/**
 * @author Ian Gumilang
 */
public class CodingExerciseHasTeen
{
    public static boolean hasTeen(int firstParam, int secondParam, int thirdParam)
    {
        boolean result = false;

        if ((firstParam >= 13 && firstParam <= 19) || (secondParam >= 13 && secondParam <= 19) || (thirdParam >= 13 && thirdParam <= 19))
        {
            result = true;
        }

        return result;
    }

}
