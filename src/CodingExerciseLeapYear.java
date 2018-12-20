/**
 * @author Ian Gumilang
 */
public class CodingExerciseLeapYear
{
    public static boolean isLeapYear(int year){
        boolean result = false;

        if(year>=1 && year<=9999){
            int divisibleByFour = year % 4;
            int divisibleByHundred = year % 100;
            int divisibleByFourHundred = year % 400;

            if(divisibleByFour == 0){
                if(divisibleByHundred == 0){
                    result = false;

                    if(divisibleByFourHundred == 0){
                        result = true;
                    }
                }else{
                    result = true;
                }
            }else if (divisibleByFourHundred == 0){
                result = true;
            }
        }else{
            result = false;
        }

        return result;
    }

    public static void main(String[] args)
    {
        System.out.println(String.valueOf(isLeapYear(1924)));
    }
}
