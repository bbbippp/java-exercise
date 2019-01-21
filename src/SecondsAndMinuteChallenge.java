/**
 * @author Ian Gumilang
 */
public class SecondsAndMinuteChallenge
{
    public static String getDuration(int minutes, int seconds)
    {
        String result = "invalid value";
        String ZZ = "00";
        String YY = "00";
        String XX = "00";

        if(minutes >= 0){
            if(seconds >=0 && seconds <=59){
                XX = String.valueOf(seconds);
                YY = String.valueOf(minutes%60);
                ZZ = String.valueOf(minutes/60);
                return ZZ + "h " + YY + "m " + XX + "s ";
            }else{
                return result;
            }
        }else{
            return result;
        }
    }

    public static String getDuration(int seconds)
    {
        String result = "invalid value";

        if(seconds >=0){
            int minutesOfSeconds = seconds/60;
            int remainingSeconds = seconds%60;

            return getDuration(minutesOfSeconds, remainingSeconds);
        }else{
            return result;
        }
    }

    public static void main(String[] args)
    {
        System.out.println(getDuration( 3685));
    }
}
