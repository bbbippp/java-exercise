/**
 * @author Ian Gumilang
 */
public class CodingExercisePlayingCat
{
    public static boolean isCatPlaying(boolean summer, int temperature)
    {
        int firstBetween = 25;
        int secondBetween = 35;

        if(summer)
        {
            secondBetween = 45;
        }

        return temperature >= firstBetween && temperature <= secondBetween;
    }

    public static void main(String[] args)
    {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }
}
