/**
 * @author Ian Gumilang
 */
public class CodingExerciseBarkingDog
{
    public static boolean bark(boolean barking, int hourOfDay){
        boolean result = false;

        if(hourOfDay > 23 || hourOfDay < 0){
            result = false;
        }else{
            if(barking){
                if(hourOfDay<8 || hourOfDay>22){
                    result = true;
                }
            }else{
                result = false;
            }
        }

        return result;
    }

    public static void main(String[] args)
    {
        boolean result = bark(true, -1);

        System.out.println(String.valueOf(result));
    }
}
